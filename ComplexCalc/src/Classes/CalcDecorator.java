package Classes;

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
        this.oldCalc = oldCalc;
        this.logger = logger;
    }
    @Override
    public Complex plus(Complex b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'plus'");
    }
    @Override
    public Complex minus(Complex b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'minus'");
    }
    @Override
    public Complex multip(Complex b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'multip'");
    }
    @Override
    public Complex division(Complex b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'division'");
    }
    @Override
    public Complex reverse(Complex a) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reverse'");
    }

    
}
