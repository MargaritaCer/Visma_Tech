import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("You can insert an unspecified amount of natural numbers (1, 2, 3 and etc.) except 0. 5" +
                "Please separate numbers by pressing 'Enter' key. \n" +
                "Enter 0 to finish.");
        EnterData(arrayList);
        System.out.println("Data insertion is done");

        IntegerArrayPrinter.printSumOfAllNumbersDividedByNumberOfTodayDay(arrayList);

        IntegerArrayPrinter.chooseWhatToPrintNext(arrayList);
    }

    private static void EnterData(ArrayList<Integer> arrayList) {
        try {
            ActionsWithNumbers.inputNumbersToCollection(arrayList);
        } catch (Exception e) {
            System.out.println("Only natural numbers is allowed. \n" +
                    "Please continue.");
            EnterData(arrayList);
        }
    }
}