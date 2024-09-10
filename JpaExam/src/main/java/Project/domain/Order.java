package Project.domain;

import jakarta.persistence.*;
import lombok.Builder;

import java.time.LocalDate;

@Entity
@Table(name ="ORDERS")
public class Order {

    @Column(name = "ORDER_ID")
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "MEMBER_ID")
    private Long memberId;
    private LocalDate orderDate;
    private OrderStatus status;

    @Builder
    public Order(Long id, Long memberId, LocalDate orderDate, OrderStatus status) {
        this.id = id;
        this.memberId = memberId;
        this.orderDate = orderDate;
        this.status = status;
    }

    protected Order(){

    }
}
