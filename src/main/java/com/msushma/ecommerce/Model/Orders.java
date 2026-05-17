package com.msushma.ecommerce.Model;
import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private Long productId;
    private int quantity;
    private double totalPrice;
    private String status;
}
