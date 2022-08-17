public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {

        int[] amountOfExpenses = generateRandomArray();

        int sum = 0;

        // Вариант решения с foreach
        for (int element: amountOfExpenses) {
            sum += element;
        }
        // Вариант решения с for
        // for (int index = 0; index < amountOfExpenses.length; index++) {
        // sum += arr[index];
        // }

        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
    }

    public static void task2() {
        
        int[] amountOfExpenses = generateRandomArray();

        int maxExpense = -1;

        for (int i = 0; i < amountOfExpenses.length; i++) {

            if (amountOfExpenses[i] > maxExpense) {
                maxExpense = amountOfExpenses[i];
            }
        }

        int minExpense = 200_001;

        for (int j = 0; j < amountOfExpenses.length; j++) {

            if (amountOfExpenses[j] < minExpense) {
                minExpense = amountOfExpenses[j];
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + minExpense + " рублей. Максимальная сумма трат за день составила " + maxExpense + " рублей.");

    }

    public static void task3() {

        int[] amountOfExpenses = generateRandomArray();

        double sum = 0;

        for (int element: amountOfExpenses) {
            sum += element;
        }
        double average = (sum * 1.0) / (amountOfExpenses.length * 1.0);

        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");
    }

    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int index = (reverseFullName.length - 1); index >= 0; index--) {
            System.out.print(reverseFullName[index]);
        }

    }
}