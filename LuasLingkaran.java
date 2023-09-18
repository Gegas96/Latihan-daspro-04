import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double jari2, luas, phi=3.14;

        System.out.print("Masukkan jari-jari : ");
        jari2 = input.nextDouble();

        luas = phi * jari2 * jari2;
        System.out.println("Luas : " +luas);
    }
}