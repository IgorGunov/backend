package onlineShop.controller.client;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import onlineShop.entity.Characteristica;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@Tag(name = "Работа с характеристикой товара", description = "В этом контроллере описаны CRUD операции для взаимодействия с характеристикой товара")
@RequestMapping("/client/characteristica")
public class CharacteristicaController {

    @Operation(
            summary = "возвращает все характеристики"
    )
    @GetMapping("get/all")
    public List<Characteristica> getAllCharacteristics() {
        return Arrays.asList(new Characteristica(), new Characteristica());
    }
}
