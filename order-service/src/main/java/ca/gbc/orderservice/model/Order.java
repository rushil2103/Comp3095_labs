package ca.gbc.orderservice.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

/**
 * @project microservice-parent
 * @authorparam on
 **/
@Entity
@Table(name = "t_orders")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
private String orderNumber;
private String skuCode;
private BigDecimal price;
private Integer quantity;


}

