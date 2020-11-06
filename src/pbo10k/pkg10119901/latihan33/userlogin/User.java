/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan33.userlogin;

/**
 *
 * @author User
 */
public class User 
{   
    private static boolean cekAkun(String parUsername, String parPassword)
    {
        if(parUsername.equals("RizkiAdam") && parPassword.equals("terbaikselalu"))
        {      
            return true;
        }
        else
        {
            return false;
        }
    }
    
    private static void hasilLogin(Boolean status, String parUsername)
    {
        String nama;
        nama = parUsername.toUpperCase();
        
        if(status == true)
        {
            System.out.println("****** HALLO "+ nama +" ******");
            System.out.println("Selamat Datang di Aplikasi ini");
        }
        else
        {
            System.out.println("Ooops, Username atau Password anda salah");
        }
    }
    
    public static void pengecekkanLogin(String parUsername, String parPassword)
    {
        boolean statusAkun = cekAkun(parUsername, parPassword);
        hasilLogin(statusAkun, parUsername);
    }
}
