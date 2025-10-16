//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Циклы, урок 2. Домашнее задание №7.");
        // Задание 1.
        byte firstFriday = 2;
        for (byte day = 1; day <= 31; day++) {
            if (day < firstFriday) { // Отсечка начальных дней месяца до первой пятницы.
                continue;
            }
            if ((day - firstFriday) % 7 == 0) { // Проверка является ли день пятницей.
                System.out.println("Сегодня пятница, " + day + " число. Необходимо подготовить отчет.");
            }
        }
        // Задание 2, 1 вариант.
        int distance = 0;
        do {
            System.out.println("Держитесь! осталось " + (42195 - distance) + " метров.");
            distance = distance + 500;
        }
        while (distance <= 42195);
        // Задание 2, 2 вариант.
        distance = 0;
        for (; distance <= 42195; distance = distance + 500) {
            System.out.println("Держитесь! осталось " + (42195 - distance) + " метров.");
        }
        //Задание 3, 1 вариант
        int tax = 100; // Тариф за 1 день
        int pay = 1000; // Внесенная сумма
        int days = 1; // Счетчик дней
        if (pay < tax) { // Проверка на количество внесенных средств
            System.out.println("Недостаточная сумма");
            days = 0;
        }
        while (pay > tax) {
            days++;
            if (days % 5 == 0) {
                continue;
            }
            pay = pay - tax;
        }
        System.out.println("Внесенная сумма достаточна для " + days + " дней стоянки ТС.");
        // Задание 3, 2 вариант
        days = 1;
        pay = 1000;
        if (pay < tax) { // Проверка на количество внесенных средств
            System.out.println("Недостаточная сумма");
            days = 0;
        }
        for (; pay > tax; ) {
            days++;
            if (days % 5 == 0) {
                continue;
            }
            pay = pay - tax;
        }
        System.out.println("Внесенная сумма достаточна для " + days + " дней стоянки ТС.");
        // Задание 4.
        int month = 0;
        double total = 0;
        while (true) {
            total = total + 15000;
            month++;
            if (month % 6 == 0) {
                total = total + total * 0.07;
            }
            System.out.printf("Сумма на счету %.2f рублей. Месяц %d", total, month);
            System.out.println();
            if (total >= 12000000) {
                break;
            }
        }
        // Задание 5.
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge < 100 && overheats <= 3) {
            System.out.println("заряд" + charge + "время" + minute);
            if (minute % 10 == 0) {
                overheats++;
                minute = minute + 2;
                continue;
            }
            if (overheats == 3) {
                System.out.println("Зарядка прекращена. Текущий заряд " + charge + "%");
                break;
            }
            minute++;
            charge = charge + 2;
        }
        System.out.println("Время зарядки составило " + minute + " минут.");
    }
}