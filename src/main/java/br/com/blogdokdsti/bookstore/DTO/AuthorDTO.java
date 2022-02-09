/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.blogdokdsti.bookstore.DTO;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author KDS
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthorDTO {
//     @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;
    
//    @Column(nullable = false, unique = true)
   @NotBlank
   @Size(max=200)
    private String nome;
    
//    @Column(nullable = false)
   @NotNull
   @size(max=100)
    private Integer age;
}
