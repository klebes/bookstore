/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.blogdokdsti.bookstore.DTO;

import br.com.blogdokdsti.bookstore.entity.Author;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author KDS
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BookDTO {
//     @Column(nullable = false, unique = true)
   @NotBlank
   @Size(max= 200)
    private String nome;
//    @Column(nullable = false)
   @NotNull 
   private Integer pages;
//    @Column(nullable = false)
   @NotNull
   private Integer chapters;
//    @Column(nullable = false)
   @Size(max = 100)
   @NotBlank
   @pattern(regexp = (""))
   private String isbn;
//    @Column(name = "publisher_name", nullable = false, unique = true)
    
   @NotBlank
   @Size(max = 200)
   private String publisherName;
//    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
//    @JoinColumn(name = "author_id")
    @NotNull
    private Author author;
}
