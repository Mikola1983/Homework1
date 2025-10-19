import java.util.Arrays;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Методы. Домашнее задание 10.");
        int currentYear = 2021;
        int deviceOperationalSistem = 1;
        int deviceYear = 2020;
        int distance = 15;
        System.out.println("Задание1.");
        detectYear(currentYear);
        System.out.println("Задание 2.");
        detectOS(deviceYear, deviceOperationalSistem);
        System.out.println("Задание 3.");
        int days = deliveryTime(distance);
        printDays(days);

    }

    // Задание 1
    public static void detectYear(int year) {
        int firstYear = 1584;
        if ((year - firstYear) % 4 == 0 && (year - firstYear) % 100 != 0 && (year - firstYear) % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else if ((year - firstYear) % 4 != 0 || (year - firstYear) % 100 == 0 && (year - firstYear) % 400 != 0) {
            System.out.println(year + " год не является високосным.");
        } else System.out.println(year + " год является високосным.");
    }

    // Задание 2.
    public static void detectOS(int clientDeviceYear, int deviceOS) {
        if (deviceOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (deviceOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (deviceOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (deviceOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

    }

    // Задание 3.
    public static int deliveryTime(int deliveryDistance) {
        int deliveryTime = 0;
        if (deliveryDistance <= 20) {
            deliveryTime = 1;
        } else if (deliveryDistance < 60) {
            deliveryTime = 2;
        } else if (deliveryDistance <= 100) {
            deliveryTime = 3;
        } else {
            deliveryTime = 5;
        }
        return deliveryTime;
    }

    public static void printDays(int days) {
        if (days <= 3) {
            System.out.println("Потртебуется дней: " + days + " для доставки");
        } else System.out.println("Доставки свыше 100 км. нет");
    }
}