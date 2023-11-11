package onlineShop.controller.admin;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import onlineShop.entity.Producer;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@Tag(name = "Работа с производителями", description = "В этом контроллере описаны CRUD операции для взаимодействия с производителями")
@RequestMapping("/admin/producers")
public class ProducerController {
    @Operation(
            summary = "возвращает всех производителей"
    )
    @GetMapping("get/all")
    public List<Producer> getAllProducers() {
        return Arrays.asList(new Producer(), new Producer());
    }

    @Operation(
            summary = "добавляет нового производителя в бд"
    )
    @PostMapping("/create")
    public void createProducer(
            @RequestBody @Parameter(description = "Товар") Producer producer) {

    }

    @Operation(
            summary = "изменяет производителя в бд"
    )
    @PutMapping("/update")
    public void updateProducer(
            @RequestBody @Parameter(description = "Товар") Producer producer) {

    }

    @Operation(
            summary = "удаляет производителя из бд"
    )
    @DeleteMapping("/delete")
    public void deleteProducer(
            @RequestBody @Parameter(description = "Товар") Producer producer) {

    }
}
