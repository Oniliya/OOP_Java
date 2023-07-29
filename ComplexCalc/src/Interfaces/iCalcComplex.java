package Interfaces;
import Classes.Complex;

public interface iCalcComplex {

    // сумма двух комплексных чисел
    public iCalcComplex plus(Complex b);

    // разность двух комплексных чисел
    public iCalcComplex minus(Complex b);

    // произведение двух комплексных чисел
    public iCalcComplex multip(Complex b);
    
    // деление двух комплексных чисел
    public iCalcComplex division(Complex b);

    // обратное комплексное число (для деления)
    public Complex reverse(Complex a);

    // получение значения кмплексного числа, находящегося в калькуляторе
    public Complex getComplex();
}
