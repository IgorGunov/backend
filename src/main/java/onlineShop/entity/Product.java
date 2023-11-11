package onlineShop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "product")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private int price;

    private boolean markdown;

    private boolean sale;

    private int discount;

    @Column(name = "vender_code")
    private int venderCode;

    private int count;

    @ManyToOne
    @JoinColumn(name = "producer_id")
    private Producer producer;

    @ManyToOne
    @JoinColumn(name = "characteristica_id")
    private Characteristica characteristica;




    @ManyToMany(mappedBy = "listProduct")
    @JoinTable(
            name = "connection_category_and_product",
            joinColumns = { @JoinColumn(name = "product_id", referencedColumnName = "id") },
            inverseJoinColumns = { @JoinColumn(name = "category_id", referencedColumnName = "id") }
    )
    private List<Category> categories = new ArrayList<>();

    @ManyToMany(mappedBy = "listProduct")
    @JoinTable(
            name = "basket",
            joinColumns = { @JoinColumn(name = "product_id", referencedColumnName = "id") },
            inverseJoinColumns = { @JoinColumn(name = "basket_id", referencedColumnName = "id") }
    )
    private List<Client> clientBasket = new ArrayList<>();

    @ManyToMany(mappedBy = "listProduct")
    @JoinTable(
            name = "likes",
            joinColumns = { @JoinColumn(name = "product_id", referencedColumnName = "id") },
            inverseJoinColumns = { @JoinColumn(name = "like_id", referencedColumnName = "id") }
    )
    private List<Client> clientLikes = new ArrayList<>();

    @ManyToMany(mappedBy = "listProduct")
    @JoinTable(
            name = "relation_order_and_product",
            joinColumns = { @JoinColumn(name = "product_id", referencedColumnName = "id") },
            inverseJoinColumns = { @JoinColumn(name = "order_id", referencedColumnName = "id") }
    )
    private List<Order> listOrder = new ArrayList<>();
}
