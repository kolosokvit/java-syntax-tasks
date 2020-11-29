import java.util.Scanner;
import java.util.stream.IntStream;

public class LuhnAlgorithm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input your card number");
        String cardNumber = in.nextLine();
        IntStream intStream = cardNumber.chars();
        int[] yourNumber = intStream.toArray();
        int l = yourNumber.length;
        for (int i = 0; i < l; i++) {
            yourNumber[i] = Character.getNumericValue(yourNumber[i]);
        }
        for (int i = 0; i < l; i += 2) {
            yourNumber[i] = yourNumber[i] * 2;
            if (yourNumber[i] >= 10) {
                yourNumber[i] = yourNumber[i] - 9;
            }
        }
        int checkSum = 0;
        for (int j : yourNumber) {
            checkSum += j;
        }
        if (checkSum % 10 == 0) {
            System.out.println("Your card number is valid.");
        } else {
            System.out.println("Your card number is invalid.");
        }
    }
}
