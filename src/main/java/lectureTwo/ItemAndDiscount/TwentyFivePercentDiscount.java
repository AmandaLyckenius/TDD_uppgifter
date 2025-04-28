package lectureTwo.ItemAndDiscount;

public class TwentyFivePercentDiscount implements Discount{
    @Override
    public double applyDiscount(double total) {
        return total - (total * 0.25);
    }
}
