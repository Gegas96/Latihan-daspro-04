import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double alas, tinggi, luas;

        System.out.print("Masukkan alas: ");
        alas = input.nextDouble();
        System.out.print("Masukkan tinggi: ");
        tinggi = input.nextDouble();
        luas = alas * tinggi / 2;
        System.out.println("Luas : " +luas);
    }
}