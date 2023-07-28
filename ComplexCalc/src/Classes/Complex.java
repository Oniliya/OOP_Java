package Classes;
public class Complex {
    private final double re;   
    private final double im;   

    /**
     * Конструктор. 
     * Создает экземпляр комплексного числа.
     *
     * @param real действительная часть
     * @param image мнимая часть
     */
    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    /**
     * возвращает действительную часть числа
     * @return действительная часть числа
     */
    public double getRe() {
        return re;
    }
    
    /**
     * возвращает мнимую часть числа
     * @return мнимая часть числа
     */
    public double getIm() {
        return im;
    }

    @Override
    public String toString() {
    //    return "Complex [re=" + re + ", im=" + im + " i]";
    // }
    // public String toString() {
        if (im == 0) return re + "";
        if (re == 0) return im + "i";
        if (im < 0) return re + " - " + (-im) + "i";
        return re + " + " + im + "i";
    }


    
}