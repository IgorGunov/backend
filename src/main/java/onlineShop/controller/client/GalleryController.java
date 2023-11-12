package onlineShop.controller.client;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import onlineShop.entity.Gallery;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@Tag(name = "Работа с галерея", description = "В этом контроллере описаны CRUD операции для взаимодействия с галереей")
@RequestMapping("/client/gallery")
public class GalleryController {

    @Operation(
            summary = "возвращает все видео/изображения"
    )
    @GetMapping("get/all")
    public List<Gallery> getAllGalleries() {
        return Arrays.asList(new Gallery(), new Gallery());
    }
}
