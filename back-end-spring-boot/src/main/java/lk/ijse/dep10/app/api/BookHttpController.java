package lk.ijse.dep10.app.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/api/v1/books")
public class BookHttpController {


    @GetMapping
    public String getAllBooks(){
        return "<h1>Get all books</h2>";
    }

    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public String saveBook(){
        return "<h1>Save Book</h1>";
    }
}
