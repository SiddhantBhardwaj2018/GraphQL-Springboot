package com.siddhantbhardwaj.graphQLproject.service.impl;

import com.siddhantbhardwaj.graphQLproject.entities.Book;
import com.siddhantbhardwaj.graphQLproject.repositories.BookRepo;
import com.siddhantbhardwaj.graphQLproject.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {

    private BookRepo bookRepo;

    @Autowired
    public BookServiceImpl(BookRepo bookRepo){
        this.bookRepo = bookRepo;
    }

    @Override
    public Book createBook(Book book) {
        return this.bookRepo.save(book);
    }

    @Override
    public List<Book> getAll() {
        return this.bookRepo.findAll();
    }

    @Override
    public Book getBookById(int bookId) {
        return this.bookRepo.findById(bookId).orElseThrow(() -> new RuntimeException("Book not found on server"))
                ;
    }
}
