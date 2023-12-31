package onlineShop.controller.admin;

import io.swagger.v3.oas.annotations.Parameter;
import onlineShop.entity.Shop;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@Tag(name = "Работа с магазином", description = "В этом контроллере описаны CRUD операции для взаимодействия с магазином")
@RequestMapping("/admin/shop")
public class ShopContoller {

    @Operation(
            summary = "возвращает все магазины"
    )
    @GetMapping("get/all")
    public List<Shop> getAllShops() {
        return Arrays.asList(new Shop(), new Shop());
    }

    @Operation(
            summary = "добавляет магазин в бд"
    )
    @PostMapping("/create")
    public void createShop(
            @RequestBody @Parameter(description = "Магазин") Shop shop) {

    }

    @Operation(
            summary = "изменяет магазин в бд"
    )
    @PutMapping("/update")
    public void updateShop(
            @RequestBody @Parameter(description = "Магазин") Shop shop) {

    }

    @Operation(
            summary = "удаляет магазин из бд"
    )
    @DeleteMapping("/delete")
    public void deleteShop(
            @RequestBody @Parameter(description = "Магазин") Shop shop) {

    }
}