public class Main {
    public static void main(String[] args) {
        System.out.println("Homework4");
        //Задача 1
        {
            int age = 13;
            if (age >= 18) {
                System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
            } else {
                System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
            }
        }
        //Задача 2
        int t = 1;
        if (t < 5) {
            System.out.println("На улице " + t + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + t + " градусов, можно идти без шапки");
            System.out.println("На улице " + t + " градусов, можно идти без шапки");
        }
        //Задача 3
        int speed =75;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        //Задача 4
        {
            int age = 30;
            if (age < 2) {
                System.out.println("Если возраст человека равен " + age + ", то ему пора спать");
            } else if (age >= 2 && age <= 6) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужноходить в детский сад");
            } else if (age >= 7 && age <= 18) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
            } else if (age >= 18 && age <= 23) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно учиться в университете");
            } else if (age >= 24 && age <= 60) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
            } else {
                System.out.println("Если возраст человека равен " + age + ", то ему пора отдохнуть");
            }
        }
        //Задача 5

        int age = 12;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то он не может кататься на аттракционе");
        }else if(age > 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься только в сопровождении взрослого");
        }else {
            System.out.println("Если возраст ребенка " + age + ", то он может кататься на аттракционе без сопровождения взрослого");
        }
        //Задача 6
        int capasity = 102;
        int numSeatPlace = 60;
        int numPassengerrs = 80;

        if (numPassengerrs < numSeatPlace) {
            System.out.println("В вагоне есть свободные сидячие места.");
        } else if (numPassengerrs < capasity) {
            System.out.println("В вагоне есть свободные стоячие места");
        }else {
            System.out.println("В вагоне нет свободных мест");
        }
        //Задача 7
        int one = 1;
        int two = 2;
        int three = 3;

        if (one >= two && one >= three) {
            System.out.println("Наибольшее число " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Наибольщее число " + two);
        } else {
            System.out.println("Наибольшее число " + three);
        }


    }
}