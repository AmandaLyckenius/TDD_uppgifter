public class DiscountService {

   public double calculateDiscountAmount(double totalPrice, double discountPercent) {
       return (totalPrice * (discountPercent / 100));
   }

   public double calculatePriceAfterDiscount (double totalPrice, double discountPercent) {
       double discountAmount = calculateDiscountAmount(totalPrice, discountPercent);
       return (totalPrice - discountAmount) ;
   }

}
