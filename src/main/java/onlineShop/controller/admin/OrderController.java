package onlineShop.controller.admin;

import io.swagger.v3.oas.annotations.Parameter;
import onlineShop.entity.Order;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@Tag(name = "Работа с заказами", description = "В этом контроллере описаны CRUD операции для взаимодействия с заказами")
@RequestMapping("/admin/orders")
public class OrderController {
    @Operation(
            summary = "возвращает все заказы"
    )
    @GetMapping("get/all")
    public List<Order> getAllCategories() {
        return Arrays.asList(new Order(), new Order());
    }

    @Operation(
            summary = "добавляет новый заказ в бд"
    )
    @PostMapping("/create")
    public void createOrder(
            @RequestBody @Parameter(description = "Заказ") Order order) {

    }

    @Operation(
            summary = "изменяет заказ в бд"
    )
    @PutMapping("/update")
    public void updateOrder(
            @RequestBody @Parameter(description = "Заказ") Order order) {

    }

    @Operation(
            summary = "удаляет заказ из бд"
    )
    @DeleteMapping("/delete")
    public void deleteOrder(
            @RequestBody @Parameter(description = "Заказ") Order order) {

    }
}
