package ir.fanap.questions.question1.DAO.Caches.Database;

import ir.fanap.questions.question1.DAO.ProductCache;
import ir.fanap.questions.question1.Models.Product;
import ir.fanap.questions.question1.configuration.AppSetting;
import ir.fanap.questions.question1.Utils.ProductJson;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
@Profile({"database","default"})
@Primary
public class ProductDataBaseCache extends ProductCache {
    private UrlResponseRepository urlResponseRepository;

    public ProductDataBaseCache(UrlResponseRepository urlResponseRepository, AppSetting appSetting ) {
        super(appSetting);
        this.urlResponseRepository = urlResponseRepository;
        Optional<UrlResponse> temp= this.urlResponseRepository.findLast();
        this.lastUpdateEpoch=temp.isPresent()? temp.get().updateTime : 0L;
    }

    @Override
    public List<Product> getProducts() {
        List<Product> emptyOutput=new ArrayList<>();
        var  output= urlResponseRepository.findLast();
        return output.isPresent() ? ProductJson.deserialize(output.get().jsonResponse)
                                    : emptyOutput ;
    }

    @Override
    public void updateCache(List<Product> products) {
        UrlResponse temp = new UrlResponse();
        temp.jsonResponse=ProductJson.serialize(products);
        temp.updateTime=System.currentTimeMillis();
        lastUpdateEpoch=temp.updateTime;
        urlResponseRepository.save(temp);
    }
}
