package ir.fanap.questions.question1.Controller;

import ir.fanap.questions.question1.DAO.ProductRepository;
import ir.fanap.questions.question1.Models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductsController {

    private ProductRepository productRepository;

    public ProductsController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/api/products")
    public List<Product> getAllProducts(){
        return productRepository.getProducts();
    }
}
