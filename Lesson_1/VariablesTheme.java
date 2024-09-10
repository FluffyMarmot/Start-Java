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
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Переменная исходная int: " + maxInt);
        System.out.println("Переменная int инкремент: " + ++maxInt);
        System.out.println("Переменная int декремент: " + --maxInt);
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("\nПеременная исходная byte: " + maxByte);
        System.out.println("Переменная byte инкремент: " + ++maxByte);
        System.out.println("Переменная byte декремент: " + --maxByte);
        short maxShort = Short.MAX_VALUE;
        System.out.println("\nПеременная исходная short: " + maxShort);
        System.out.println("Переменная short инкремент: " + ++maxShort);
        System.out.println("Переменная short декремент: " + --maxShort);
        long maxLong = Long.MAX_VALUE;
        System.out.println("\nПеременная исходная long: " + maxLong);
        System.out.println("Переменная long инкремент: " + ++maxLong);
        System.out.println("Переменная long декремент: " + --maxLong);
        char maxChar = Character.MAX_VALUE;
        int numericMaxChar = (int) maxChar;
        System.out.println("\nПеременная исходная char: " + numericMaxChar);
        System.out.println("Переменная char инкремент: " + ++numericMaxChar);
        System.out.println("Переменная char декремент: " + --numericMaxChar);

        System.out.println("\n 5. Перестановка значений переменных.");
        int a = 2;
        int b = 5;
        System.out.println("Исходные значения переменных:" + " " + a + " " + b);
        int swap = a;
        a = b;
        b = swap;
        System.out.println("Первый способ, при помощи третьей переменной:" + a + " " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Второй способ, при помощи арифметических операций:" + a + " " + b);
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
        System.out.println("Третий способ , с помощью побитовой операции ^:" + a + " " + b);

        System.out.println("\n 6. Вывод символов и их кодов.");
        char dollar = '$';
        int codeDollar = (int) dollar;
        char asterisk = '*';
        int codeAsterisk = (int) asterisk;
        char atSign = '@';
        int codeAtSign = (int) atSign;
        char backslash = '\\';
        int codeBackslash = (int) backslash;
        char tilde = '~';
        int codeTilde = (int) tilde;
        System.out.println("- " + codeDollar + " - " + dollar);
        System.out.println("- " + codeAsterisk + " - " + asterisk);
        System.out.println("- " + codeAtSign + " - " + atSign);
        System.out.println("- " + codeBackslash + " - " + backslash);
        System.out.println("- " + codeTilde + " - " + tilde);

        System.out.println("\n 7. Вывод в консоль ASCII-арт Дюка.");
        char slash = '/';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + underscore + leftParenthesis + " " + 
                rightParenthesis + backslash);
        System.out.println(" " + slash + underscore + underscore + underscore + 
                slash + backslash + underscore + backslash);

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
        int hh = seconds / 3600;
        int mm = seconds / 60 % 60;
        int ss = seconds % 60;
        System.out.println(hh + ":" + mm + ":" + ss);
    }
}