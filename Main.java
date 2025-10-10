//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Домашняя работа условный оператор");
        // Задание 1
        int age = 15;
        boolean ageSover = age >= 18;
        if (ageSover) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
// Задание 2.
        int temp = 15;
        if (temp < 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки.");
        }
// Задание 3.
        int speed = 70;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф!");
        }
// Задание 4.
        age = 42;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        } else if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в универститете.");
        } else System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу.");
        // Задание 5.
        age = 10;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");
        } else if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        // Задание 6.
        int pass = 40;
        if (pass <60)
        {
        System.out.println("В вагоне " + (60 - pass) + " сидячих мест.");
        }
        else if (pass > 60 && pass < 102)
        {
        System.out.println("В вагоне " + (102 - pass) + " стоячих мест.");
        }
        else System.out.println("В вагоне нет мест.");
        // Задание 7.
        int one;
        int two;
        int three;
        one = 10;
        two = 8;
        three = 33;
        if (one > two)
        {
            if (one > three)
            {
            System.out.println(one + " Самое большое число.");
            }
            else
            {
            System.out.println(three + " Самое большое число.");
            }
        }
        else if (two > three)
             {
             System.out.println(two + " Самое большое число.");
             }
        else System.out.println(three + " Самое большое число.");
    }
}


