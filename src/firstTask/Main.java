package firstTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.count += 7843;
        System.out.println(container.count);

        System.out.print("Enter someone number: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sum of all digits is " + sumDigits(scanner.nextInt()));
        scanner.close();


    }

    public static Integer sumDigits(Integer number) { //Сделаем метод static чтобы вызывать его в этом же классе
        Integer sum = 0;
        String stringNumber = number.toString();
        for (int i = 0; i < stringNumber.length(); i++) {
            sum += Character.digit(stringNumber.charAt(i), 10);
        }
        return sum;
    }
}

