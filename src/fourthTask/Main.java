package fourthTask;

public class Main {
    public static void main(String[] args) {
//        String allLattinLeters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
//        String allRussianLetters = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя";
//
//        printSymbolsAndCodes(allLattinLeters);
//        printSymbolsAndCodes(allRussianLetters);

        printSymbolsAndCodes('A','Z');
        printSymbolsAndCodes('a','z');
        printSymbolsAndCodes('А','я');
        printSymbolsAndCodes('а','А');

    }

    //Метод, который выводит коды символов с перечислением в строку
    private static void printSymbolsAndCodes(String string) {
        for (int i = 0; i < string.length(); i++) {
            System.out.println("\t" + string.charAt(i) + "\t" + ((int) string.charAt(i)));
        }
    }

    //Метод выводит коды символов от 1го (указан как аргумент) до 2го (указан как аргумент)
    private static void printSymbolsAndCodes(char firstSybmbol, char secondSymbol) {
        if (firstSybmbol > secondSymbol) { //Проверяем, сработает ли цикл
            System.out.println("Ошибка!");
        } else {
            for (char a = firstSybmbol; a <= secondSymbol; a++) {
                System.out.println("\t" + a + "\t" + ((int) a));
            }
        }
    }
}
