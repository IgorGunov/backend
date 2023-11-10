package onlineShop.controller.admin;

import onlineShop.entity.Category;
import onlineShop.entity.Product;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@Tag(name = "Работа с товаром",description = "В этом контроллере описаны CRUD операции для взаимодействия с товаром")
@RequestMapping("/admin/product")
public class ProductController {

    @Operation(
            summary = "возвращает все товары"
    )
    @GetMapping(value = "get")
    public List<Product> getAllProducts() {
        return Arrays.asList(new Product(), new Product());
    }

    @Operation(
            summary = "возвращает все товары из определенной категории"
    )
    @GetMapping(value = "products")
    public List<Product> getAllProductsFromCategory(
            @RequestBody @Parameter(description = "Категория") Category category) {
        return null;
    }

    @Operation(
            summary = "добавляет новый товар в бд"
    )

    @PostMapping("/create")
    public void createProduct(
            @RequestBody @Parameter(description = "Товар") Product product) {

    }

    @Operation(
            summary = "изменяет товар в бд"
    )
    @PutMapping("/update")
    public void updateProduct(
            @RequestBody @Parameter(description = "Товар") Product product){

    }

    @Operation(
            summary = "удаляет товар из бд"
    )

    @DeleteMapping("/delete")
    public void deleteProduct(
            @RequestBody @Parameter(description = "Товар") Product product){

    }
}