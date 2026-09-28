package bjava.ordersms.controller.dto;

import bjava.ordersms.entity.OrderEntity;

import java.math.BigDecimal;

public record OrderResponse(Long orderID,
                            Long customerID,
                            BigDecimal total) {

    public static OrderResponse fromEntity(OrderEntity entity){
        return new OrderResponse(entity.getOrderID(), entity.getCustomerID(), entity.getTotal());
    }
}
