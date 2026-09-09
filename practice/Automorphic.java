import java.util.Scanner;

class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int original = n;

        int square = n * n;

        int digits = 0;
        int temp = n;

        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }

        int power = (int) Math.pow(10, digits);

        if (square % power == original) {
            System.out.println("Automorphic Number");
        } else {
            System.out.println("Not Automorphic Number");
        }
    }
}