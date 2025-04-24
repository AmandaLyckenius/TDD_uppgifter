import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProduktTest {


    @Test
    public void addPriceToCartArray (){
        CalculatorService calculatorService = new CalculatorService();
        Produkt produkt = new Produkt(calculatorService);
        double price = 100;

        produkt.addToCart(price);

        assertTrue(produkt.cart.contains(price));
    }

    @Test
    public void calculateTotalPrice() {
        CalculatorService calculatorService = new CalculatorService();
        Produkt produkt = new Produkt(calculatorService);
        double productOne= 100;
        double productTwo = 200;

        produkt.addToCart(productOne);
        produkt.addToCart(productTwo);

        assertEquals(300, produkt.calculateTotal());
    }

    @Test
    public void calculateTotalAndApplyDiscount() {
        CalculatorService calculatorService = new CalculatorService();
        Produkt produkt = new Produkt(calculatorService);

        double discount = 10;
        double productOne= 200;
        double productTwo = 300;

        calculatorService.discount = discount;

        produkt.addToCart(productOne);
        produkt.addToCart(productTwo);

        assertEquals(450, produkt.calculateTotalAndApplyDiscountIfSumExceeds500());


    }

}
