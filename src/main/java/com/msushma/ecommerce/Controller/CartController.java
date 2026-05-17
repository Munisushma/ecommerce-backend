package com.msushma.ecommerce.Controller;
import com.msushma.ecommerce.Model.Cart;
import com.msushma.ecommerce.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/carts")
public class CartController {
    @Autowired
    private CartService cartService;
    @PostMapping("/add")
    public Cart  addCart(@RequestBody Cart cart){
        return cartService.addCart(cart);
    }
    @GetMapping("/all")
    public  List<Cart>  getallCarts(){
        return cartService.getallCarts();
    }
    @GetMapping("/{userId}")
        
public List<Cart> getCartByUserId(@PathVariable Long userId) {
    return cartService.getCartByUserId(userId);


}
}
