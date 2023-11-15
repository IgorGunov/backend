package onlineShop.controller.client;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import onlineShop.entity.Producer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@Tag(name = "Работа с производителями", description = "В этом контроллере описаны CRUD операции для взаимодействия с производителями")
@RequestMapping("/client/producers")
public class ProducerController {
    @Operation(
            summary = "возвращает всех производителей"
    )
    @GetMapping("get/all")
    public List<Producer> getAllProducers() {
        return Arrays.asList(new Producer(), new Producer());
    }

}
