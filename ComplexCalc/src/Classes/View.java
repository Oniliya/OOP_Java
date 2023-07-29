package Classes;

import java.util.Scanner;

import Interfaces.iCalcComplex;

public class View {
    private iCalcComplex calculator;

    /** конструктор
     * @param calculator
     */
    public View (iCalcComplex calculator) {
        this.calculator = calculator;
    }

    public void run() {
        while (true)  {
            int realArg = promptInt("Введите первое комплексное число: действительная часть: ");
            int imgArg = promptInt("Введите первое комплексное число: мнимая часть: ");
            Complex a = new Complex(realArg, imgArg);
            System.out.println(a.toString());
            calculator.plus(a);
            while (true) {
                String cmd = prompt("Введите команду (+, -, *, /, stop) : ");    
                if (cmd.equals("+")) {
                    int realArg2 = promptInt("Введите следующее комплексное число: действительная часть: ");
                    int imgArg2 = promptInt("Введите следующее комплексное число: мнимая часть: ");
                    Complex b = new Complex(realArg2, imgArg2);
                    System.out.println(b.toString());
                    calculator.plus(b);
                    System.out.println("результат суммы чисел = " + calculator.getComplex());
                    continue;
                }
                if (cmd.equals("-")) {
                    int realArg2 = promptInt("Введите следующее комплексное число: действительная часть: ");
                    int imgArg2 = promptInt("Введите следующее комплексное число: мнимая часть: ");
                    Complex b = new Complex(realArg2, imgArg2);
                    System.out.println(b.toString());
                    calculator.minus(b);
                    System.out.println("результат разницы чисел = " + calculator.getComplex());
                    continue;
                }
                if (cmd.equals("*")) {
                    int realArg2 = promptInt("Введите следующее комплексное число: действительная часть: ");
                    int imgArg2 = promptInt("Введите следующее комплексное число: мнимая часть: ");
                    Complex b = new Complex(realArg2, imgArg2);
                    System.out.println(b.toString());
                    calculator.multip(b);
                    System.out.println("результат произведения чисел = " + calculator.getComplex());
                    continue;
                }
                if (cmd.equals("/")) {
                    int realArg2 = promptInt("Введите следующее комплексное число: действительная часть: ");
                    int imgArg2 = promptInt("Введите следующее комплексное число: мнимая часть: ");
                    Complex b = new Complex(realArg2, imgArg2);
                    System.out.println(b.toString());
                    calculator.division(b);
                    System.out.println("результат деления чисел = " + calculator.getComplex());
                    continue;
                }
                if (cmd.equals("stop")) {
                    System.out.println("stop");
                    break;
                }
            }
            String cmd = prompt("Продолжить работу (y/n)?");
            if (cmd.equals("y")) {
                continue;
            }
            break;
       }
    }
    // ввод числа
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
    // ввод команды
    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}
