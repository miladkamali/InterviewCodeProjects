package ir.fanap.questions.question1.DAO;

import ir.fanap.questions.question1.Models.Product;
import ir.fanap.questions.question1.configuration.AppSetting;

import java.util.List;

public abstract class ProductCache {
    protected long lastUpdateEpoch;
    private AppSetting appSetting;

    public ProductCache(AppSetting appSetting) {
        this.appSetting = appSetting;
    }

    public boolean isValid(){
        return System.currentTimeMillis()>(lastUpdateEpoch+appSetting.cacheTimeout)? false:true;
    }
    public abstract List<Product> getProducts();
    public abstract void updateCache(List<Product> products);
}
