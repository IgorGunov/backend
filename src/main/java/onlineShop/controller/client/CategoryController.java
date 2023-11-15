package onlineShop.controller.client;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import onlineShop.entity.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@Tag(name = "Работа с категориями", description = "В этом контроллере описаны CRUD операции для взаимодействия с категориями")
@RequestMapping("/client/categories")
public class CategoryController {

    @Operation(
            summary = "возвращает все категории"
    )
    @GetMapping("get/all")
    public List<Category> getAllCategories() {
        return Arrays.asList(new Category(), new Category());
    }

}
