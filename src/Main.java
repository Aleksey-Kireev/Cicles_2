public class Main {
    public static void main(String[] args) {

//        ----- =====   Задание № 1   ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 1   ===== -----");
        int savings = 0;
        int month = 0;
        while (savings < 2_459_000) {
            savings += 15_000;
            month += 1;
        }
        System.out.println("Месяц " + month + " сумма накоплений равна " + savings + " рублей");

//        ----- =====   Задание № 2   ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 2   ===== -----");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i += 1;
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

//        ----- =====   Задание № 3   ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 3   ===== -----");
        int residents = 12_000_000;
        int year = 0;
        int change = residents / 1000 * 17 - residents / 1000 * 8;
        while (year != 10) {
            residents += change;
            year += 1;
            System.out.println("Год " + year + " население страны составляет " + residents + " человек");
        }
        System.out.println("Через " + year + " лет, население страны составит " + residents + " человек");

//        ----- =====   Задание № 4   ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 4   ===== -----");
        int bank = 15_000;
        year = 0;
        while (bank < 12_000_000) {
            bank *= 1.07;
            year += 1;
            System.out.println("Месяц " + year + " сумма накоплений " + bank);
        }

//        ----- =====   Задание № 5   ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 5   ===== -----");
        bank = 15_000;
        year = 0;
        while (bank < 12_000_000) {
            bank *= 1.07;
            year += 1;
            if (year % 6 == 0) {
                System.out.println("Месяц " + year + " сумма накоплений " + bank);
            }
        }
        System.out.println("Для накопления " + bank + " потребуется " + year + " месяцев");

//        ----- =====   Задание № 6   ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 6   ===== -----");
        bank = 15_000;
        for (int j = 1; j <= 9 * 12; j++) {
            bank *= 1.07;
            if (j % 6 == 0) {
                System.out.println("Месяц " + j + " сумма накоплений " + bank);
            }
        }
        System.out.println("Через 9 лет у Вас получится " + bank + " рублей");

//        ----- =====   Задание № 7   ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 7   ===== -----");
        int friday = 3;
        do {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
            friday += 7;
        } while (friday <= 31);

//        ----- =====   Задание № 8   ===== -----

        System.out.println();
        System.out.println("----- =====   Задание № 8   ===== -----");
        year = 2025;
        int lastYear = year - 200;
        int nextYear = year + 100;
        for (int j = 0; j < nextYear; j += 79) {
            if (j > lastYear && j <= year) {
                System.out.println("Комета пролетала в " + j + " году");
            } else if (j < nextYear && j > year) {
                System.out.println("В следующий раз комета пролетит в " + j + " году");
            }
        }

    }
}