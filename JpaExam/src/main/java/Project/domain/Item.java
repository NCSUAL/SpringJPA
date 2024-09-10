package Project.domain;

import jakarta.persistence.*;
import lombok.Builder;

@Entity
@Table(name = "ITEM_ID")
public class Item {

    @Column(name = "ITEM_ID")
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int price;
    private int stockQuantity;

    @Builder
    public Item(Long id, String name, int price, int stockQuantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    protected Item(){

    }
}
