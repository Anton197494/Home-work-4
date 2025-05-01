public class Main {
    public static void main(String[] args) {
        int age = 18;
        if (age >= 18) {
            System.out.println("Человек совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Человек не достиг совершеннолетия");
        }
        int temperature = 8;
        if (temperature < 5) {
            System.out.println("На улице холодно нужно надеть шапку");
        }
        else {
            System.out.println("Можно идти без шапки");
        }

        int speed = 60;
        if (speed > 60) {
            System.out.println("Придется платить штраф");
        }
        else {
            System.out.println("Можно ездить спокойно");
        }
        int age1 = 25;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен "+age1+ " то ему нужно ходить в детский сад");
        }
        if (age1 >= 7 && age1 <= 17) {
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить в школу");
        }
        if (age1 >= 18 && age1 <= 24) {
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить в университет");
        }
        if (age1 >24) {
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить на работу");
        }
        int age2 = 15;
        boolean parents = false;
        if (age2 < 5) {
            System.out.println("Если возраст ребенка равен " + age2 + " то ему нельзя кататься на атракционе");
        }
        if (age2 > 5 && age2 < 14 && parents) {
            System.out.println("Если возраст ребенка равен " + age2 + " то ему можно кататься на атракционе в сопровождении взрослого");
        }
        if (age2 > 5 && age2 < 14) {
            System.out.println("Если возраст ребенка равен " + age2 + " то ему нельзя кататься на атракционе без сопровождения взрослого");
        }
        if (age2 > 14) {
            System.out.println("Если возраст ребенка равен " + age2 + " то ему можно кататься на атракционе без сопровождения взрослого");
        }

        int carriage = 102;
        int seating = 60;
        int standingRoom = carriage - seating;
        if (carriage <= 102 &&  carriage != 0) {
            System.out.println("Мест в вагоне осталось " + carriage);
        }
        else {
            System.out.println("Мест в вагоне не осталось");
        }
        if (seating <= 60 &&  seating != 0) {
            System.out.println("Сидячих мест в вагоне осталось " + seating);
        }
        else {
            System.out.println("Сидячих мест в вагоне не осталось");
        }
        if (standingRoom <= 42 &&  standingRoom != 0) {
            System.out.println("Стоячих мест в вагоне осталось " + standingRoom);
        }
        else {
            System.out.println("Стоячих мест в вагоне не осталось");
        }

        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two &&  one > three) {
            System.out.println("Первое число самое большое");
        }
        if (two > one &&  two > three) {
            System.out.println("Второе число самое большое");
        }
        else {
            System.out.println("Третье число самое большое");
        }










    }    }





