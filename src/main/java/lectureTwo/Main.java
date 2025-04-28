package lectureTwo;

import lectureTwo.ItemAndDiscount.*;
import lectureTwo.animals.Animal;
import lectureTwo.animals.Bird;
import lectureTwo.animals.Dog;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Item itemOne = new Item("Laptop", 1000.00, 1);
        Item itemTwo = new Item("Phone", 500.00, 2);
        DiscountService discountService = new DiscountService();
        Discount discount10 = new TenPercentDiscount();
        Discount discount25 = new TwentyFivePercentDiscount();

        //totalt innan discount
        double itemOneTotal = itemOne.calculateTotal();
        double itemTwoTotal = itemTwo.calculateTotal();
        double totalAmount = itemOneTotal + itemTwoTotal;
        System.out.println("Total amount without discount: " + totalAmount);

        //Discount Amount
        double discountPercent = 10.0;
        double discountAmount = discountService.calculateDiscountAmount(totalAmount, discountPercent);
        System.out.println("Discount amount: " + discountAmount);

        //Total after discount
        double totalAfterDiscount = discountService.calculatePriceAfterDiscount(totalAmount, discountPercent);
        System.out.println("Total amount after discount: " + totalAfterDiscount);


        //Using tenPercentDiscount
        double totalAfter10PercentDiscount = discount10.applyDiscount(totalAmount);
        System.out.println("Total after 10% discount: " + totalAfter10PercentDiscount);

        //using twentyFivePercentDiscount
        double totalAfter25PercentDiscount = discount25.applyDiscount(totalAmount);
        System.out.println("Total after 25% discount: " + totalAfter25PercentDiscount);


        //EXAMPLE TWO

        List<Bird> Bird = new ArrayList();

        Dog dog = new Dog("Bodil", 2);
        Bird bird = new Bird("Kråkan", 5);

      //  Bird.add(dog); Does not work

        List <Animal> Animals = new ArrayList<>();

        Animals.add(dog);
        Animals.add(bird);



    }

    //KOD FRÅN EXEMPEL
    // Items
//    String item1Name = "Laptop";
//    double item1Price = 1000.00;
//    int item1Quantity = 1;
//
//    String item2Name = "Phone";
//    double item2Price = 500.00;
//    int item2Quantity = 2;
//
//    // Prices before discount
//    double item1Total = item1Price * item1Quantity;
//    double item2Total = item2Price * item2Quantity;
//    double totalBeforeDiscount = item1Total + item2Total;
//    System.out.println("Total before discount: $" + totalBeforeDiscount);
//
//    // Discount
//    double discount = 10.0;
//    double discountAmount = totalBeforeDiscount * (discount / 100);
//    double totalAfterDiscount = totalBeforeDiscount - discountAmount;
//     System.out.println("Discount: $" + discountAmount);
//     System.out.println("Total after discount: $" + totalAfterDiscount);
//
//    // Another method of calculating total for the same items
//    double anotherItem1Total = item1Price * item1Quantity;
//    double anotherItem2Total = item2Price * item2Quantity;
//    double anotherTotalBeforeDiscount = anotherItem1Total + anotherItem2Total;
//    double anotherDiscountAmount = anotherTotalBeforeDiscount * (discount / 100);
//    double anotherTotalAfterDiscount = anotherTotalBeforeDiscount - anotherDiscountAmount;
//     System.out.println("Another total before discount: $" + anotherTotalBeforeDiscount);
//     System.out.println("Another total after discount: $" + anotherTotalAfterDiscount);

}
