import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by karolsudol on 14/11/2014.
 */
public class FractionCalculator {

    Fraction FractionObject;
    String inputString;
    String calculation;
    boolean isRunning;
    ArrayList<String> list;

    Scanner read = new Scanner(System.in);

    public Fraction evaluate(Fraction fraction, String inputStringString) {
        boolean isFraction = isFraction(inputString);
        String calc = calculation.toString();
        if (isFraction) {
            if (calculation == null) {
                return toFraction(inputString);
                } else switch (calc){
                case "+":
                    calculation = null;
                    return fraction.add(toFraction(inputString));
                case "-":
                    calculation = null;
                    return fraction.subtract(toFraction(inputString));
                if (fraction == null) {
                    System.out.println("null");
                }
                return fraction.subtract(toFraction(inputString));
                case "*":
                    calculation = null;
                    return fraction.multiply(toFraction(inputString));
                case "/":
                    calculation = null;
                    return fraction.divide(toFraction(inputString));
            }
        } else {
            if (calculation == null) {
                switch (inputString) {
                    case "+":
                    case "-":
                    case "*":
                    case "/":
                        calculation = inputString;
                        return fraction;
                    case "a":
                    case "A":
                    case "abs":
                        return FractionObject.absValue();
                    case "n":
                    case "N":
                    case "neg":
                        return FractionObject.negate();
                    case "c":
                    case "C":
                    case "clear":
                        FractionObject = null;
                        calculation = null;
                        return null;
                    case "q":
                    case "Q":
                    case "quit":
                        isRunning = false;
                        break;
                    default:
                        printIncorrectFormat();
                        isRunning = false;
                }


            }
        }
        return null;

    }


    public Fraction toFraction(String s) {
        boolean isNumerator = true;
        boolean isNegative = false;
        int numerator = 0;
        int denominator = 1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '-') {
                isNegative = true;
            } else if (Character.isDigit(c)) {
                if (isNumerator) {
                    numerator = Character.getNumericValue(c);
                } else {
                    denominator = Character.getNumericValue(c);
                }

            } else if (c == '/') {
                isNumerator = false;
            } else {
                return null;
            }
            if (isNegative) {
                numerator = -numerator;
            }
        }
        return new Fraction(numerator, denominator);
    }



    public boolean isFraction(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(0))) {
                return true;
            }
        }
        return false;
    }



    public void intoList(String s) {
        String currentElement = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                list.add(currentElement);
                currentElement = "";
            } else {
                currentElement += s.charAt(i);
            }
        }
        if (currentElement != "") {
            list.add(currentElement);
        }
    }


    public String perform(int i) {
        if (!isRunning) {
            return "Program will now quit";
        }
        if (i == list.size()) {
            isRunning = false;
            if (FractionObject == null) {
                return "Wrong inputString";
            } else {
                return FractionObject.toString();
            }
        }
        FractionObject = evaluate(FractionObject, list.get(i));
        return perform(i + 1);
    }

    public void launch(){
        inputString = "";
        FractionObject = null;
        calculation = null;
        isRunning = true;
        list = new ArrayList<String>();
        System.out.print("Enter the operation: ");
        inputString = inputString.nextLine();
        intoList(inputString);
        System.out.println("The answer is: " + perform(0));

        if (isRunning) {
            launch();
        }
    }

    public void exitProgram() {
        System.out.println("Goodbye");
        isRunning = false;
    }

    public void printIncorrectFormat() {
        System.out.println("Error: incorrect format");
    }



}
