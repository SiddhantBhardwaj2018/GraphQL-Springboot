package com.siddhantbhardwaj.graphQLproject.repositories;

import com.siddhantbhardwaj.graphQLproject.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {
}
