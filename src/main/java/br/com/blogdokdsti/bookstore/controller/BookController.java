/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.blogdokdsti.bookstore.controller;
import br.com.blogdokdsti.bookstore.DTO.MessageResponseDTO;
import br.com.blogdokdsti.bookstore.entity.Book;
import br.com.blogdokdsti.bookstore.repository.BookRepository;
import br.com.blogdokdsti.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author KDS
 */
@RestController
@RequestMapping("/api/v1/books")
public class BookController {
    private BookService bookService;
    //contrutor

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    
    @PostMapping
    public MessageResponseDTO create(@RequestBody Book book){
    return bookService.create(book);
    }
    
}
