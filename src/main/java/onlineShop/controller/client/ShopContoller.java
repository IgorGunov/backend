package onlineShop.controller.client;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import onlineShop.entity.Shop;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@Tag(name = "Работа с магазином", description = "В этом контроллере описаны CRUD операции для взаимодействия с магазином")
@RequestMapping("/client/shop")
public class ShopContoller {
    @Operation(
            summary = "возвращает все магазины"
    )
    @GetMapping("get/all")
    public List<Shop> getAllShops() {
        return Arrays.asList(new Shop(), new Shop());
    }

}
