import java.util.Scanner;
public class RomainNumerals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input your romain number using 'M' 'D' 'C' 'L' 'X' 'V' 'I' symbols:");
        String romainnumber = in.nextLine();
        char[] number = romainnumber.toCharArray(); // создаём из строки массив символов
        int arabiannumber = 0;
        char firstNumber = number[0];
        switch (firstNumber) { /* Проверяем нулевой элемент массива и присваиваем ему соответсвующее значение.
        В дальнейшем это позволяет оставаться в пределах массива при сравнении с (i-1)ым элементом массива. */
            case 'I':
                arabiannumber = 1;
                break;
            case 'V':
                arabiannumber = 5;
                break;
            case 'X':
                arabiannumber = 10;
                break;
            case 'L':
                arabiannumber = 50;
                break;
            case 'C':
                arabiannumber = 100;
                break;
            case 'D':
                arabiannumber = 500;
                break;
            case 'M':
                arabiannumber = 1000;
                break;
        }  int l = number.length;
        for (int i = 1; i < l; i++) {
            if (number[i] == 'I') {
                arabiannumber += 1;
            } else if ((number[i]) == 'M' && (number[i - 1] != 'C')) {
                arabiannumber += 1000;
            } else if ((number[i]) == 'M' && (number[i - 1] == 'C')) {
                arabiannumber += 800;
            } else if ((number[i] == 'D') && (number[i - 1] != 'C')) {
                arabiannumber += 500;
            } else if ((number[i] == 'D') && (number[i - 1] == 'C')) {
                arabiannumber += 300;
            } else if ((number[i] == 'C') && (number[i - 1] != 'X')) {
                arabiannumber += 100;
            } else if ((number[i] == 'C') && (number[i - 1] == 'X')) {
                arabiannumber += 80;
            } else if ((number[i] == 'L') && (number[i - 1] != 'X')) {
                arabiannumber += 50;
            } else if ((number[i] == 'L') && (number[i - 1] == 'X')) {
                arabiannumber += 30;
            } else if ((number[i] == 'X') && (number[i - 1] != 'I')) {
                arabiannumber += 10;
            } else if ((number[i] == 'X') && (number[i - 1] == 'I')) {
                arabiannumber += 8;
            } else if ((number[i] == 'V') && (number[i - 1] != 'I')) {
                arabiannumber += 5;
            } else if ((number[i] == 'V') && (number[i - 1] == 'I')) {
                arabiannumber += 3;
            } else if (number[i] == 'I') {
                arabiannumber += 1;
            }
        }
        System.out.println("Your number is " + arabiannumber);
    }
}
