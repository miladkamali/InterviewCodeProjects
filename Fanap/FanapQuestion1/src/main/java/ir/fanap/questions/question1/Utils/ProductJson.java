package ir.fanap.questions.question1.Utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ir.fanap.questions.question1.Models.Product;

import java.util.List;

public class ProductJson {
    public static List<Product> deserialize(String input){
        Gson gson = new Gson();
        List<Product> products = gson.fromJson(input, new TypeToken<List<Product>>(){}.getType());
        return products;
    }
    public static String serialize(List<Product> products){
        Gson gson = new Gson();
        String output=gson.toJson(products);
        return output;
    }
}
