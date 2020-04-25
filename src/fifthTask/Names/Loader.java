package fifthTask.Names;

import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите фамилию, имя и отчество с больщой буквы на русском языке: ");
        String fullName = scanner.nextLine();
        scanner.close();
        //Используем регуляррные выражения
        String[] splittedNames = fullName.replaceAll("[^А-я^ё^й^\\s+]", "").split("\\s+");
        if (splittedNames.length != 3) {
            System.out.println("Error! Bad format!");
        } else {
            //Строка для проверки: Гар@маш ВикторVL ""BujhИгоревич
            //Ещё одна строка для проверки: HpoaskfИванов "SeСемё30-9yн Ива_ныч
            //И ещё строка: Иван Петров
            System.out.println("Фамилия: " + splittedNames[0]);
            System.out.println("Имя: " + splittedNames[1]);
            System.out.println("Отчество: " + splittedNames[2]);
        }
    }

}
