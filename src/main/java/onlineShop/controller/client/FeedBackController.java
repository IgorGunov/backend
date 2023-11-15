package onlineShop.controller.client;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import onlineShop.entity.FeedBack;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@Tag(name = "Работа с отзывами", description = "В этом контроллере описаны CRUD операции для взаимодействия с отзывами")
@RequestMapping("/client/feedback")
public class FeedBackController
{
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
            @RequestBody @Parameter(description = "Комментарий клиента") FeedBack feedBack) {

    }

    @Operation(
            summary = "изменяет отзыв в бд"
    )
    @PutMapping("/update")
    public void updateFeedBack(
            @RequestBody @Parameter(description = "Комментарий клиента") FeedBack feedBack) {

    }

    @Operation(
            summary = "удаляет отзыв из бд"
    )
    @DeleteMapping("/delete")
    public void deleteFeedBack(
            @RequestBody @Parameter(description = "Комментарий клиента") FeedBack feedBack) {

    }
}
