import java.util.Scanner;
public class suhuKonversi {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("========================");
        System.out.println("= Siti Zulfa Oktaviani =");
        System.out.println("========================\n");

        System.out.println("************************************************");
        System.out.println("* [1] Konversi Suhu dari Celcius ke Reamur     *");
        System.out.println("* [2] Konversi Suhu Celcius ke Fahrenheit      *");
        System.out.println("* [3] Konversi Suhu Celcius ke Kelvin          *");
        System.out.println("* [4] Konversi Suhu dari Reamur ke Celcius     *");
        System.out.println("* [5] Konversi Suhu dari Reamur ke Kelvin      *");
        System.out.println("* [6] Konversi Suhu dari Reamur ke Fahrenheat  *");
        System.out.println("* [7] Konversi Suhu dari Fahrenheat ke Celcius *");
        System.out.println("* [8] Konversi Suhu dari Fahrenheat ke Reamur  *");
        System.out.println("* [9] Konversi Suhu dari Fahrenheat ke Kelvin  *");
        System.out.println("* [10] Konversi Suhu dari Kelvin ke Celcius    *");
        System.out.println("* [11] Konversi Suhu dari Kelvin ke Reamur     *");
        System.out.println("* [12] Konversi Suhu dari Kelvin ke Fahrenheat *");
        System.out.println("************************************************\n");

        System.out.print("Pilih menu konversi (1/2/3/4/5/6/7/8/9/10/11/12): ");
        int PilihMenu = input.nextInt();
        switch(PilihMenu){
            case 1:
                CelciusReamur();
                break;
            case 2:
                CelciusFahrenheat();
                break;
            case 3:
                CelciusKelvin();
                break;
            case 4:
                ReamurCelcius();
                break;
            case 5:
                ReamurKelvin();
                break;
            case 6:
                ReamurFahrenheat();
                break;
            case 7:
                FahrenheatCelcius();
                break;
            case 8:
                FahrenheatReamur();
                break;
            case 9:
                FahrenheatKelvin();
                break;
            case 10:
                KelvinCelcius();
                break;
            case 11:
                KelvinReamur();
                break;
            case 12:
               KelvinFahrenheat();
                break;                
            default:
                System.out.println("Pilihan salah!");
        }
    }

//    celcius konversi
    private static void CelciusKelvin() {
        System.out.print("Masukan suhu (°C): ");
        float celsius = input.nextFloat();
        float kelvin = celsius + 273;
        System.out.print("K = "+kelvin +"°K");
    }

    private static void CelciusFahrenheat() {
        System.out.print("Masukan suhu (°C): ");
        float celsius = input.nextFloat();
        float fahrenheat = ((9*celsius)/5)+32;
        System.out.print("F = "+fahrenheat +"°F");
    }

    private static void CelciusReamur() {
        System.out.print("Masukan suhu (°C): ");
        float celsius = input.nextFloat();
        float reamur = (4*celsius)/5;
        System.out.print("R = "+reamur +"°R");
    }
// celcius konversi

//    reamur konversi
    private static void ReamurCelcius(){
        System.out.print("Masukan suhu (°R): ");
        float reamur = input.nextFloat();
        float celsius = (5*reamur)/4;
        System.out.print("C = "+celsius +"°C");
    }

    private static void ReamurKelvin(){
        System.out.print("Masukan suhu (°R): ");
        float reamur = input.nextFloat();
        float kelvin = ((5*reamur)/4)+273;
        System.out.print("K = "+kelvin +"°K");
    }

    private static void ReamurFahrenheat(){
        System.out.print("Masukan suhu (°R): ");
        float reamur = input.nextFloat();
        float kelvin = ((9*reamur)/4)+32;
        System.out.print("F = "+kelvin +"°F");
    }
//    reamur konversi
//    fahrenheat
        private static void FahrenheatCelcius(){
            System.out.print("Masukan suhu (°F): ");
            float fahrenheat = input.nextFloat();
            float celsius = (float) (0.5*(fahrenheat-32));
            System.out.print("C = "+celsius +"°C");
        }

        private static void FahrenheatReamur(){
            System.out.print("Masukan suhu (°F): ");
            float fahrenheat = input.nextFloat();
            float reamur = (float) (0.4*(fahrenheat-32));
            System.out.print("R = "+reamur +"°R");
        }

        private static void FahrenheatKelvin(){
            System.out.print("Masukan suhu (°F): ");
            float fahrenheat = input.nextFloat();
            float kelvin = (float) (0.5*(fahrenheat-32))+273;
            System.out.print("R = "+kelvin +"°R");
        }
//    fahrenheat

//    kelvin
        private static void KelvinCelcius(){
            System.out.print("Masukan suhu (°K): ");
            float kelvin = input.nextFloat();
            float celsius = kelvin - 273;
            System.out.print("K = "+celsius +"°K");
        }

    private static void KelvinReamur(){
        System.out.print("Masukan suhu (°K): ");
        float kelvin = input.nextFloat();
        float reamur = (float) (0.8*(kelvin-273));
        System.out.print("K = "+reamur +"°K");
    }

    private static void KelvinFahrenheat(){
        System.out.print("Masukan suhu (°K): ");
        float kelvin = input.nextFloat();
        float fahrenheat = (float) (1.8*(kelvin-273))+32;
        System.out.print("K = "+fahrenheat +"°K");
    }
//    kelvin

}
