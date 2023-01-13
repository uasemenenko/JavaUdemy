package HelloWorld.src;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Oleksandr");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am not scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got a high score!");
        }

        int secondTopScore = 95;
        if((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newWalue = 50;
        if (newWalue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";

        System.out.println(s);


        double firstValue = 20.00d;
        double secondValue = 80.00d;
        double totalValue = firstValue + secondValue * 100.00d;
        System.out.println("totalValue = " + totalValue);
        double theRemainder = totalValue % 40.00d;
        System.out.println("theRemainder = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNotRemainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder"); 
        }

    }
}
