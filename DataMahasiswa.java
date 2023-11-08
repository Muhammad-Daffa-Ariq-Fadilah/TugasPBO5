import java.util.Scanner;
public class DataMahasiswa {
  public static void main (String[] args){
      Scanner input = new Scanner(System.in);
      String npm, nama, grade, keterangan;
      double nilaiKehadiran, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAKhir;
      System.out.print("Masukkan NPM: ");
      npm = input.nextLine();
      System.out.print("Masukkan Nama: ");
      nama = input.nextLine();
      System.out.print("Masukkan Nilai Kehadiran: ");
      nilaiKehadiran = input.nextDouble();
      System.out.print("Masukkan Nilai tugas: ");
      nilaiTugas = input.nextDouble();
      System.out.print("Masukkan Nilai UTS: ");
      nilaiUTS = input.nextDouble();
      System.out.print("Masukkan Nilai UAS: ");
      nilaiUAS = input.nextDouble();
      nilaiAKhir = 0.1*nilaiKehadiran + 0.2*nilaiTugas + 0.3*nilaiUTS + 0.4*nilaiUAS;
      System.out.println();
      System.out.println("NPM Mahasiswa: " + npm);
      System.out.println("Nama Mahasiswa: " + nama);
      System.out.println("Nilai Rata-rata: " + nilaiAKhir);
      if(nilaiAKhir >= 76){
        grade = "A";
        keterangan = "ISTIMEWA";
      }else if(nilaiAKhir >= 66){
        grade = "B";
        keterangan = "BAIK";
      }else if(nilaiAKhir >= 56){
        grade = "C";
        keterangan = "CUKUP";
      }else if(nilaiAKhir >= 46){
        grade = "D";
        keterangan = "KURANG";
      }else{
        grade = "E";
        keterangan = "KURANG SEKALI";
      }
      System.out.println("Grade: " + grade);
      System.out.println("Keterangan: " + keterangan);
  }
}