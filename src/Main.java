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


    }    }





