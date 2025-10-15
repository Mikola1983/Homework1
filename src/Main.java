//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Циклы 1, домашнее задание № 6.");
        // Задание 1.
        for (int i=1; i <= 10; i++)
        {
        System.out.println(i);
        }
        // Задание 2.
        for (int i=10; i >= 1; i--)
        {
        System.out.println(i);
        }
        // Задание 3.
        for (int i=0; i<=17; i = i+2)
        {
        System.out.println(i);
        }
        // Задание 4.
        for (int i = 10; i>=-10; i--)
        {
        System.out.println(i);
        }
        // Задание 5.
        for (int i = 1904; i <= 2096; i= i+4)
        {
        if (i%100!=0 || i%400==0)
            {
            System.out.println(i + " год является високосным");
            }
        }
        // Задание 6.
        for (int i = 1; i<=14; i++)
        {
        System.out.println(i*7);
        }
        // Задание 7.
        int j = 1;
        System.out.println(j);
        for (int i = 1; i <= 9; i++)
        {
        System.out.println(j=j*2);
        }
        // Задание 8.
        double capital = 0;
        for (int i = 1; i <=12; i++)
        {
        capital = capital + 29000;
        System.out.println("Месяц " + i + ", сумма накоплений равна " + capital + " рублей.");
        }
        // Задание 9. Сумма считается с учетом добавления 29000 на счет каждый месяц.
        capital = 29000;
        for (int i = 1; i <=12; i++)
        {
        capital = capital + capital*0.01;
        System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей. %n",i,capital);
        capital = capital + 29000;
        }
        // Задание 10.
        for (int i = 1; i <= 10; i++)
        {
        System.out.println("2*" + i + "=" + i*2);
        }
    }
    }