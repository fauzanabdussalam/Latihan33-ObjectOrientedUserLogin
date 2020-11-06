/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan33.userlogin;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Fauzan Muhammad Abdussalam
 * KELAS    : IF-10K
 * NIM      : 10119901
 * Deskripsi Program : Menampilkan hasil login berdasarkan username dan password
 *
 */
public class PBO10K10119901Latihan33UserLogin {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        User user = new User();
        
        Scanner scanner = new Scanner(System.in);
        String username, password;
        
        System.out.print("Masukkan Username = ");
        username = scanner.nextLine();
        
        System.out.print("Masukkan Password = ");
        password = scanner.nextLine();
        
        System.out.println();
        
        user.pengecekkanLogin(username, password);
    }
    
}
