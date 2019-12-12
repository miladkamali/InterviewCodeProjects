package ir.fanap.questions.question1.DAO;

import ir.fanap.questions.question1.Models.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> getProducts();
}
