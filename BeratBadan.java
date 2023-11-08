import java.util.Scanner;
public class BeratBadan{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan berat badan (kg): ");
        double beratBadan = input.nextDouble();
        System.out.print("Masukkan tinggi badan (m): ");
        double tinggiBadan = input.nextDouble();
        double imt = beratBadan / (tinggiBadan * tinggiBadan);
        String kriteria = "";
        if(imt < 18.5){
            kriteria = "Berat Badan Kurang";
        }else if (imt < 25){
            kriteria = "Berat Badan Ideal";
        }else if (imt < 30){
            kriteria = "Berat Badan Lebih";
        }else if (imt < 40){
            kriteria = "Gemuk";
        }else{
            kriteria = "Sangat Gemuk";
        }
        System.out.println("IMT Anda: " + imt);
        System.out.println("Kriteria Kegemukan: " + kriteria);
    }
}