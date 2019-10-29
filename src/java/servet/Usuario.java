/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servet;

import java.util.Scanner;

public class Usuario {
    static String nome;
    static String email;
    static String senha;
    
     static void pedirNome(){
         Scanner scanner = new Scanner(System.in);
         nome = scanner.next();
     }
    static void pedirEmail(){
         Scanner scanner = new Scanner(System.in);
         email = scanner.next();
     }
     static void pedirSenha(){
         Scanner scanner = new Scanner(System.in);
         senha = scanner.next();
     }
     
    static void mostrarNome(){
        System.out.println("Nome:"+ nome);
    }
     static void mostrarEmail(){
        System.out.println("Email:"+ email);
    }
      static void mostrarSenha(){
        System.out.println("Senha:"+ senha);
    }
    
    
}
