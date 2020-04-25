package sixthTask;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Loader {
    public static void main(String[] args) {
        Calendar birthday = Calendar.getInstance(); // По этому календарю будем вести отсчёт ДР
        Calendar today = Calendar.getInstance(); //По этому календарю будем определять текущий год
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.YYYY - EEEE"); //Задаём формат времени
        birthday.set(1997,4,18); // 18 мая 1997 мой ДР
        int[] dayCounter = new int[7]; //Тут будем считать, в какие дни у меня было ДР
        int myAge = today.get(Calendar.YEAR) - birthday.get(Calendar.YEAR); // Определяем мой возраст

        for (int i = 0; i <= myAge; i++) // И идём по кадому году
        {
            System.out.println(i + " - " + dateFormat.format(birthday.getTime()));
            dayCounter[birthday.get(Calendar.DAY_OF_WEEK)-1]++; //Увеличиваем счётчик того дня недели, на который выпол ДР
            birthday.add(Calendar.YEAR, 1); //Прибавляем год к birthday
        }
        printWeekDays(dayCounter); //Выводим статистику по дням
    }
    private static void printWeekDays(int days[])
    {
        if (days.length != 7) System.out.println("Error!");
        else {
            System.out.println("Количество дней рождений по дням недели: ");
            String[] weekDay = new String[days.length]; //Храним названия дней недели
            for (int i = 0; i < days.length; i++) { //Присваиваем названия дней недели
                switch (i) {
                    case 0:
                        weekDay[0] = "Понедельник";
                        break;
                    case 1:
                        weekDay[1] = "Вторник";
                        break;
                    case 2:
                        weekDay[2] = "Среда";
                        break;
                    case 3:
                        weekDay[3] = "Четверг";
                        break;
                    case 4:
                        weekDay[4] = "Пятница";
                        break;
                    case 5:
                        weekDay[5] = "Суббота";
                        break;
                    case 6:
                        weekDay[6] = "Воскресенье";
                        break;
                }
            }
            for (int j = 0; j < days.length; j++) { //И выводим сводку по каждому дню недели
                System.out.println(weekDay[j] + " - " + days[j] + " раз(а)");
            }
        }
    }
}
