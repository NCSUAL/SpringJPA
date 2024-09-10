package Project.domain;

import jakarta.persistence.*;
import lombok.Builder;

@Entity
@Table(name = "ORDER_ITEM")
public class OrderItem {

    @Column(name = "ORDER_ITEM_ID")
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "ORDER_ID")
    private Long orderId;
    @Column(name = "ITEM_ID")
    private Long itemId;
    private int orderPrice;
    private int count;

    @Builder
    public OrderItem(Long id, Long orderId, Long itemId, int orderPrice, int count) {
        this.id = id;
        this.orderId = orderId;
        this.itemId = itemId;
        this.orderPrice = orderPrice;
        this.count = count;
    }

    protected OrderItem(){

    }
}
