


public class Main {
    public static void printYear(int year) {
        if (year <= 0) {
            System.out.println("Год " + year + " не существует");
        } else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Год " + year + " является високосным.");

        } else {
            System.out.println("Год " + year + " не является високосным.");
        }
    }

    public static void printClientDevice(int operatingSystem, int clientYearDevice) {
        if (operatingSystem == 0 && clientYearDevice >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (operatingSystem == 0 && clientYearDevice < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (operatingSystem == 1 && clientYearDevice >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (operatingSystem == 1 && clientYearDevice < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }


    }

    public static void printClientDistance(int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Доставка займет сутки.");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Доствка займет двое суток.");
        }
        if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Доставка займет трое суток");
        } else if (deliveryDistance > 100) {
            System.out.println("Извините, доставки нет.");
        }
    }


    public static void main(String[] args) {
        System.out.println("Task 1");
        int year = 2025;
        printYear(year);

        System.out.println("Task 2");
        int operatingSystem = 1;
        int clientYearDevice = 2016;
        printClientDevice(operatingSystem, clientYearDevice);

        System.out.println("Task 3");
        int deliveryDistance = 95;
        printClientDistance(deliveryDistance);


    }


}