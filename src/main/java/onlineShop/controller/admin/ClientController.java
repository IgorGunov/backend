package onlineShop.controller.admin;

import io.swagger.v3.oas.annotations.Parameter;
import onlineShop.entity.Client;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@Tag(name = "Работа с клиентом", description = "В этом контроллере описаны CRUD операции для взаимодействия с клиентом")
@RequestMapping("/admin/client")
public class ClientController {

    @Operation(
            summary = "возращает всех клиентов"
    )
    @GetMapping("get/all")
    public List<Client> getAllClients(){return Arrays.asList(new Client(), new Client());}


    @Operation(
            summary = "добавляет нового клиента в бд"
    )
    @PostMapping("/create")
    public void createClient(
            @RequestBody @Parameter(description = "Клиент") Client client) {

    }

    @Operation(
            summary = "изменяет клиента в бд"
    )
    @PutMapping("/update")
    public void updateClient(
            @RequestBody @Parameter(description = "Клиент") Client client){

    }

    @Operation(
            summary = "удаляет клиента из бд"
    )
    @DeleteMapping("/delete")
    public void deleteClient(
            @RequestBody @Parameter(description = "Клиент") Client client){

    }

}
