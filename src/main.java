package src;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of times you want to add 10");

        int numTimes = input.nextInt();

        int result = 10;

        for(int i = 0; i < numTimes; i++) {
            result += 10;
        }

        System.out.println(result);

        input.close();
    }
}
