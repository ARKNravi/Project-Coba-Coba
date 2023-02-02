import java.io.*;
import java.time.temporal.TemporalUnit;
import java.util.*;


public class bcc {

    public static void main(String[] args){
        String[] nim = new String[99];
        String[] nama = new String[99];
        String[] password = new String[99];
        String temppassword = "", tempnim="", tempnama="";
        Scanner input = new Scanner(System.in);
        menuutama();
        menuatas();
        System.out.println("| 1. Registrasi                                               |");
        System.out.println("| 2. Login                                                    |");
        System.out.println("| 3. Exit                                                     |");
        System.out.println("+=============================================================+\n");
        char menu = input.next().charAt(0);
        System.out.print("\033\143");
        switch (menu) {
            case '1':
                menuatas();
                input.nextLine();
                    System.out.print("| Masukkan NIM          : ");
                    nim[0] = input.nextLine();
                    System.out.print("| Masukkan Nama         : ");
                    nama[0] = input.nextLine();
                    System.out.print("\n| Masukkan Password   : ");
                    password[0] = input.nextLine();
                    System.out.print("\n| Konfirmasi Password : ");
                    temppassword = input.nextLine();


                while (!password[0].equals(temppassword)){
                    System.out.print("\033\143");
                    menuatas();
                        System.out.print("Password tidak sama\n");
                        System.out.print("| Masukkan NIM        : " + nim[0] );
                        System.out.print("| Masukkan Nama       : " +nama[0]);
                        System.out.print("| Masukkan Password   : ");
                        password[0] = input.nextLine();
                        System.out.print("| Konfirmasi Password : ");
                        temp = input.nextLine();
                }

                break;
            
            case '2' :
                menuatas();
                input.nextLine();
                    System.out.print("| Masukkan NIM atau Nama : ");
                    tempnim = input.next();
                    System.out.print("| Masukkan Password      : ");
                    temppassword = input.nextLine();


                    if(tempnim.equals("admin") && temppassword.equals("admin")){

                    }

                    
                    else {
                        while (!password[0].equals(temppassword) && !nim[0].equals(tempnim) ){
                            System.out.print("\033\143");
                            menuatas();
                            System.out.print("NIM atau Password salah\n");
                            System.out.print("| Masukkan NIM atau Nama : " );
                            tempnim = input.next();
                            System.out.print("| Masukkan Password      : ");
                            temppassword = input.nextLine();
                        }
                    }
                break;

            case '3' :
                menuatas();

                break;
        
            default:

                break;
        }

    }


    public static void menuutama() {
        System.out.println(
        "+=============================================================+\n" + 
        "|                                                             |\n" 
       +"|                      PROGRAM KRS UB                         |\n"
       +"|                                                             |\n"
       +"| ----------------------------------------------------------- |\n"
       +"|                                                             |\n"
       +"|                   Universitas Brawijaya                     |\n"
       +"|                                                             |\n"
       +"+=============================================================+\n" );
       System.out.println("Press Any Key To Continue...");
        new java.util.Scanner(System.in).nextLine();
        System.out.print("\033\143");
      }

      
      public static void menuatas() {
        System.out.println("+=============================================================+");
        System.out.println("|                       PROGRAM KRS UB                        |");
        System.out.println("|                    Universitas Brawijaya                    |");
        System.out.println("|-------------------------------------------------------------|");
      }

}
