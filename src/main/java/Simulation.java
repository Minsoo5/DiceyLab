public class Simulation {

    public int numOfRolls;
    public int numOfDice;
    public Bins groupOfBins;

    public Simulation(int numOfDice, int numOfRolls) {
        this.numOfDice = numOfDice;
        this.numOfRolls = numOfRolls;
        int highRange = numOfDice * 6;

        groupOfBins = new Bins(numOfDice, highRange);
    }

    public void runSimulation () {
        Dice diceInHand = new Dice(numOfDice);

        for (int i = 0; i < numOfRolls; i++) {
            diceInHand.tossAndSum();
            groupOfBins.addSumToBin(diceInHand.tossAndSum());

        }
    }


    }

