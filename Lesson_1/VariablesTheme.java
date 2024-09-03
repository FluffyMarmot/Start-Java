public class VariablesTheme {
    public static void main(String[] args) {
        int core = 4;
        byte videoRam = 12;
        short ramGb= 16;
        long capacitySSD= 512;
        boolean videoCard = true; 
        char usb3= 52;
        double coreMhz = 4.40;
        float pricePC = 125.820F;
        System.out.println("1. Вывод характеристик компьютера");
        System.out.println("Количество ядер процессора: " + core + " ядра");
        System.out.println("Количество видео памяти: " + videoRam + " ГБ");
        System.out.println("Количество оперативной памяти: " + ramGb + " ГБ");
        System.out.println("Объем SSD диска: " + capacitySSD + " ГБ");
        if (videoCard) {
        System.out.println("Наличие дискретной видеокарты: RX7800XT");
        }
        System.out.println("Количество разъемов USB 3.0: " + usb3 + " шт.");
        System.out.println("Частота ЦП процессора: " + coreMhz + " Ггц");
        System.out.println("Стоимость системного блока: " + pricePC + " тыс. рублей");
        System.out.println("");

        System.out.println("2. Расчет стоимости товара со скидкой");
        double pricePen = 105.5;
        double priceBook = 235.83;
        double priceAll = pricePen + priceBook;
        double discountAll = (pricePen + priceBook) * 0.11;
        double priceDiscount = priceAll - discountAll;
        System.out.println("Стоимость товаров без скидки: " + priceAll);
        System.out.println("Сумма скидки: " + discountAll);
        System.out.println("Стоимость товаров со скидкой: " + priceDiscount);
        System.out.println("");

        System.out.println("3. Вывод слова JAVA");
        System.out.println("    J    a  v     v  a");
        System.out.println("    J   a a  v   v  a a");
        System.out.println(" J  J  aaaaa  V V  aaaaa");
        System.out.println("  JJ  a     a  V  a     a");
        System.out.println("");

        System.out.println("4. Вывод min и max значений целых числовых типов");
        int xDefault = 2147483647;
        int xIncrement = ++xDefault;
        int xDecrement = --xDefault;
        System.out.println("Переменная исходная int: " + xDefault);
        System.out.println("Переменная int инкремент: " + xIncrement);
        System.out.println("Переменная int декремент: " + xDecrement);
        System.out.println("");
        byte yDefault = 127;
        byte yIncrement = ++yDefault;
        byte yDecrement = --yDefault;
        System.out.println("Переменная исходная byte: " + yDefault);
        System.out.println("Переменная byte инкремент: " + yIncrement);
        System.out.println("Переменная byte декремент: " + yDecrement);
        System.out.println("");
        short zDefault = 32767;
        short zIncrement = ++zDefault;
        short zDecrement = --zDefault;
        System.out.println("Переменная исходная short: " + zDefault);
        System.out.println("Переменная short инкремент: " + zIncrement);
        System.out.println("Переменная short декремент: " + zDecrement);
        System.out.println("");
        long qDefault = 9223372036854775807L;
        long qIncrement = ++qDefault;
        long qDecrement = --qDefault;
        System.out.println("Переменная исходная long: " + qDefault);
        System.out.println("Переменная long инкремент: " + qIncrement);
        System.out.println("Переменная long декремент: " + qDecrement);
        System.out.println("");

        System.out.println("5. Перестановка значений переменных.");
        int digOne = 2;
        int digTwo = 5;
        System.out.println("Исходные значения переменных:" + " " + digOne + " " + digTwo); 
        int digTemp = digOne;
        System.out.println("Первый способ, при помощи третьей переменной:" + digTwo + " " 
            + digTemp);
        System.out.println("Второй способ, при помощи арифметических операций:" + (digTwo) + " " 
            + (digTwo / digOne));
        System.out.println("Третий способ , с помощью побитовой операции ^:" + " " 
            + (digOne ^ digTwo ^ digOne) + " " + (digTwo ^ digOne ^ digTwo));
        System.out.println("");

        System.out.println("6. Вывод символов и их кодов.");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char backSlash = '\\';
        char tilde = '~';
        System.out.println("- 36 - " + dollar);
        System.out.println("- 42 - " + asterisk);
        System.out.println("- 64 - " + atSign);
        System.out.println("- 124 - " + backSlash);
        System.out.println("- 126 - " + tilde);
        System.out.println("");

        System.out.println("7. Вывод в консоль ASCII-арт Дюка.");
        char slash = '/';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.println("    " + slash + "" + backSlash);
        System.out.println("   " + slash + "  " + backSlash);
        System.out.println("  " + slash + "" + underscore + "" + leftParenthesis + " " + rightParenthesis 
            + "" + backSlash);
        System.out.println(" " + slash + "" + "" + underscore + "" + underscore + "" + underscore 
            + "" + slash + "" + backSlash + "" + underscore + "" + backSlash);
        System.out.println("");

        System.out.println("8. Манипуляции с сотнями, десятками и единицами числа.");
        int numExc = 123;
        int quantityHundred = numExc / 100; 
        int quantityTen = numExc % 100 / 10;
        int quantityOne = numExc % 10 ;
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