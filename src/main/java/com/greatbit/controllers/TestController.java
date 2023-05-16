package com.greatbit.controllers;
import com.greatbit.models.BooksStorage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

import static java.lang.String.format;

@RestController
public class TestController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    @GetMapping("/books")
    public String books() {
        return BooksStorage.getBooks().stream().
                map(book -> format("%s - %s - %s </br>",book.getName(),book.getAuthor(),book.getPages())).
                collect(Collectors.joining("</br>"));
    }

}