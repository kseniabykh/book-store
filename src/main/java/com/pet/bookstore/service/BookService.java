package com.pet.bookstore.service;

import com.pet.bookstore.model.Book;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public interface BookService {

    Book save(Book book);

    List<Book> findAll();

}
