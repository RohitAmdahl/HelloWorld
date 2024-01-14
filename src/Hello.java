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
        if (newValue == 40) {
            System.out.println("newValue is 50");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("this code with not run");
        }
        else {
            System.out.println("this code will say car is false");
        }
    }
}
