package ir.fanap.questions.question1.DAO;

import ir.fanap.questions.question1.Models.Product;
import ir.fanap.questions.question1.configuration.AppSetting;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductRepositoryProxy implements ProductRepository {
    private ProductCache productCache;
    private ApiResource apiResource;
    private AppSetting appSetting;

    public ProductRepositoryProxy(ProductCache productCache, ApiResource apiResource, AppSetting appSetting) {
        this.productCache = productCache;
        this.apiResource = apiResource;
        this.appSetting = appSetting;
    }

    @Override
    public List<Product> getProducts() {
        if(productCache.isValid()){
            System.out.println("cache is valid");
            return productCache.getProducts();
        }else{
            System.out.println("cache is invalid");
            var products= apiResource.getProducts();
             productCache.updateCache(products);
             return products;
        }
    }
}
