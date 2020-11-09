import java.util.Scanner; // импортируем класс Scanner
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input an integer from 1 and above:");
        int n = in.nextInt(); // метод in.nextInt() возвращает введённое число с клавиатуры
        for (int x = 1; x <= n; x++) {
            if ((x % 3 == 0) & (x % 5 != 0)) { // число кратно 3, но не кратно 5
                System.out.println(x + " Fizz");
            } else if((x % 5 == 0) & (x % 3 != 0)) { // число кратно 5, но не кратно 3
                System.out.println(x + " Buzz");
            } else if((x % 3 == 0) & (x % 5 == 0)) { // число кратно 3 и кратно 5
                System.out.println(x + " FizzBuzz");
            } else {
                System.out.println(x); // для всех остальных чисел
            }
        }
    }
}
