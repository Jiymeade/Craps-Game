import java.util.Random;
import java.util.Scanner;

public class CPSGame {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        boolean done = false;
        String userResp;
        int die1 = rnd.nextInt(6) + 1;
        int die2 = rnd.nextInt(6) + 1;
        int crapsRoll = die1 + die2;
        System.out.printf(" %d + %d = %d %n", die1, die2, crapsRoll);
        do{
        if (crapsRoll == 7 || crapsRoll == 11) {
            System.out.println("Player wins");
            return;
        } else if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12) {
            System.out.println("Player lost");
            return;
        }
        int newCrapsRoll = 0;
        while (newCrapsRoll != crapsRoll && newCrapsRoll !=7){
            int die = rnd.nextInt(6) + 1;
            int dieoff = rnd.nextInt(6);
            newCrapsRoll = die + dieoff;
            System.out.printf(" %d + %d = %d %n", die, dieoff, newCrapsRoll);
        }
        if(newCrapsRoll == crapsRoll){
            System.out.println("Player wins");
        }else{
            System.out.println("Player lost");
        }

            System.out.println(" Do you want to play again?");
            userResp = in.nextLine();
            if (userResp.equalsIgnoreCase("n")) {//When comparing string don't use == that is for numbers
                done = true;
            }
        }while(!done);



    }
}
