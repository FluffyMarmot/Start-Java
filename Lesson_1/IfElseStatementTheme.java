public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        boolean isMen = false;
        if(!isMen) {
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
        // Пустая строка
        System.out.println("");
        
        System.out.println("2. Поиск большего числа");
        int numOne = 23222;
        int numTwo = 23222;
        System.out.println("Первое число: " + numOne + " Второе число: " 
            + numTwo);
        if (numOne > numTwo) {
            System.out.println("Первое число больше второго, числа не равны");
        } else if (numOne < numTwo) {
            System.out.println("Второе число больше первого, числа не равны");
        } else {
            System.out.println("Числа равны");
        }
        System.out.println("");
    
        System.out.println("3. Проверка числа");
        int digit = 33;
        if (digit == 0) {
            System.out.println(" " + digit + " является нулем");
        } else {
            boolean isNegative = digit < 0;
            if (isNegative) {
                if (digit % 2 == 0) {
                    System.out.println(" " + digit + " отрицательное и четное");
                } else {
                    System.out.println(" " + digit + " отрицательное и нечетное");
                }
            } else if (digit % 2 == 0) {
                System.out.println(" " + digit + " положительное и четное");
                } else {
                    System.out.println(" " + digit + " положительное и нечетное");
                }
        }
        System.out.println("");
        
        System.out.println("4. Поиск одинаковых цифр в числах");
        int firstNum = 123;
        int secNum = 223;
        boolean equalityHundred = firstNum / 100 == secNum / 100;
        boolean equalityTen = firstNum /10 % 10 == secNum / 10 % 10;
        boolean equalityOne = firstNum % 100 == secNum % 100;
        if (!equalityOne | !equalityTen | !equalityHundred) { 
            System.out.println("Цифры в числах не равны");
        } else if (equalityOne && equalityTen && equalityHundred) {
            int identicalHundred = firstNum / 100;
            int identicalTen = firstNum / 10 % 10;
            int identicalOne = firstNum % 100 % 10;
            System.out.println ("Исходные числа: " + firstNum + " " + secNum);
            System.out.println("Одинаковые цифры:" );
            System.out.println(" Разряд сотен: " + identicalHundred);
            System.out.println(" Разряд десятков: " + identicalTen);
            System.out.println(" Разряд единиц: " + identicalOne);
        }
        System.out.println("");
        
        System.out.println("5. Определение символа по его коду.");
        char symbolOrDig = '\u005E';
        if (Character.isDigit(symbolOrDig)) {
            System.out.println(" " + symbolOrDig + " - Цифра");
        } else if (Character.isLetter(symbolOrDig)) {
            if (Character.isLowerCase(symbolOrDig)) {
                System.out.println(" " + symbolOrDig + " - Маленькая буква");
            } else if (Character.isUpperCase(symbolOrDig)) {
                System.out.println(" " + symbolOrDig + " - Большая буква");
            } 
        } else { 
            System.out.println(" " + symbolOrDig + " - Не буква, не цифра");
        }
        System.out.println("");
        
        System.out.println("6. Подсчет начисленных банком %");
        double balance = 321123.59;
        if (balance < 100000) {
            double totalBalance = balance * 1.05;
            double yearPercent = balance * 0.05;
            System.out.println(" Сумма вклада: " + balance);
            System.out.println(" Сумма начисленных процентов: " + yearPercent);
            System.out.println(" Итоговая сумма с %: " + totalBalance);
        } else if ((balance >= 100000) && (balance <= 300000)) {
            double totalBalance = balance * 1.07;
            double yearPercent = balance * 0.07;
            System.out.println(" Сумма вклада: " + balance);
            System.out.println(" Сумма начисленных процентов: " + yearPercent);
            System.out.println(" Итоговая сумма с %: " + totalBalance);
        } else if (balance > 300000) {
            double totalBalance = balance * 1.1;
            double yearPercent = balance * 0.1;
            System.out.println(" Сумма вклада: " + balance);
            System.out.println(" Сумма начисленных процентов: " + yearPercent);
            System.out.println(" Итоговая сумма с %: " + totalBalance);
        }
        System.out.println("");
        
        System.out.println("7. Определение оценки по предметам:");
        double percentageHistory = 59;
        double percentageProgramming = 92;
        double gradeProgramming = 0;
        double gradeHistory = 0;
        if (percentageHistory <= 60) {
            System.out.println("История: 2");
            gradeHistory = 2;
        } else if ((percentageHistory > 60) && (percentageHistory <=73)) {
            System.out.println("История: 3");
            gradeHistory = 3;
        } else if ((percentageHistory > 73) && (percentageHistory <=91)) {
            System.out.println("История: 4");
            gradeHistory = 4;
        } else if ((percentageHistory > 91) && (percentageHistory <=100)) {
            System.out.println("История: 5");
            gradeHistory = 5;
        }
        if (percentageProgramming <= 60) {
            System.out.println("Программирование: 2");
            gradeProgramming = 2;
        } else if ((percentageProgramming > 60) && (percentageProgramming <=73)) {
            System.out.println("Программирование: 3");
            gradeProgramming = 3;
        } else if ((percentageProgramming > 73) && (percentageProgramming <=91)) {
            System.out.println("Программирование: 4");
            gradeProgramming = 4;
        } else if ((percentageProgramming > 91) && (percentageProgramming <=100)) {
            System.out.println("Программирование: 5");
            gradeProgramming = 5;
        }
        double avgGrade = (gradeProgramming + gradeHistory) / 2;
        double avgPercent = (percentageProgramming + percentageHistory) / 2;
        System.out.println("Средняя оценка: " + avgGrade);
        System.out.println("Средний процент: " + avgPercent);
        System.out.println("");
        
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