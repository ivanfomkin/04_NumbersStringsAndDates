package fifthTask.PhoneNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loader {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter count of number: ");
        try {
            int countOfNumbers = Integer.parseInt(bufferedReader.readLine());
            String[] phoneNumber = getPhoneNumbers(countOfNumbers, bufferedReader);

            System.out.println("Your phone numbers: ");
            printNumbers(phoneNumber);
        } catch (IOException ex) {
            System.out.println("Error " + ex);
        }

    }

    private static String[] getPhoneNumbers (int length, BufferedReader reader) {//Метод возвращает массив номеров длинной length
        String[] phoneNumbers = new String[length];
        for (int i = 0; i < length; i++) { //Проходимся по всем элементам
            System.out.print("Enter " + (i + 1) + " number: ");

                try {
                    phoneNumbers[i] = reader.readLine().replaceAll("[^0-9]|\\s++", ""); //Принимаем строку и удаляем всё, кроме цифр
                    if (phoneNumbers[i].length() == 10) {
                        phoneNumbers[i] = "7" + phoneNumbers[i]; //Добавляем 7 в начало, если номер длинной 10 символов
                    } else if (phoneNumbers[i].charAt(0) != '7') //Если номер не начинается с  7
                    {
                        phoneNumbers[i] = "7" + phoneNumbers[i].substring(1); //Убираем первый символ и стави вместо него 7
                    }
                } catch (IOException exeption) {
                    System.out.println("Exeption " + exeption);
                }

        }
        return phoneNumbers;
    }

    private static void printNumbers(String[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}