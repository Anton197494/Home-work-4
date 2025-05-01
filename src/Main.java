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







    }    }





