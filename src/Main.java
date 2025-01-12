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
        if (operatingSystem == 0) {
            if (clientYearDevice >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (operatingSystem == 1) {
            if (clientYearDevice >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Ошибка: некорректная операционная система");
        }
    }

    public static int calculationTimeDelivery(int distance) {
        if (distance <= 0) {
            return -1;
        } else if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            return -1;
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
        int days = calculationTimeDelivery(deliveryDistance);

        if (days == -1) {
            System.out.println("Ошибка: Введите корректное значение расстояния или доставка невозможна.");
        } else {
            System.out.println("Доставка вашей карты займет " + days + " дня.");
        }
    }
}
