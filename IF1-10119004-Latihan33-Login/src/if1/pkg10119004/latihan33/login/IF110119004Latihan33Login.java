/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119004.latihan33.login;
import java.util.Scanner;

/**
 *
 * @author ENDOG
 *  Nama      : Muhamad Ramadan
 *  NIM       : 10119004
 *  Kelas     : IF1
 *  Deskripsi : menampilkan login
 */
public class IF110119004Latihan33Login {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
        System.out.print("Masukkan Username = ");
        Username = scanner.next();
        System.out.print("Masukkan Passowrd = ");
        Password = scanner.next();
        System.out.println();
        User login = new User();
        login.pengecekanLogin(Username, Password);
    }
    
}
