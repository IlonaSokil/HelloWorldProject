//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static String name = "Ilona";
    static int age = 23;
    static double height = 1.68;
    static boolean isQA = true;

    public static void main(String[] args) {
        securityCheckBuyAge();
        actionWithDifferentDayOfWeek();
        Numbers1to5();
        printVariables();
        printHelloWorld();
        linearSearch();
        checkTemperature();
    }
    public static void checkTemperature() {
        int temperature = -1;
        String result = (temperature > 0) ? "плюс" : "мінус";
        System.out.println("Температура: " + result);
    }
public static void linearSearch() {
    int[] numbers = {10, 20, 30, 40, 50};
    int target = 30;

    int result = linearSearch(numbers, target);

        if (result != -1) {
        System.out.println("Елемент знайдено, індекс: " + result);
    } else {
        System.out.println("Елемент не знайдено");
    }
}

    public static void printHelloWorld() {
        System.out.println("Hello, World!");
    }

    public static void printVariables() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
        System.out.println(isQA);
    }

    public static void securityCheckBuyAge() {
        if (age < 18) {
            System.out.println("Доступ заборонено");
        } else {
            System.out.println("Доступ дозволено");
        }
    }

    public static void Numbers1to5() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    public static void actionWithDifferentDayOfWeek() {
        String day = "Saturday";

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Робочий день");
                break;

            case "Saturday":
            case "Sunday":
                System.out.println("Вихідний день");
                break;

            default:
                System.out.println("Невідомий день");

        }
    }
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}