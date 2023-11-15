package onlineShop.controller.client;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import onlineShop.entity.Category;
import onlineShop.entity.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@Tag(name = "Работа с товаром", description = "В этом контроллере описаны CRUD операции для взаимодействия с товаромВ этом контроллере описаны CRUD операции для взаимодействия с товаром")
@RequestMapping("/client/product")
public class ProductController {

    @Operation(
            summary = "возвращает все товара"
    )
    @GetMapping("get/all")
    public List<Product> getAllProducts(){ return Arrays.asList(new Product(), new Product()); }

    @Operation(
            summary = "возвращает все товары из определенной категории"
    )
    @GetMapping(value = "products")
    public List<Product> getAllProductsFromCategory(
            @RequestBody @Parameter(description = "Категория") Category category) {
        return null;
    }
}
