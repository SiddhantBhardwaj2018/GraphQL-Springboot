package com.siddhantbhardwaj.graphQLproject;

import com.siddhantbhardwaj.graphQLproject.entities.Book;
import com.siddhantbhardwaj.graphQLproject.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphQLProjectApplication implements CommandLineRunner {

	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(GraphQLProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book b1 = new Book();
		b1.setTitle("Complete Reference");
		b1.setDesc("For Learning Java");
		b1.setPages(2000);
		b1.setPrice(5000);
		b1.setAuthor("Siddhant Bhardwaj");

		Book b2 = new Book();
		b2.setTitle("Complete Reference");
		b2.setDesc("For Learning JavaScript");
		b2.setPages(1000);
		b2.setPrice(3000);
		b2.setAuthor("Siddhant Bhardwaj");

		Book b3 = new Book();
		b3.setTitle("Complete Reference");
		b3.setDesc("For Learning Kafka");
		b3.setPages(5100);
		b3.setPrice(10000);
		b3.setAuthor("Siddhant Bhardwaj");

		this.bookService.createBook(b1);
		this.bookService.createBook(b2);
		this.bookService.createBook(b3);
	}
}
