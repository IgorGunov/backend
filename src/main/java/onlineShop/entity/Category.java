package onlineShop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "category")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @Column(name="nested_categories_id")
    private int nestedCategoriesId;

    @Column(name = "count_product")
    private int countProduct;

    @Column(name = "count_nested_categories")
    private int countNestedCategories;

    @ManyToMany(mappedBy = "categories")
    private List<Product> products = new ArrayList<>();
}