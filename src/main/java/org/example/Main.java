package org.example;
import org.example.operations.*;
import java.util.Scanner;
public class Main {

    public static void calculate(org.example.Сalculating calc) {

        // Создание объекта Scanner для получения ввода с клавиатуры
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        float a = scan.nextFloat();
        System.out.print("Введите второе число: ");
        float b = scan.nextFloat();

        System.out.print("Введите действие : ");
        String someOp = scan.nextLine();
        someOp = scan.nextLine();

        // Вызываем метод result на объекте calc для выполнения операции над введенными числами a и b
        int errorCode = calc.result(a, b, someOp);
        if (errorCode == Сalculating.ERROR_no)  {
            System.out.printf("Ответ: " + a + " "+ someOp   + " " +   b + " = %.4f", calc.getValue());
        }
        else {
            System.err.println("ОШИБКА: " + calc.getErrorText(errorCode));
        }
        scan.close();
     }
       public static void main(String[] args) {
           Сalculating calc = new Сalculating();
           calculate(calc);
       }

    }


