/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.blogdokdsti.bookstore.DTO;

import lombok.Builder;
import lombok.Data;

/**
 *
 * @author KDS
 */
@Data
 @Builder       
public class MessageResponseDTO {
    private String message;
}
