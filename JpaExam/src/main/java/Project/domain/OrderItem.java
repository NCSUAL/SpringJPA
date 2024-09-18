package Project.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "ORDER_ITEM")
@Data
public class OrderItem {

    @Column(name = "ORDER_ITEM_ID")
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ORDER_ID")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "ITEM_ID")
    private Item item;

    private int orderPrice;
    private int count;

    @Builder
    public OrderItem(Long id, Order order, Item item, int orderPrice, int count) {
        this.id = id;
        this.order = order;
        this.item = item;
        this.orderPrice = orderPrice;
        this.count = count;
    }

    public OrderItem(){

    }
}
