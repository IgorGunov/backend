package onlineShop.controller.admin;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import onlineShop.entity.Category;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@Tag(name = "Работа с категориями", description = "В этом контроллере описаны CRUD операции для взаимодействия с категориями")
@RequestMapping("/admin/categories")
public class CategoryController {

    @Operation(
            summary = "возвращает все категории"
    )
    @GetMapping("get/all")
    public List<Category> getAllCategories() {
        return Arrays.asList(new Category(), new Category());
    }

    @Operation(
            summary = "добавляет новую категорию в бд"
    )
    @PostMapping("/create")
    public void createCategory(
            @RequestBody @Parameter(description = "Категория") Category category) {

    }

    @Operation(
            summary = "изменяет категорию в бд"
    )
    @PutMapping("/update")
    public void updateCategory(
            @RequestBody @Parameter(description = "Категория") Category category) {

    }

    @Operation(
            summary = "удаляет категорию из бд"
    )
    @DeleteMapping("/delete")
    public void deleteCategory(
            @RequestBody @Parameter(description = "Категория") Category category) {

    }
}
