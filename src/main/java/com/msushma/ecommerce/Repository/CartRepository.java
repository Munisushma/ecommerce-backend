package com.msushma.ecommerce.Repository;
import com.msushma.ecommerce.Model.Cart;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

    public interface CartRepository extends JpaRepository<Cart,Long>{
      List<Cart> findByUserId(Long userId);

}
    
