package com.msushma.ecommerce.Controller;
import com.msushma.ecommerce.Model.Orders;
import com.msushma.ecommerce.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;
    @PostMapping("/place")
   public Orders placeOrder(@RequestBody Orders orders){
    return ordersService.placeOrders(orders);
   }
   @GetMapping("/{userId}")
        
public List<Orders> getOrdersByUserId(@PathVariable Long userId) {
    return ordersService.getOrdersByUserId(userId);
}

    
}
