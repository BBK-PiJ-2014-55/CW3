/**
 * Created by karolsudol on 14/11/2014.
 */
public class FractionCalculatorTest {
    public static void main(String[] args) {

        FractionCalculator FraCalcTest = new FractionCalculator();
        Fraction testValue = new Fraction(0,1);
        String testInput = "";

        //test for correct input
        testInput = "4/5 + 2/3";
        Fraction a = new Fraction(43,33);
        if(!FraCalcTest.evaluate(testValue,testInput).equals(a)) System.out.println("Test failed");

        testInput = "3/5 / -8/12 neg * 4/7 c 5";
        Fraction b = new Fraction(6,-1);
        if(!FraCalcTest.evaluate(testValue,testInput).equals(b)) System.out.println("Test failed");

        testInput = "-1/2 abs + 1/2 - 8/3 neg";
        Fraction c = new Fraction(7,3);
        if(!FraCalcTest.evaluate(testValue,testInput).equals(c)) System.out.println("Test failed");

        //test for two consecutive operations
        testInput = "4/5 + * 2/3";
        Fraction d = new Fraction(22,15);
        if(!FraCalcTest.evaluate(testValue,testInput).equals(d)) System.out.println("Test failed");
    }


}
