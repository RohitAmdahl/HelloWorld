public class Hello {
    public static void main (String[] args) {
        System.out.println("Hello, Tim");
        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("It is not an Alien!");
//            System.out.println("And i am fried of Alien");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("you have high score");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("topScore is the top");
        }

        if ((topScore > 90 )|| (secondTopScore <= 90)) {
            System.out.println("either or both of the condition are true");
        }

        int newValue = 400;
        if (newValue == 40) System.out.println("newValue is 50");

        boolean isCar = false;
        if (isCar) { // some reason code is running  why? (isCar = true)
            // (isCar == true) i need to do this.
            // valid shortcut in java (isCar)
            System.out.println("this code with not run");
        }

        String makeOfCar = "Volkswagen"; // varable that asign to "Volkswagen"
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true; // ternary operator
        if (isDomestic){
            System.out.println("this car is Domestic to our country");
        }

        int ageOfClient = 20;
        String ageText = (ageOfClient >= 18) ? "over Eighteen" : "still not Valid eight person is Kid";
        System.out.println("our client is" + ageText);

        double myDouble = 20.00;
        double mySecond = 80.00;

        double addNumbers = (myDouble + mySecond) * 100.00 ;
        System.out.println(addNumbers);
        double myRiemder = (addNumbers % 40.00);
        System.out.println(myRiemder);

        boolean myTrue = (myRiemder == 0.00) ? true : false;
        System.out.println(myTrue);

        if (myTrue){
            System.out.println("Got some remainder");
        }
//

    }
}
