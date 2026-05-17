package com.msushma.ecommerce.Model;
import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "carts")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  Long userId;
    private Long productId;
    private int quantity;
}
