package bjava.ordersms.listener.dto;

import bjava.ordersms.entity.OrderItem;

import java.awt.event.ItemEvent;
import java.util.List;

public record OrderCreatedEvent(Long codigoPedido,
                                Long codigoCliente,
                                List<OrderItemEvent> itens) {
}
