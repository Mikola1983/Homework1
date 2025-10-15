//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Условные операторы 2, домашнее задание № 5.");
        // Задание 1.
        byte clientOS = 0;
        if (clientOS == 0)
        {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else
            System.out.println("Установите версию приложения для Android по ссылке");
        // Задание 2.
        short clientDeviceYear = 2015;
        if (clientDeviceYear >= 2015)
        {
            System.out.print("Установите версию приложения ");
        }
        else
        {
            System.out.print("Установите облегченную версию приложения ");
        }
        if (clientOS == 1)
        {
            System.out.println("для Android по ссылке");
        }
        else
        {
            System.out.println("для iOS по ссылке");
        }
        // Задание 3.
        int year = 2021;
        if ((year%4 == 0 && year%100 != 0) || year%400 == 0)
        {
            System.out.println(year + " год является високосным.");
        }
        else
        {
            System.out.println(year + " год не является високосным.");
        }
        if (year < 1584)
        {
            System.out.println(year + " год не является високосным.");
        }
        // Задание 4.
        short deliveryDistance = 95;
        short deliveryTime;
        if (deliveryDistance <= 20)
        {
            deliveryTime = 1;
            System.out.println("Потртебуется дней: " + deliveryTime + " для доставки");
        }
        else if (deliveryDistance > 20 && deliveryDistance < 60)
        {
            deliveryTime = 2;
            System.out.println("Потртебуется дней: " + deliveryTime + " для доставки.");
        }
        else if (deliveryDistance >= 60 && deliveryDistance <= 100)
        {
            deliveryTime = 3;
            System.out.println("Потртебуется дней: " + deliveryTime + " для доставки.");
        }
        else System.out.println("Доставки свыше 100 км. нет.");
        // Задание 5.
        byte monthNumber = 12;
        switch (monthNumber)
        {
            case 1: System.out.println("Январь, сезон зима.");
                break;
            case 2: System.out.println("Февраль, сезон зима.");
                break;
            case 3: System.out.println("Март, сезон весна.");
                break;
            case 4: System.out.println("Апрель, сезон весна.");
                break;
            case 5: System.out.println("Май, сезон весна.");
                break;
            case 6: System.out.println("Июнь, сезон лето.");
                break;
            case 7: System.out.println("Июль, сезон лето.");
                break;
            case 8: System.out.println("Август, сезон лето.");
                break;
            case 9: System.out.println("Сентябрь, сезон осень.");
                break;
            case 10: System.out.println("Октябрь, сезон осень.");
                break;
            case 11: System.out.println("Ноябрь, сезон осень.");
                break;
            case 12: System.out.println("Декабрь, сезон зима.");
                break;
            default: System.out.println("В году 12 месяцев!");
        }

    }
    }