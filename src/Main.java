import java.util.Scanner;
import java.util.InputMismatchException;

void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Введите число, будут выведены все простые числа идущие до него:");
    boolean notError = true;
    int num = 0;
    while (notError) {
        try {
            num = in.nextInt();
            if (num <1) {
                System.out.println("Число должно быть больше 1-го");

            } else notError = false;
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введите целое число!");
            in.next();

        }
    }

    for (int i = 2; i<num+1; i++){
        boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++){
            if (i % j == 0) {
                isPrime = false;
            }

        }
            if (isPrime) {
            System.out.printf("%d ", i);
        }
    }
}