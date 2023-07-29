package Classes;
import Interfaces.iCalcComplex;

public class CalcComplex implements iCalcComplex{
    
    private Complex number;

    /**
     * конструктор класса калькулятор CalcComplex
     */
    public CalcComplex(Complex number) {
        this.number = number;
    }


    /**
     * сумма двух комплексных чисел
     */
    @Override
    public iCalcComplex plus(Complex b) {
        double real = number.getRe() + b.getRe();
        double imag = number.getIm() + b.getIm();
        // Complex res = new Complex(real, imag);
        // System.out.println("plus result = "+res.toString());
        this.number = new Complex(real, imag);
        return this;
    }

    /**
     * разность двух комплексных чисел
     */
    @Override
    public iCalcComplex minus(Complex b) {
        double real = number.getRe() - b.getRe();
        double imag = number.getIm() - b.getIm();
        // Complex res = new Complex(real, imag);
        // System.out.println("minus result = "+res.toString());
        this.number = new Complex(real, imag);
        return this;
    }

    /**
     * произведение двух комплексных чисел
     */
    @Override
    public iCalcComplex multip(Complex b) {
        double real = number.getRe() * b.getRe() - number.getIm() * b.getIm();
        double imag = number.getRe() * b.getIm() + number.getIm() * b.getRe();
        // Complex res = new Complex(real, imag);
        // System.out.println("multip result = "+res.toString());
        this.number = new Complex(real, imag);
        return this;      
    }

    /**
     *  деление двух комплексных чисел
     */
    @Override
    public iCalcComplex division(Complex b) {
        iCalcComplex res = multip(reverse(b));
        // Complex res = multip2(reverse(b));
        // System.out.println("division result = "+res.toString());
        return res;
    }

    /**
     * обратное комплексное число (для деления)
     */
    @Override
    public Complex reverse(Complex a) {
        double scale = a.getRe() * a.getRe() + a.getIm() * a.getIm();
        return new Complex(a.getRe()/scale, -a.getIm()/scale);
    }


    @Override
    public String toString() {
        // return "CalcComplex [rePart=" + number.getRe() + ", imPart=" + number.getIm() + "]";
        if (number.getIm() == 0) return number.getRe() + "";
        if (number.getRe() == 0) return number.getIm() + "i";
        if (number.getIm() < 0) return number.getRe() + " - " + (-number.getIm()) + "i";
        return number.getRe() + " + " + number.getIm() + "i";

    }

    @Override
    public Complex getComplex() {
        return number;
    }
    
}
