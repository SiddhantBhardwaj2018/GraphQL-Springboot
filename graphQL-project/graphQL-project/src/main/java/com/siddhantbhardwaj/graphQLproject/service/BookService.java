package com.siddhantbhardwaj.graphQLproject.service;

import com.siddhantbhardwaj.graphQLproject.entities.Book;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BookService {

    Book createBook(Book book);

    List<Book> getAll();

    Book getBookById(int BookId);

}
