import java.util.Scanner;

public class KelilingSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c, keliling;

        System.out.print("Masukkan a: ");
        a = input.nextInt();
        System.out.print("Masukkan b: ");
        b = input.nextInt();
        System.out.print("Masukkan c: ");
        c = input.nextInt();
        keliling = a + b + c;
        System.out.println("keliling: " +keliling);
    }
}