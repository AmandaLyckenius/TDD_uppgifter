public class CalculatorService {

    double numberOne;
    double numberTwo;
    double sum;
    double discount;

    public double add() {
        return (numberOne + numberTwo);
    }

    public double subtract() {
        return (numberOne - numberTwo);
    }

    public double divide() {
        return (numberOne/numberTwo);
    }

    public double multiply(){
        return (numberOne*numberTwo);
    }

    public double applyDiscount(double sum) {
        if (sum >= 500){
            return (sum* (1 - discount/100));
        } else {
            return sum;
        }
    }

}
