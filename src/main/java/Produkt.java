import java.util.ArrayList;

public class Produkt {

    ArrayList<Double> cart = new ArrayList<>();
    CalculatorService calculatorService;

    public Produkt(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }



    public void addToCart(Double price) {
        cart.add(price);
    }


    public double calculateTotal() {
        double total= 0;

        for (double price: cart){
            total += price;
        }
        return total;
    }

    public double calculateTotalAndApplyDiscountIfSumExceeds500() {
        double total = calculateTotal();

        double newTotal = calculatorService.applyDiscount(total);

        return newTotal;
    }

}
