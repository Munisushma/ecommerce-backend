package com.msushma.ecommerce.service;
import com.msushma.ecommerce.Model.Orders;
import com.msushma.ecommerce.Repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class OrdersService {
    @Autowired
    private OrdersRepository ordersRepository;
    public Orders placeOrders(Orders orders){
        return ordersRepository.save(orders);
    }
    public List<Orders> getOrdersByUserId(Long userId){
   return ordersRepository.findByUserId(userId);
    }

}
