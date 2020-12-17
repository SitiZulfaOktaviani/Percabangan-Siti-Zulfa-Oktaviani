import java.util.Scanner;
public class saldo {
    public static void main(String[] args) {
        System.out.println("========================");
        System.out.println("= Siti Zulfa Oktaviani =");
        System.out.println("========================\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Masunkkan saldo : ");
        int setoranAwal = input.nextInt();
        System.out.print("Lama menabung (tahun) : ");
        int tahun = input.nextInt();
        float saldoAkhir;
        if(tahun == 1){
            saldoAkhir = setoranAwal-((5*setoranAwal)/100);
            System.out.println(saldoAkhir);
        }
        else {
            saldoAkhir = setoranAwal-((3*setoranAwal)/100);
            System.out.println(saldoAkhir);
        }
    }
}
