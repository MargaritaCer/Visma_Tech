import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ActionsWithNumbers {
    public static void inputNumbersToCollection(ArrayList<Integer> arrayList) {
        Main.scanner = new Scanner(System.in);
        int naturalNumber = 1;
        while (naturalNumber != 0) {
            naturalNumber = Main.scanner.nextInt();
            if (naturalNumber != 0) {
                arrayList.add(naturalNumber);
            }
        }
        Main.scanner.nextLine();
    }

    public static int getSumOfAllInsertedNumbers(ArrayList<Integer> arrayList) {
        int sum = 0;
        for (int number : arrayList) {
            sum += number;
        }
        return sum;
    }

    public static int getNumberOfCurrentDay() {
        LocalDate today = LocalDate.now();
        DayOfWeek dayOfWeek = today.getDayOfWeek();

        HashMap<DayOfWeek, Integer> weekDaysNumbers = new HashMap<>();
        weekDaysNumbers.put(DayOfWeek.valueOf("MONDAY"), 1);
        weekDaysNumbers.put(DayOfWeek.valueOf("TUESDAY"), 2);
        weekDaysNumbers.put(DayOfWeek.valueOf("WEDNESDAY"), 3);
        weekDaysNumbers.put(DayOfWeek.valueOf("THURSDAY"), 4);
        weekDaysNumbers.put(DayOfWeek.valueOf("FRIDAY"), 5);
        weekDaysNumbers.put(DayOfWeek.valueOf("SATURDAY"), 6);
        weekDaysNumbers.put(DayOfWeek.valueOf("SUNDAY"), 7);

        var daysNumber = weekDaysNumbers.get(dayOfWeek);
        return daysNumber;
    }
}