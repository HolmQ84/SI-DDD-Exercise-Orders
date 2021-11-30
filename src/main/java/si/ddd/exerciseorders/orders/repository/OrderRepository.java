package si.ddd.exerciseorders.orders.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import si.ddd.exerciseorders.orders.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
