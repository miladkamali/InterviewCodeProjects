package ir.fanap.questions.question1.DAO;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ir.fanap.questions.question1.Models.Product;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class ApiResource {

    private String apiAddress = "http://185.104.229.164:12561/appStore/restAPI/spring/service/getAllProducts?from=0&count=10";
    private RestTemplate rest;
    private HttpHeaders headers;

    public ApiResource() {
        this.rest = new RestTemplate();
        this.headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        headers.add("OSTYPE","MOB");
        headers.add("Accept", "*/*");
    }
    public  String getJsonFromUrl(){
        HttpEntity<String> requestEntity = new HttpEntity<String>("", headers);
        ResponseEntity<String> responseEntity = rest.exchange(apiAddress, HttpMethod.GET, requestEntity, String.class);
        return responseEntity.getBody();
    }
    public  List<Product> getProducts(){
        String input = getJsonFromUrl();
        Gson gson = new Gson();
        List<Product> products = gson.fromJson(input, new TypeToken<List<Product>>(){}.getType());
        return products;

    }
}
