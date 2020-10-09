/**
 * Rational number class.
 * @author ivorgilmartin
 */
public class Rational {

    private int num; // numerator
    private int den; // denominator

    public Rational() {
        this.num = 0;
        this.den = 1;
    }

    public Rational(int num, int den) {
        this.num = num;
        this.den = den;
    }

    public void printRational() {
        System.out.println(this.num + "/" + this.den);
    }

    public String toString() {
        return String.format("%d/%d", this.num, this.den);
    }

    public void negate() {
        num = -num;
    }

    public void invert() {
        int temp = num;
        num = den;
        den = temp;
    }

    public double toDouble() {
        return (double) num / (double) den;
    }

    public Rational reduce() {
        int gcd = gcd(num, den);
        return new Rational(num / gcd, den / gcd);
    }

    public int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    public Rational add(Rational that) {
        int newNum = (num * Math.abs(that.den)) + (that.num * Math.abs(den));
        int newDen = den * that.den;
        int gcd = Math.abs(gcd(newNum, newDen));
        return new Rational(newNum / gcd, newDen / gcd);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }

    public static void main(String[] args) {
        Rational r = new Rational(-2, 4);

        r.printRational();
        System.out.println(r);

        r.negate();
        System.out.println(r);

        r.invert();
        System.out.println(r);

        System.out.println(r.toDouble());
        System.out.println(r);

        System.out.println(r.reduce());
        System.out.println(r);

        Rational q = new Rational(1, 2);
        Rational a = r.add(q);
        System.out.println(a);

    }

}
