import java.util.Scanner;

public class KelilingLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double jari2, keliling, phi=3.14;

        System.out.print("Masukkan jari-jari : ");
        jari2 = input.nextDouble();

        keliling = 2 * phi * jari2;
        System.out.println("Keliling : " +keliling);
    }
}