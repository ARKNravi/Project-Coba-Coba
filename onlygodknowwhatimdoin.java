import java.util.*;
import java.lang.Math;

public class onlygodknowwhatimdoin { 

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,j, tmb, krg, kali, menu, prsg, prsgp, segi3, no;
        double bagi;
        char menu2 = 'Y';

        do {
            System.out.print("\033\143");
        System.out.println(" =============================================================\n" + 
                           "|                                                             |\n" 
                          +"|                   PROGRAM KALKULATOR UB                     |\n"
                          +"|                                                             |\n"
                          +"| ----------------------------------------------------------- |\n"
                          +"|                                                             |\n"
                          +"|                   Universitas Brawijaya                     |\n"
                          +"|                                                             |\n"
                          +" =============================================================\n" );
        System.out.println("Press Any Key To Continue...");
          new java.util.Scanner(System.in).nextLine();
          System.out.print("\033\143");
        System.out.println("              MENU UTAMA PROGRAM KALKULATOR UB" 
                         + "\n ------------------------------------------------------------- ");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Persegi");
        System.out.println("6. Persegi Panjang");
        System.out.println("7. Segitiga");
        System.out.println("8. Kuadrat");
        System.out.println("9. Bunga");
        System.out.println("10. Exit");
        System.out.println("Silahkan Pilih Menu NO :");
        no = input.nextInt();
        switch (no) {
            case 1:
            System.out.print("\033\143");
            System.out.println("Silahkan Masukkan Bilangan 1");
            i = input.nextInt();
            System.out.println("Silahkan Masukkan Bilangan 2");
            j = input.nextInt();
            tmb = i + j;
            System.out.println("Hasil Penjumlahan : " + tmb);
            System.out.println("Kembali ke menu Y/N"); 
            menu2 = input.next().charAt(0);   
                break;
            case 2: 
            System.out.print("\033\143");
            System.out.println("Silahkan Masukkan Bilangan 1");
            i = input.nextInt();
            System.out.println("Silahkan Masukkan Bilangan 2");
            j = input.nextInt();
            krg = i - j;
            System.out.println("Hasil Pengurangan : " + krg);
            System.out.println("Kembali ke menu Y/N"); 
            menu2 = input.next().charAt(0);   
                break;
            case 3:
            System.out.print("\033\143");
            System.out.println("Silahkan Masukkan Bilangan 1");
            i = input.nextInt();
            System.out.println("Silahkan Masukkan Bilangan 2");
            j = input.nextInt();
            kali = i * j;
            System.out.println("Hasil Perkalian : " + kali);  
            System.out.println("Kembali ke menu Y/N"); 
            menu2 = input.next().charAt(0);  
                break;
            case 4:
            System.out.print("\033\143");
            System.out.println("Silahkan Masukkan Bilangan 1");
            i = input.nextInt();
            System.out.println("Silahkan Masukkan Bilangan 2");
            j = input.nextInt();
            bagi = new  Double(i) / j;
            System.out.println("Hasil Pembagian : " + bagi); 
            System.out.println("Kembali ke menu Y/N"); 
            menu2 = input.next().charAt(0);  
                break;
            case 5:
            System.out.print("\033\143");
            System.out.println("Silahkan Masukkan Panjang Sisi");
            i = input.nextInt();
            prsg = i*i;
            System.out.println("Hasil Persegi : " + prsg);  
            System.out.println("Kembali ke menu Y/N"); 
            menu2 = input.next().charAt(0); 
                break;
            case 6:
            System.out.print("\033\143");
            System.out.println("Silahkan Masukkan Panjang Alas");
            i = input.nextInt();
            System.out.println("Silahkan Masukkan Panjang Lebar");
            j = input.nextInt();
            prsgp = i * j;
            System.out.println("Hasil Persegi Panjang : " + prsgp);   
            System.out.println("Kembali ke menu Y/N"); 
            menu2 = input.next().charAt(0);
                break;
            case 7 :
            System.out.print("\033\143");
            System.out.println("Silahkan Masukkan Alas");
            i = input.nextInt();
            System.out.println("Silahkan Masukkan Tinggi");
            j = input.nextInt();
            segi3 = i * j/2;
            System.out.println("Hasil Segitiga : " + segi3);   
            System.out.println("Kembali ke menu Y/N"); 
            menu2 = input.next().charAt(0); 
                break;
            case 9:
            menu2 = 'n';
            break;
        
            default:
            System.out.print("\033\143");
            System.out.println("Salah Memasukkan Input data");
            System.out.println("Kembali ke menu Y/N"); 
            menu2 = input.next().charAt(0);
                break;
        }
        } while (menu2 == 'Y' || menu2 == 'y');
        
    }
}
