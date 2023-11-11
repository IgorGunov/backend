package onlineShop.controller.admin;

import io.swagger.v3.oas.annotations.Parameter;
import onlineShop.entity.FeedBack;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@Tag(name = "Работа с отзывами", description = "В этом контроллере описаны CRUD операции для взаимодействия с отзывами")
@RequestMapping("/admin/feedback")
public class FeedBackController {
    @Operation(
            summary = "возвращает все отзывы"
    )
    @GetMapping("get/all")
    public List<FeedBack> getAllFeedBacks() {
        return Arrays.asList(new FeedBack(), new FeedBack());
    }

    @Operation(
            summary = "добавляет новый отзыв в бд"
    )
    @PostMapping("/create")
    public void createFeedBack(
            @RequestBody @Parameter(description = "Ответ от поддержки") FeedBack feedBack) {

    }

    @Operation(
            summary = "изменяет отзыв в бд"
    )
    @PutMapping("/update")
    public void updateFeedBack(
            @RequestBody @Parameter(description = "Ответ от поддержки") FeedBack feedBack) {

    }

    @Operation(
            summary = "удаляет отзыв из бд"
    )
    @DeleteMapping("/delete")
    public void deleteFeedBack(
            @RequestBody @Parameter(description = "Ответ от поддержки") FeedBack feedBack) {

    }
}
