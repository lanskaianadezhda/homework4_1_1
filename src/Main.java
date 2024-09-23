public class Main {
    public static void main(String[] args) {
        // task 1
        System.out.println("Задача 1");

        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека меньше " + age + ", то надо подождать");
        }

        // task 2
        System.out.println("Задача 2");

        int temperature = 10;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        // task 3
        System.out.println("Задача 3");

        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " , то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " , то можно ездить спокойно");
        }

        // task 4
        System.out.println("Зачача 4");

        int age1 = 23;
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + " , то ему нужно ходить в детский сад");
            if (age1 >= 7 && age1 <= 17) {
                System.out.println("Если возраст человека равен " + age1 + " , то ему нужно ходить в школу");
                if (age1 >= 18 && age1 <= 24) {
                    System.out.println("Если возраст человека равен " + age1 + " , то ему нужно ходить в университет");
                    if (age1 > 24) {
                        System.out.println("Если возраст человека равен " + age1 + " , то ему нужно ходить  на работу");
                    }


                    //task 5
                    System.out.println("Задача 5");
                }
            }
        }
    }
}