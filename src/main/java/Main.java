public class Main {


    public static void main(String[] args) {
        int numOfDice = 2;
        int numOfRolls = 1000;



        Simulation sim = new Simulation(numOfDice, numOfRolls);

        sim.runSimulation();



    }



}
