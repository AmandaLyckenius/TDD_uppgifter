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
        Discount discount10 = new TenPercentDiscount();
        Discount discount25 = new TwentyFivePercentDiscount();

        //totalt innan discount
        double totalAmount = calculateTotalPrice(itemOne, itemTwo);
        System.out.println("Total amount without discount: " + totalAmount);

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



    public static double calculateTotalPrice (Item... items) {
       double total = 0;

       for (Item item: items ){
           total += item.calculateTotal();
       }

       return total;

    }

}
