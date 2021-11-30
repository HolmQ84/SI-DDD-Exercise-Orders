package si.ddd.exerciseorders.orders.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Order {
    @Id
    private Long id;

}
