package Classes;

import java.io.IOException;

import Interfaces.iCalcComplex;

public class CalcDecorator implements iCalcComplex{

    private iCalcComplex oldCalc;
    private Logger logger;
    /**
     * конструктор класса декоратора для логирования
     * @param oldCalc "старый" калькулятор
     * @param logger логгер
     */
    public CalcDecorator(iCalcComplex oldCalc, Logger logger) {
    // public CalcDecorator(iCalcComplex oldCalc) {
        this.oldCalc = oldCalc;
        this.logger = logger;
    }

    @Override
    public iCalcComplex plus(Complex b) {
        Complex a = oldCalc.getComplex();
        
        logger.log("( " + a.toString() + " ) + ( " + b.toString() + " ) = ");
        iCalcComplex result = oldCalc.plus(b);
        logger.log(" = " + result.toString() + "\n");
        
        return result;
    }

    @Override
    public iCalcComplex minus(Complex b) {
        Complex a = oldCalc.getComplex();
        
        logger.log("( " + a.toString() + " ) - ( " + b.toString() + " ) = ");
        iCalcComplex result = oldCalc.minus(b);
        logger.log(" = " + result.toString() + "\n");
        
        return result;
    }

    @Override
    public iCalcComplex multip(Complex b) {
        Complex a = oldCalc.getComplex();
        
        logger.log("( " + a.toString() + " ) * ( " + b.toString() + " ) = ");
        iCalcComplex result = oldCalc.multip(b);
        logger.log(" = " + result.toString() + "\n");
        
        return result;
    }

    @Override
    public iCalcComplex division(Complex b) {
        Complex a = oldCalc.getComplex();
        
        logger.log("( " + a.toString() + " ) / ( " + b.toString() + " ) = ");
        iCalcComplex result = oldCalc.division(b);
        logger.log(" = " + result.toString() + "\n");
        
        return result;
    }

    @Override
    public Complex reverse(Complex a) {
        double scale = a.getRe() * a.getRe() + a.getIm() * a.getIm();
        return new Complex(a.getRe()/scale, -a.getIm()/scale);
    }

    @Override
    public Complex getComplex() {
        Complex result = oldCalc.getComplex();
        return result;
    }

    
    
}
