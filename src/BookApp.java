import java.util.Scanner;
public class BookApp {
    public static void main(String[] args){
        BookClass book1 = new BookClass("Space robots", "Mike Asimov", "robots in space, duh", 20, true);
        Scanner keyboard = new Scanner(System.in);

        book1.getDisplayText();

        System.out.println("How many copies would you like to buy?");
        double answer = keyboard.nextDouble();



        if (book1.isInStock() == true){
            System.out.println("The total cost of your purchase is: $" + book1.totalPrice(answer));

        }else {
            System.out.println("Sorry, that book is out of stock.");
        }





    }
}
