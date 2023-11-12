package onlineShop.controller.client;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import onlineShop.entity.Address;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@Tag(name = "Работа с адресами", description = "В этом контроллере описаны CRUD операции для взаимодействия с адресами")
@RequestMapping("/client/addresses")
public class AddressController {

    @Operation(
            summary = "возвращает адрес конкретного клиента"
    )
    @GetMapping("/get/clientaddress")
    public List<Address> getAllAddresses() {
        return Arrays.asList(new Address(), new Address());
    }

    @Operation(
            summary = "добавляет новый адрес в бд"
    )
    @PostMapping("/create")
    public void createAddress(
            @RequestBody @Parameter(description = "Адресс") Address address) {

    }

    @Operation(
            summary = "изменяет адрес в бд"
    )
    @PutMapping("/update")
    public void updateAddress(
            @RequestBody @Parameter(description = "Адресс") Address address) {

    }

    @Operation(
            summary = "удаляет адрес из бд"
    )
    @DeleteMapping("/delete")
    public void deleteAddress(
            @RequestBody @Parameter(description = "Адресс") Address address) {

    }
}
