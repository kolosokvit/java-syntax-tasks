import java.util.Scanner ;
public class LuhnAlgorithm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input your card number");
        String cardNumber = in.nextLine();
        char[] number = cardNumber.toCharArray();
        int[] yourNumber = new int[16];
        int l = number.length;
        for (int i = 0; i < l; i++) {
            char ch = number[i];
            int n = Character.getNumericValue(ch);
            yourNumber[i] = n;
        }
        for (int i = 0; i < l; i += 2) {
            yourNumber[i] = yourNumber[i] * 2;
            if (yourNumber[i] >= 10) {
                yourNumber[i] = yourNumber[i] - 9;
            }
        }
        int checkSumm = 0;
        for (int i = 0; i < l; i++) {
            checkSumm += yourNumber[i];
        }
        if (checkSumm % 10 == 0) {
            System.out.println("Your card number is valid");
        } else {
            System.out.println("Your card number is invalid");
        }
    }
}
