public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        boolean isMale = false;
        if (!isMale) {
            System.out.println("Добро пожаловать в мужской клуб");
        } else {
            System.out.println("К сожалению наш клуб только для мужчин");
        }
        int age = 15; 
        if (age > 18) {
            System.out.println("Выбирайте алкоголь на ваш вкус");
        } else {
            System.out.println("Несовершеннолетним доступ закрыт");
        }
        double height = 1.9;
        if (height > 1.8) {
            System.out.println("Ваш рост выше среднего!");
        } else {
            System.out.println("Вы ниже среднего человека");
        }
        char firstLetter = "Андрей".charAt(0);
        if (firstLetter == 'В') {
            System.out.println("Может вас зовут Василий?");
        } else if (firstLetter == 'М') {
            System.out.println("Может вас зовут Максим?");
        } else {
            System.out.println("Вас точно зовут не Максим и не Василий)");
        }
        
        System.out.println("\n2. Поиск большего числа");
        int numOne = 123;
        int numTwo = 223;
        System.out.println("Первое число: " + numOne + " Второе число: " + numTwo);
        if (numOne > numTwo) {
            System.out.println("Первое число больше второго, числа не равны");
        } else if (numOne < numTwo) {
            System.out.println("Второе число больше первого, числа не равны");
        } else {
            System.out.println("Числа равны");
        }
    
        System.out.println("\n3. Проверка числа");
        int testNum = -56;
        if (testNum == 0) {
            System.out.println("Число равно нулю.");
        } else {
            String result = testNum + " является ";
            if (testNum > 0) {
                result += "положительным";
            } else {
                result += "отрицательным";
            }
            if (testNum % 2 == 0) {
                result += " и четным.";
            } else {
                result += " и нечетным.";
            }
            System.out.println(result);
        }
        
        System.out.println("\n4. Поиск одинаковых цифр в числах");
        boolean hasEqualityHundreds = numOne / 100 == numTwo / 100;
        boolean hasEqualityTens = numOne / 10 % 10 == numTwo / 10 % 10;
        boolean hasEqualityUnits = numOne % 10 == numTwo % 10;
        if (!hasEqualityUnits && !hasEqualityTens && !hasEqualityHundreds) { 
            System.out.println("Цифры в числах не равны");
        } else if (hasEqualityUnits || hasEqualityTens || hasEqualityHundreds) {
            System.out.println("Исходные числа: " + numOne + " " + numTwo);
            System.out.println("Одинаковые цифры:");
        }
        if (hasEqualityHundreds) {
            int identicalHundreds = numOne / 100;
            System.out.println("Разряд сотен: " + identicalHundreds);
        }
        if (hasEqualityTens) {
            int identicalTens = numOne / 10 % 10;
            System.out.println("Разряд десятков: " + identicalTens);
        }
        if (hasEqualityUnits) {
            int identicalUnits = numOne % 10;
            System.out.println("Разряд единиц: " + identicalUnits);
        }

        System.out.println("\n5. Определение символа по его коду.");
        char someCode = '\u0031';
        if (Character.isDigit(someCode)) {
            System.out.println(" " + someCode + " - Цифра");
        } else if (Character.isLowerCase(someCode)) {
            System.out.println(" " + someCode + " - Маленькая буква");
        } else if (Character.isUpperCase(someCode)) {
            System.out.println(" " + someCode + " - Большая буква");
        } else { 
            System.out.println(" " + someCode + " - Не буква, не цифра");
        }
        
        System.out.println("\n6. Подсчет начисленных банком %");
        double balance = 321123.59;
        double totalBalance = 0;
        double yearPercent = 0;
        if (balance < 100000) {
            totalBalance = balance * 1.05;
            yearPercent = balance * 0.05;
        } else if ((balance >= 100000) && (balance <= 300000)) {
            totalBalance = balance * 1.07;
            yearPercent = balance * 0.07;
        } else if (balance > 300000) {
            totalBalance = balance * 1.1;
            yearPercent = balance * 0.1;
        }
        System.out.println(" Сумма вклада: " + balance);
        System.out.println(" Сумма начисленных процентов: " + yearPercent);
        System.out.println(" Итоговая сумма с %: " + totalBalance);
        
        System.out.println("\n7. Определение оценки по предметам:");
        double percentageHistory = 59;
        double percentageProgramming = 92;
        double gradeProgramming = 0;
        double gradeHistory = 0;
        if (percentageHistory <= 60) {
            System.out.println("История: 2");
            gradeHistory = 2;
        } else if ((percentageHistory > 60) && (percentageHistory <= 73)) {
            System.out.println("История: 3");
            gradeHistory = 3;
        } else if ((percentageHistory > 73) && (percentageHistory <= 91)) {
            System.out.println("История: 4");
            gradeHistory = 4;
        } else if ((percentageHistory > 91) && (percentageHistory <= 100)) {
            System.out.println("История: 5");
            gradeHistory = 5;
        }
        if (percentageProgramming <= 60) {
            System.out.println("Программирование: 2");
            gradeProgramming = 2;
        } else if ((percentageProgramming > 60) && (percentageProgramming <= 73)) {
            System.out.println("Программирование: 3");
            gradeProgramming = 3;
        } else if ((percentageProgramming > 73) && (percentageProgramming <= 91)) {
            System.out.println("Программирование: 4");
            gradeProgramming = 4;
        } else if ((percentageProgramming > 91) && (percentageProgramming <= 100)) {
            System.out.println("Программирование: 5");
            gradeProgramming = 5;
        }
        double avgGrade = (gradeProgramming + gradeHistory) / 2;
        double avgPercent = (percentageProgramming + percentageHistory) / 2;
        System.out.println("Средняя оценка: " + avgGrade);
        System.out.println("Средний процент: " + avgPercent);
        System.out.println();
        
        System.out.println("8. Расчет годовой прибыли:");
        double monthProfit = 13025.233;
        double monthRent = 5123.018;
        double costPrice = 9001.729;
        double yearProfit = (monthProfit - monthRent - costPrice) * 12;
        if (yearProfit > 0) {
            System.out.println("Прибыль за год: " + "+" + yearProfit + " руб.");
        } else if (yearProfit < 0) {
            System.out.println("Прибыль за год: " + yearProfit + " руб.");
        } else {
            System.out.println("Прибыль за год: " + yearProfit + " руб.");
        }
        System.out.println(yearProfit);
    }
}