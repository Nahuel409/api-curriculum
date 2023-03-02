/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apibackend.portfolio.exception;


public class UserNotFoundException extends RuntimeException{
    
     public UserNotFoundException(String message){
      super(message);
    }
}
