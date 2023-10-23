package com.pet.bookstore.service;

import com.pet.bookstore.model.Book;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@ExtendWith(MockitoExtension.class)
@SpringBootTest
class BookServiceImplTest {
    @Autowired
    BookService service;

    @Test
    void Saves_new_book() {
        //given
        var book = new Book("Happy Potter", "J.K. Rowling", "1997", BigDecimal.valueOf(19.99));

        //when
        Book result = service.save(book);

        //then
        assertThat(result).usingRecursiveComparison().ignoringFields("id").isEqualTo(book);
    }

}