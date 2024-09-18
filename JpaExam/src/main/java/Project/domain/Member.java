package Project.domain;

import jakarta.persistence.*;
import lombok.Builder;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Member {

    @Column(name = "MEMBER_ID")
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String city;
    private String street;
    private String zipcode;

    @OneToMany(mappedBy = "member")
    private final List<Order> orders = new ArrayList<Order>();

    @Builder
    public Member(Long id, String name, String city, String street, String zipcode) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }

    protected Member() {

    }
}
