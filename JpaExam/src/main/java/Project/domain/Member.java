package Project.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;

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
