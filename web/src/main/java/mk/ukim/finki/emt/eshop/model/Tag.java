package mk.ukim.finki.emt.eshop.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Tag {

    public Tag() {
    }

    public Tag(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    @ManyToOne
    Product product;
}
