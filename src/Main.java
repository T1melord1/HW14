import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите любое целое не отрицательное число: ");
        int input = new Scanner(System.in).nextInt();
        System.out.println(avg(input));

    }

    //todo Дописать логику работы метода сюда. Метод main не трогаем!!!
    //todo заменить 0 на корректный результат.
    public static double avg(int num) {
        int sum = 0;
        double digit = 0;
        String a = String.valueOf(num);
        for (int i = 0; i < a.length(); i++) {
            char b = a.charAt(i);
            digit = Integer.valueOf(String.valueOf(b));
            sum += digit;
        }

        return (double)sum/a.length();
    }
}
