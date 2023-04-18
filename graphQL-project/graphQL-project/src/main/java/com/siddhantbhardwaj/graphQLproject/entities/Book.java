package com.siddhantbhardwaj.graphQLproject.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "project_books")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String author;
    private String desc;
    private double price;
    private int pages;


}
