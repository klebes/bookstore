/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.blogdokdsti.bookstore.repository;

import br.com.blogdokdsti.bookstore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author KDS
 */
public interface BookRepository extends JpaRepository<Book, Long>{
    
}
