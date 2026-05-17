package com.msushma.ecommerce.Repository;
import com.msushma.ecommerce.Model.Orders;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
public interface OrdersRepository extends JpaRepository<Orders,Long> {
    List<Orders> findByUserId(Long userId);
}
