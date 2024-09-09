public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println(" 1. Вывод характеристик компьютера");
        int numOfCores = 4;
        System.out.println("Количество ядер процессора: " + numOfCores + " ядра");
        byte capacityVideoRam = 12;
        System.out.println("Количество видео памяти: " + capacityVideoRam + " ГБ");
        short capacityRam = 16;
        System.out.println("Количество оперативной памяти: " + capacityRam + " ГБ");
        long capacitySsd = 512;
        System.out.println("Объем SSD диска: " + capacitySsd + " ГБ");
        boolean hasVideoCard = true;
        if (hasVideoCard) {
            System.out.println("Наличие дискретной видеокарты: RX7800XT");
        }
        char numsOfUsb3 = 52;
        System.out.println("Количество разъемов USB 3.0: " + numsOfUsb3 + " шт.");
        double frequencyCpu = 4.40;
        System.out.println("Частота ЦП процессора: " + frequencyCpu + " Ггц");
        float pricePc = 125.820F;
        System.out.println("Стоимость системного блока: " + pricePc + " тыс. рублей");

        System.out.println("\n 2. Расчет стоимости товара со скидкой");
        double pricePen = 105.5;
        double priceBook = 235.83;
        double basePrice = pricePen + priceBook;
        double discountSum = (pricePen + priceBook) * 0.11;
        double dicountPrice = basePrice - discountSum;
        System.out.println("Стоимость товаров без скидки: " + basePrice);
        System.out.println("Сумма скидки: " + discountSum);
        System.out.println("Стоимость товаров со скидкой: " + dicountPrice);

        System.out.println("\n 3. Вывод слова JAVA");
        System.out.println("    J    a  v     v  a");
        System.out.println("    J   a a  v   v  a a");
        System.out.println(" J  J  aaaaa  V V  aaaaa");
        System.out.println("  JJ  a     a  V  a     a");

        System.out.println("\n 4. Вывод min и max значений целых числовых типов");
        int maxInt = 2147483647;
        System.out.println("Переменная исходная int: " + maxInt);
        System.out.println("Переменная int инкремент: " + ++maxInt);
        System.out.println("Переменная int декремент: " + --maxInt);
        byte maxByte = 127;
        System.out.println("\nПеременная исходная byte: " + maxByte);
        System.out.println("Переменная byte инкремент: " + ++maxByte);
        System.out.println("Переменная byte декремент: " + --maxByte);
        short maxShort = 32767;
        System.out.println("\nПеременная исходная short: " + maxShort);
        System.out.println("Переменная short инкремент: " + ++maxShort);
        System.out.println("Переменная short декремент: " + --maxShort);
        long maxLong = 9223372036854775807L;
        System.out.println("\nПеременная исходная long: " + maxLong);
        System.out.println("Переменная long инкремент: " + ++maxLong);
        System.out.println("Переменная long декремент: " + --maxLong);
        char maxChar = 65535;
        System.out.println("\nПеременная исходная char: " + maxChar);
        System.out.println("Переменная char инкремент: " + ++maxChar);
        System.out.println("Переменная char декремент: " + --maxChar);

        System.out.println("\n 5. Перестановка значений переменных.");
        int a = 2;
        int b = 5;
        System.out.println("Исходные значения переменных:" + " " + a + " " + b);
        int swap = b;
        System.out.println("Первый способ, при помощи третьей переменной:" + swap + " " + a);
        a = a * 2 + 1;
        b = b / 2;
        System.out.println("Второй способ, при помощи арифметических операций:" + a + " " + b);
        a = b ^ a ^ b;
        b = a ^ b ^ a; 
        System.out.println("Третий способ , с помощью побитовой операции ^:" + a + " " + b);

        System.out.println("\n 6. Вывод символов и их кодов.");
        char symbolDollar = '$';
        char symbolAsterisk = '*';
        char symbolAtSign = '@';
        char symbolBackslash = '\\';
        char symbolTilde = '~';
        System.out.println("- 36 - " + symbolDollar);
        System.out.println("- 42 - " + symbolAsterisk);
        System.out.println("- 64 - " + symbolAtSign);
        System.out.println("- 124 - " + symbolBackslash);
        System.out.println("- 126 - " + symbolTilde);

        System.out.println("\n 7. Вывод в консоль ASCII-арт Дюка.");
        char symbolSlash = '/';
        char symbolUnderscore = '_';
        char symbolLeftParenthesis = '(';
        char symbolRightParenthesis = ')';
        System.out.println("    " + symbolSlash + symbolBackslash);
        System.out.println("   " + symbolSlash + "  " + symbolBackslash);
        System.out.println("  " + symbolSlash + symbolUnderscore + symbolLeftParenthesis + " " + 
                symbolRightParenthesis + symbolBackslash);
        System.out.println(" " + symbolSlash + symbolUnderscore + symbolUnderscore + symbolUnderscore + 
                symbolSlash + symbolBackslash + symbolUnderscore + symbolBackslash);

        System.out.println("\n 8. Манипуляции с сотнями, десятками и единицами числа.");
        int baseNum = 123;
        int hundreds = baseNum / 100; 
        int tens = baseNum % 100 / 10;
        int units = baseNum % 10;
        int multiplicationDigits = hundreds * tens * units;
        int sumDigits = hundreds + tens + units;
        System.out.println("Число " + baseNum + " содержит:");
        System.out.println("   сотен - " + hundreds);
        System.out.println("   десятков - " + tens);
        System.out.println("   единиц - " + units);
        System.out.println("Сумма разрядов = " + sumDigits);
        System.out.println("Произведение разрядов - " + multiplicationDigits);

        System.out.println("\n 9. Перевод секунд в часы, минуты и секунды.");
        int seconds = 86399;
        int clockHours = seconds / 3600;
        int clockMin = seconds / 60 % 60;
        int clockSec = seconds % 60;
        System.out.println(clockHours + ":" + clockMin + ":" + clockSec);
    }
}