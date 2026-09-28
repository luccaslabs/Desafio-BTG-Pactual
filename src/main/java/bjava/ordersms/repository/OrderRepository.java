package bjava.ordersms.repository;

import bjava.ordersms.controller.dto.OrderResponse;
import bjava.ordersms.entity.OrderEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<OrderEntity, Long> {
    Page<OrderEntity> findAllByCustomerID(Long customerID, PageRequest pageRequest);
}
