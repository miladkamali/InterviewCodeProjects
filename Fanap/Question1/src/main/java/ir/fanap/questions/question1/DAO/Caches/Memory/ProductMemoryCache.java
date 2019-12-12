package ir.fanap.questions.question1.DAO.Caches.Memory;

import ir.fanap.questions.question1.DAO.ProductCache;
import ir.fanap.questions.question1.Models.Product;
import ir.fanap.questions.question1.configuration.AppSetting;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Profile("memory")
@Primary
public class ProductMemoryCache extends ProductCache {
    private List<Product> productCache;

    public ProductMemoryCache(AppSetting appSetting){
        super(appSetting);
    }

    @Override
    public List<Product> getProducts() {
        return new ArrayList<>(productCache);
    }

    @Override
    public void updateCache(List<Product> products) {
        this.productCache=new ArrayList<>(products);
        this.lastUpdateEpoch=System.currentTimeMillis();
    }
}
