/**
 * Created by karolsudol on 14/11/2014.
 */
public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int num, int den) {

        if (den == 0) {
            throw new IllegalArgumentException("Invalid fraction with denominator 0");

        }
        int gcd = myGcd(num, den);
        setNumerator(num / gcd);
        setDenominator(den / gcd);
    }

    public String toString() {
        if (denominator != 1) {
            return "" + getNumerator() + '/' + getDenominator();
        }
        else if (denominator ==1){
            return String.valueOf(getNumerator());
        }
        else {
            return "" + getNumerator();
        }
    }

    // or perhaps it will be easier just to write it as: pls advise???
    /*
    public String toString(){
    return num + "/" + denom;
    }

     */

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }


    public boolean equals(Fraction other) {
        Integer num1 = this.numerator * other.getDenominator();
        Integer num2 = this.denominator * other.getNumerator();
        if (num1 == num2)
            return true;
        else
            return false;
    }


    @Override
    public int hashCode() {
        int result = numerator;
        result = 31 * result + denominator;
        return result;
    }

    public Fraction multiply(Fraction other) {

        int num = this.getNumerator() * other.getNumerator();
        int den = this.getDenominator() * other.getDenominator();
        return normalise(num, den);
    }

    public Fraction add(Fraction other){

        int num = this.getDenominator() + other.getNumerator();
        int den = this.getDenominator() + other.getDenominator();
        return normalise(num, den);
    }

    public Fraction subtract(Fraction other){
        int num = this.getDenominator() - other.getNumerator();
        int den = this.getDenominator() - other.getDenominator();
        return normalise(num, den);
    }

    public Fraction divide(Fraction other){

        int num = this.getDenominator() / other.getNumerator();
        int den = this.getDenominator() / other.getDenominator();
        return normalise(num, den);
    }

    public Fraction absValue(){
        int num = Math.abs(this.numerator);
        int den = Math.abs(this.denominator);
        return new Fraction(num, den);
    }

    public Fraction negate(){
        int num = this.getNumerator() * -1;
        int den = this.denominator;
        return new Fraction(num,den);
    }


    private int myGcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    private Fraction normalise(int n, int d) {
        int gcd = myGcd(n, d);
        return new Fraction(n / gcd, d / gcd);

    }


}





