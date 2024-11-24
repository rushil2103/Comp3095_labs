package ca.gbc.orderservice.dto;

import java.math.BigDecimal;

/**
 * @project microservice-parent
 * @authorparam on
 **/
public record OrderRequest(
        Long id,
        String orderNumber,
        String skuCode,
        BigDecimal price,
        Integer quantity

) {
}
