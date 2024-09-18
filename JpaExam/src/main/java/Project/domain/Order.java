package Project.domain;

import jakarta.persistence.*;
import lombok.Builder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name ="ORDERS")
public class Order {

    @Column(name = "ORDER_ID")
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;

    @OneToMany(mappedBy = "order")
    private final List<OrderItem> orderItems = new ArrayList<>();

    private LocalDate orderDate;
    private OrderStatus status;

    @Builder
    public Order(Long id, Member member, LocalDate orderDate, OrderStatus status) {
        this.id = id;
        this.member = member;
        this.orderDate = orderDate;
        this.status = status;
    }

    protected Order(){

    }

    public void addOrderItems(OrderItem orderItem) {
        orderItem.setOrder(this);
        orderItems.add(orderItem);
    }
}
