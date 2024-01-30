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
        double sum = 0;

        String a = String.valueOf(num);
        for (int i = 0; i < a.length(); i++) {
            sum+= Integer.parseInt(String.valueOf(a.charAt(i)));
        }
        return sum / a.length();
    }
}
