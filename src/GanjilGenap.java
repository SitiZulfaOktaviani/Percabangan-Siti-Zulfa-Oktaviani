import java.util.InputMismatchException;
import java.util.Scanner;
public class GanjilGenap {
    public static void main(String args[])
    {
        System.out.println("========================");
        System.out.println("= Siti Zulfa Oktaviani =");
        System.out.println("========================");
        System.out.println("");

        int angka;
        System.out.print("Masukkan bilangan ganjil atau genap: ");

        Scanner input = new Scanner(System.in);

        while(true){

            try{
                angka = input.nextInt();
                break;

            }
            catch(InputMismatchException ex){
                System.out.println("Anda tidak memasukkan bilangan, coba lagi: ");
                input.nextLine();
            }

        }
        cekGanjilGenap(angka);
    }

    public static void cekGanjilGenap(int angka){
        if ( angka % 2 == 0 ) System.out.println(angka + " adalah bilangan genap");
        else System.out.println(angka + " adalah bilangan ganjil");
    }
}
