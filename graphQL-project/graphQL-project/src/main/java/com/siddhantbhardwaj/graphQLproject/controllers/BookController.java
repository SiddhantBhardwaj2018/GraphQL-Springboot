package com.siddhantbhardwaj.graphQLproject.controllers;

import com.siddhantbhardwaj.graphQLproject.entities.Book;
import com.siddhantbhardwaj.graphQLproject.service.BookService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService){
        this.bookService = bookService;
    }
    /*
    mutation{
    createBook(book:{
        title:"Testing in Python",
        desc:"this is a unit testing tutorial",
        price:4512,
        pages:123,
        author:"Siddhant Bhardwaj"
    }){
        id,
        title,
        desc,
        price
    }
}
     */
    @MutationMapping("createBook")
    public Book createBook(@Argument BookInput book){
        Book b = new Book();
        b.setTitle(book.getTitle());
        b.setDesc(book.getDesc());
        b.setPrice(book.getPrice());
        b.setPages(book.getPages());
        b.setAuthor(book.getAuthor());
        return this.bookService.createBook(b);
    }

    /*
    query{
    allBooks{
        id,
        title,
        desc,
        author
    }
}
     */
    @QueryMapping("allBooks")
    public List<Book> getAll(){
        return this.bookService.getAll();
    }
    /*
    query{
    getBook(bookId:2){
        title,
        id,
        desc,
        price
    }
     */
    @QueryMapping("getBook")
    public Book getBookById(@Argument int bookId){
        return this.bookService.getBookById(bookId);
    }

}

@Getter
@Setter
class BookInput{

    private String title;
    private String author;
    private String desc;
    private double price;
    private int pages;


}
