package com.msushma.ecommerce.service;
import com.msushma.ecommerce.Model.Product;
import com.msushma.ecommerce.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ProductService{
    @Autowired
    private ProductRepository productRepository;
    public Product addProduct(Product product){
        return productRepository.save(product);
    }
    public List<Product> getAllProducts(){
      return productRepository.findAll();
    }
}