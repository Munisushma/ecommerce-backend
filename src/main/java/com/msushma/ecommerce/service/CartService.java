package com.msushma.ecommerce.service;
import com.msushma.ecommerce.Model.Cart;
import com.msushma.ecommerce.Repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;
    public Cart addCart(Cart cart){
        return cartRepository.save(cart);
    }
    public List<Cart> getallCarts(){
        return cartRepository.findAll();
        
    }
    public List<Cart> getCartByUserId(Long userId){
   return cartRepository.findByUserId(userId);
    }
    public List<Cart> getAllCarts() {
        
        throw new UnsupportedOperationException("Unimplemented method 'getAllCarts'");
    }
}
