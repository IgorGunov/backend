package onlineShop.controller.client;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import onlineShop.entity.ContactShop;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@Tag(name = "Работа с контактами магазина", description = "В этом контроллере описаны CRUD операции для взаимодействия с контактами магазина")
@RequestMapping("/client/contactshop")
public class ContactShopController {

    @Operation(
            summary = "возвращает все контакты магазина"
    )
    @GetMapping("get/all")
    public List<ContactShop> getAllContactShop() {
        return Arrays.asList(new ContactShop(), new ContactShop());
    }

}
