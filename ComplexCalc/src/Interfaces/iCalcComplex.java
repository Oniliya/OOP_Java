package Interfaces;
import Classes.Complex;

public interface iCalcComplex {

    // сумма двух комплексных чисел
    public Complex plus(Complex b);

    // разность двух комплексных чисел
    public Complex minus(Complex b);

    // произведение двух комплексных чисел
    public Complex multip(Complex b);
    
    // деление двух комплексных чисел
    public Complex division(Complex b);

    // обратное комплексное число (для деления)
    public Complex reverse(Complex a);
}
