import java.util.InputMismatchException;
import java.util.Scanner;
public class TahunKabisat {
    public static void main(String[] args) {
        System.out.println("========================");
        System.out.println("= Siti Zulfa Oktaviani =");
        System.out.println("========================\n");

        int tahun;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tahun : ");
        while (true){
            try{
                tahun = input.nextInt();
                break;
            }
            catch (InputMismatchException ex){
                System.out.print("Anda tidak memasukkan tahun, coba lagi: ");
                input.nextLine();
            }
        }
        cekTahun(tahun);
    }
    public static void cekTahun(int tahun){
        if (tahun % 400 == 0) {
            System.out.print(tahun + " Merupakan Tahun Kabisat\n");
        } else if (tahun % 100 == 0) {
            System.out.print(tahun + " Bukan Tahun Kabisat\n");
        } else if (tahun % 4 == 0) {
            System.out.print(tahun + " Merupakan Tahun Kabisat\n");
        } else {
            System.out.print(tahun + " Bukan Tahun Kabisat\n");
        }
    }
}