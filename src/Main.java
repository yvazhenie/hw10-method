import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        year(2041);
        task2();
        findOsVersion(2, 2015);
        task3();
        int time1 = calculatedTime(19);
        int time2 = calculatedTime(79);
        int time3 = calculatedTime(101);
        System.out.println("Потребуется дней: " + time1);
        System.out.println("Потребуется дней: " + time2);
        System.out.println("Потребуется дней: " + time3);


    }

    public static void task1() {
        System.out.println("Задача 1");
    }

    public static void year(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
    }

    public static void findOsVersion(int osType, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (osType == currentYear) {
            if (clientDeviceYear == currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear == currentYear) {
                System.out.println("Установите облегченную версию приложения для android по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для android по ссылке");
            }

        }

    }

    public static void task3() {
        System.out.println("Задача 3");
    }

    public static int calculatedTime(int deliveryDistance) {
        int time = 1;
        if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            time++;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            time++;
        }
        if (deliveryDistance > 100) {
            return 0;
        }
        return time;
    }


}