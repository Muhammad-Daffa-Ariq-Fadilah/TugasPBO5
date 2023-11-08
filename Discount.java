import java.util.Scanner;
public class Discount {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        double Pembelian,jumlahAkhir;
        System.out.print("Masukkan Total Pembelian: ");
        Pembelian = input.nextDouble();
        if(Pembelian >= 50000){
            jumlahAkhir = Pembelian - (Pembelian * 0.2);
            System.out.print("Besarnya potongan: " + Pembelian * 0.2);
        }else{
            jumlahAkhir = Pembelian - (Pembelian * 0.05);
            System.out.print("Besarnya potongan: " + Pembelian * 0.05 );
        }
        System.out.println("\nJumlah yang harus dibayar: " + jumlahAkhir);
    }
}