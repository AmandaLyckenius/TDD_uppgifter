package lectureTwo.ItemAndDiscount;

public class TenPercentDiscount implements Discount{
    @Override
    public double applyDiscount(double total) {
        return total - (total * 0.10);
    }
}
