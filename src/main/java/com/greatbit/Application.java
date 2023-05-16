package com.greatbit;

import com.greatbit.models.Book;
import com.greatbit.models.BooksStorage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        BooksStorage.getBooks().add(new Book("Учение","Карлос", 400));
        BooksStorage.getBooks().add(new Book("Богатый бедный","КИосаки", 250));

        SpringApplication.run(Application.class, args);
    }
}