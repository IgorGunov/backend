package onlineShop.entity;

import lombok.Data;

import jakarta.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String email;

    @Column(name = "address_id")
    private int addressId;

    private String tg;

    @Column(name = "summ_order")
    private int summOrder;

    @Column(name = "date_registration")
    private Date dateRegistration;

    @ManyToMany(mappedBy = "clientBasket")
    private List<Product> basket = new ArrayList<>();

    @ManyToMany(mappedBy = "clientLikes")
    private List<Product> clientLikes = new ArrayList<>();
}