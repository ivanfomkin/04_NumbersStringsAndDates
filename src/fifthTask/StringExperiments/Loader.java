package fifthTask.StringExperiments;

import java.util.Scanner;

public class Loader
{
    public static void main(String[] args)
    {
//        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        System.out.print("Введите данные о заработке каждого участника: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        //Тестовая строка: Женя заработала 900 рублей, Володя заработал 6030 рублей, Валя заработал 842 рубля, Ваня - 23000
        //Должно получиться 30772
        int sum = 0;

        String[] arrayOfString = text.split(" "); //Делим строку на массивы строк с разделителем в виде пробела
        for (int i = 0; i < arrayOfString.length; i++) //Перебираем все строки
        {
            //Было так:
//            String[] str = new String[arrayOfString.length];
//            str[i] = arrayOfString[i].replaceAll("[^0-9]","");
//            Удалим лишнюю переменную и все дейтсвия будем производить с массивом arrayOfString
            if (!arrayOfString[i].replaceAll("[^0-9]","").equals("")){
                sum += Integer.parseInt(arrayOfString[i]);
            }

        }
        System.out.println("Sum is " + sum);
        scanner.close();
    }
}