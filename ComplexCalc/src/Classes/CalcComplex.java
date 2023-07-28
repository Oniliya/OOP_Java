package Classes;
import Interfaces.iCalcComplex;

public class CalcComplex implements iCalcComplex{
    
    // private double rePart;
    // public double getRePart() {
    //     return rePart;
    // }

    // private double imPart;
    // public double getImPart() {
    //     return imPart;
    // }

    private Complex number;
    // private String filePath = "log.txt";


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
    public Complex plus(Complex b) {
        double real = number.getRe() + b.getRe();
        double imag = number.getIm() + b.getIm();
        Complex res = new Complex(real, imag);
        // System.out.println("plus result = "+res.toString());
        return res;
    }

    /**
     * разность двух комплексных чисел
     */
    @Override
    public Complex minus(Complex b) {
        double real = number.getRe() - b.getRe();
        double imag = number.getIm() - b.getIm();
        Complex res = new Complex(real, imag);
        // System.out.println("minus result = "+res.toString());
        return res;
    }

    /**
     * произведение двух комплексных чисел
     */
    @Override
    public Complex multip(Complex b) {
        double real = number.getRe() * b.getRe() - number.getIm() * b.getIm();
        double imag = number.getRe() * b.getIm() + number.getIm() * b.getRe();
        Complex res = new Complex(real, imag);
        // System.out.println("multip result = "+res.toString());
        return res;       
    }

    /**
     *  деление двух комплексных чисел
     */
    @Override
    public Complex division(Complex b) {
        Complex res = multip(reverse(b));
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
    // // вспомогательное умножение для деления
    // private Complex multip2(Complex b) {
    //     double real = number.getRe() * b.getRe() - number.getIm() * b.getIm();
    //     double imag = number.getRe() * b.getIm() + number.getIm() * b.getRe();
    //     return new Complex(real, imag);       
    // }


    @Override
    public String toString() {
        // return "CalcComplex [rePart=" + number.getRe() + ", imPart=" + number.getIm() + "]";
        if (number.getIm() == 0) return number.getRe() + "";
        if (number.getRe() == 0) return number.getIm() + "i";
        if (number.getIm() < 0) return number.getRe() + " - " + (-number.getIm()) + "i";
        return number.getRe() + " + " + number.getIm() + "i";

    }



    
}
