package com.msushma.ecommerce.Controller;
import com.msushma.ecommerce.Model.Product;
import com.msushma.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/products")
public class ProductController{
    @Autowired
    private ProductService productService;
    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);

    }
    @GetMapping("/all")
    public List< Product> getAllProducts(){
        return productService.getAllProducts();
    }
}