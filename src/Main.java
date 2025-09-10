//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.ArrayList;

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
        userCalculator();
        printStudents();
        showStudentNames();
        showCities();
        divideNumbers(10, 2);
        divideNumbers(5, 0);
        checkLoginTest();
    }

    public static void checkLoginTest() {
        String expected = "Login successful";
        String actual = "Login successful";

        if (expected.equals(actual)) {
            System.out.println("Тест пройдено");
        } else {
            System.out.println("Тест не пройдено");
        }
    }

    public static void divideNumbers(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("На нуль ділити не можна");
        }
    }

    public static void showCities() {
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Тернопіль");
        cities.add("Бровари");
        cities.add("Яремче");
        cities.add("Львів");

        System.out.println(cities);
    }


    public static void printStudents() {
        String[] students = {"Ілона", "Cлавік", "Інеса", "Лєра", "Марійка"};

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }

    public static void showStudentNames() {
        String[] students = {"Олег", "Андрій", "Софія", "Катерина", "Дмитро"};

        for (String student : students) {
            System.out.println(student);
        }
    }

    public static void userCalculator() {
        int result = Calculator.add(5, 7);
        System.out.println("Результат: " + result);
    }

    public static void checkTemperature() {
        int temperature = -1;
        String result = (temperature > 0) ? "плюс" : "мінус";
        System.out.println("Температура: " + result);
    }

    public static void linearSearch() {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 40;

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
        for (int i = 1; i < 5; i++) {
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
