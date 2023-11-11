package onlineShop.controller.admin;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import onlineShop.entity.Characteristica;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@Tag(name = "Работа с характеристикой товара", description = "В этом контроллере описаны CRUD операции для взаимодействия с характеристикой товара")
@RequestMapping("/admin/characteristica")
public class CharacteristicaController {

    @Operation(
            summary = "возвращает все характеристики"
    )
    @GetMapping("get/all")
    public List<Characteristica> getAllCharacteristics() {
        return Arrays.asList(new Characteristica(), new Characteristica());
    }

    @Operation(
            summary = "добавляет новую характеристику в бд"
    )
    @PostMapping("/create")
    public void createCharacteristica(
            @RequestBody @Parameter(description = "Характеристика") Characteristica characteristica) {

    }

    @Operation(
            summary = "изменяет характеристику в бд"
    )
    @PutMapping("/update")
    public void updateCharacteristica(
            @RequestBody @Parameter(description = "Характеристика") Characteristica characteristica) {

    }

    @Operation(
            summary = "удаляет характеристику из бд"
    )
    @DeleteMapping("/delete")
    public void deleteCharacteristica(
            @RequestBody @Parameter(description = "Характеристика") Characteristica characteristica) {

    }
}