package ir.fanap.questions.question1.Utils;

import ir.fanap.questions.question1.DAO.ApiResource;
import ir.fanap.questions.question1.Models.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * These were not meant to be proper test only steps in getting the right behavior while
 * avoiding constant main function changing.
 */
class ProductJsonTest {
    String serialized;
    List<Product> productList;
    void initialize(){
        ApiResource apiResource = new ApiResource();
        productList= apiResource.getProducts();
        serialized=ProductJson.serialize(productList);
    }

//    @Test
//    void deserialize() {
//        initialize();
//        Assertions.assertNotEquals(0,productList.size());
//        String tempSerialized=ProductJson.serialize(productList);
//        System.out.println("serialized:\n\n"+tempSerialized);
//    }
//
//    @Test
//    void serialize() {
//        initialize();
//        String products= ProductJson.serialize(productList);
//        System.out.println(products);
//        Assertions.assertEquals(products,serialized);
//    }

}