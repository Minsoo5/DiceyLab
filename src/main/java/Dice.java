import java.util.Random;
import java.util.ArrayList;

public class Dice {
    private int numRolled;
    private int numOfDice;

    public Dice(int numOfDice) {
        this.numOfDice = numOfDice;
    }


    public int tossAndSum() {
        numRolled = 0;
        Random random = new Random();
        for (int i = 0; i < numOfDice; i++) {
            numRolled += random.nextInt(6) + 1;
        }
        return numRolled;
    }


//    public void roll(int numOfThrows){
//
//        int counter = 0;
//        while (counter < numOfThrows) {
//            numRolled += random.nextInt(6) + 1;
//            counter++;
//        }
//    }
    //a way to get the number rolled
    public int getNumRolled() {
        return numRolled;
    }

}
