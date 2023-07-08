import java.util.ArrayList;

public class IntegerArrayPrinter {
    private static void printAllNumbersOfCollection(ArrayList<Integer> arrayList) {
        System.out.print("List of inserted numbers: ");
        for (int number : arrayList) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private static void printCollectionSize(ArrayList<Integer> arrayList) {
        System.out.println("Amount of numbers in collection is: " + arrayList.size());
    }

    public static void printSumOfAllNumbersDividedByNumberOfTodayDay(ArrayList<Integer> arrayList) {
        int sum = ActionsWithNumbers.getSumOfAllInsertedNumbers(arrayList);
        int dayNumber = ActionsWithNumbers.getNumberOfCurrentDay();
        double result = (double) sum / dayNumber;
        System.out.printf("The sum of all numbers divided by a number of today's day is: " + "%,.2f", result);
        System.out.println("");
    }

    public static void chooseWhatToPrintNext(ArrayList<Integer> arrayList) {
        System.out.println("If you would like to know size (amount) of your collection element, please enter 'Size'. \n" +
                "If you would like to see all the numbers from your collection please enter 'Col'. " +
                "If you would like to finish press any key");
        String response = Main.scanner.nextLine();
        while (!response.equalsIgnoreCase("Size") || !response.equalsIgnoreCase("Col")) {
            if (response.equalsIgnoreCase("Size")) {
                printCollectionSize(arrayList);
            } else if (response.equalsIgnoreCase("Col")) {
                printAllNumbersOfCollection(arrayList);
            } else {
                System.out.println("Good bye");
                break;
            }
            System.out.println("If you would like to know size (amount) of your collection element, please enter 'Size'. \n" +
                    "If you would like to see all the numbers from your collection please enter 'Col'. \n" +
                    "If you would like to finish press any key");
            response = Main.scanner.nextLine();
        }
    }
}