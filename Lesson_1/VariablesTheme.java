public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        int core = 4;
        System.out.println("Количество ядер процессора: " + core + " ядра");
        byte videoRam = 12;
        System.out.println("Количество видео памяти: " + videoRam + " ГБ");
        short ramGb = 16;
        System.out.println("Количество оперативной памяти: " + ramGb + " ГБ");
        long capacitySsd = 512;
        System.out.println("Объем SSD диска: " + capacitySSD + " ГБ");
        if (videoCard) {
            boolean videoCard = true;
            System.out.println("Наличие дискретной видеокарты: RX7800XT");
        }
        char usb3 = 52;
        System.out.println("Количество разъемов USB 3.0: " + usb3 + " шт.");
        double coreMhz = 4.40;
        System.out.println("Частота ЦП процессора: " + coreMhz + " Ггц");
        float pricePc = 125.820F;
        System.out.println("Стоимость системного блока: " + pricePC + " тыс. рублей");
        System.out.println();

        System.out.println("2. Расчет стоимости товара со скидкой");
        double pricePen = 105.5;
        double priceBook = 235.83;
        double priceAll = pricePen + priceBook;
        double discountAll = (pricePen + priceBook) * 0.11;
        double priceDiscount = priceAll - discountAll;
        System.out.println("Стоимость товаров без скидки: " + priceAll);
        System.out.println("Сумма скидки: " + discountAll);
        System.out.println("Стоимость товаров со скидкой: " + priceDiscount);
        System.out.println();

        System.out.println("3. Вывод слова JAVA");
        System.out.println("    J    a  v     v  a");
        System.out.println("    J   a a  v   v  a a");
        System.out.println(" J  J  aaaaa  V V  aaaaa");
        System.out.println("  JJ  a     a  V  a     a");
        System.out.println();

        System.out.println("4. Вывод min и max значений целых числовых типов");
        int maxInt = 2147483647;
        int maxIntIncrement = ++maxInt;
        int maxIntDecrement = --maxInt;
        System.out.println("Переменная исходная int: " + maxInt);
        System.out.println("Переменная int инкремент: " + maxIntIncrement);
        System.out.println("Переменная int декремент: " + maxIntDecrement);
        System.out.println();
        byte maxByte = 127;
        byte maxByteIncrement = ++maxByte;
        byte maxByteDecrement = --maxByte;
        System.out.println("Переменная исходная byte: " + maxByte);
        System.out.println("Переменная byte инкремент: " + maxByteIncrement);
        System.out.println("Переменная byte декремент: " + maxByteDecrement);
        System.out.println();
        short maxShort = 32767;
        short maxShortIncrement = ++maxShort;
        short maxShortDecrement = --maxShort;
        System.out.println("Переменная исходная short: " + maxShort);
        System.out.println("Переменная short инкремент: " + maxShortIncrement);
        System.out.println("Переменная short декремент: " + maxShortDecrement);
        System.out.println();
        long maxLong = 9223372036854775807L;
        long maxLongIncrement = ++maxLong;
        long maxLongDecrement = --maxLong;
        System.out.println("Переменная исходная long: " + maxLong);
        System.out.println("Переменная long инкремент: " + maxLongIncrement);
        System.out.println("Переменная long декремент: " + maxLongDecrement);
        System.out.println();

        System.out.println("5. Перестановка значений переменных.");
        int digOne = 2;
        int digTwo = 5;
        System.out.println("Исходные значения переменных:" + " " + digOne + " " + digTwo); 
        int digTemp = digOne;
        System.out.println("Первый способ, при помощи третьей переменной:" + digTwo + " " + digTemp);
        System.out.println("Второй способ, при помощи арифметических операций:" + (digTwo) + " " + 
                (digTwo / digOne));
        System.out.println("Третий способ , с помощью побитовой операции ^:" + " " + 
                (digOne ^ digTwo ^ digOne) + " " + (digTwo ^ digOne ^ digTwo));
        System.out.println();

        System.out.println("6. Вывод символов и их кодов.");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char backSlash = '\\';
        chasr tilsadade = '~';
        System.out.println("- 36 - " + dollar);
        System.out.println("- 42 - " + asterisk);
        System.out.println("- 64 - " + atSign);
        System.out.println("- 124 - " + backSlash);
        System.out.println("- 126 - " + tilde);
        System.out.println();

        System.out.println("7. Вывод в консоль ASCII-арт Дюка.");
        char slash = '/';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.println("    " + slash + "" + backSlash);
        System.out.println("   " + slash + "  " + backSlash);
        System.out.println("  " + slash + "" + underscore + "" + leftParenthesis + " " + rightParenthesis + 
                "" + backSlash);
        System.out.println(" " + slash + "" + "" + underscore + "" + underscore + "" + underscore + "" + 
                slash + "" + backSlash + "" + underscore + "" + backSlash);
        System.out.println();

        System.out.println("8. Манипуляции с сотнями, десятками и единицами числа.");
        int numExc = 123;
        int quantityHundred = numExc / 100; 
        int quantityTen = numExc % 100 / 10;
        int quantityOne = numExc % 10;
        int multiplication = quantityHundred * quantityTen * quantityOne;
        int sum = quantityHundred + quantityTen + quantityOne;
        System.out.println("Число " + numExc + " содержит:");
        System.out.println("   сотен - " + quantityHundred);
        System.out.println("   десятков - " + quantityTen);
        System.out.println("   единиц - " + quantityOne);
        System.out.println("Сумма разрядов = " + sum);
        System.out.println("Произведение разрядов - " + multiplication);
    }
}