package assignments3;

import java.util.Random;
import java.util.Scanner;

public class Assignments3 {

    public static void main(String[] args) {
        Random rand = new Random();
        String check;
        Scanner sc = new Scanner(System.in);
        do {
            int n = rand.nextInt(100) + 1;
            System.out.print("Nhap: ");
            check = sc.nextLine();
            if (n % 2 == 0) {
                System.out.println(n + " La so chan!");
            } else {
                System.out.println(n + " La so le!");
            }

        } while (check.equals("yes"));

    }

}
