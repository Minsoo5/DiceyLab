import java.util.TreeMap;

//Integer[] diceSum = new Integer[13];
//actual sums: n n 2 3 4 5 6 7 8 9 10 11 12
//index nums:  0 1 2 3 4 5 6 7 8 9 10 11 12

public class Bins {
    // Bins(2, 12) will have bins from 2 to 12
    private int lowRange;
    private int highRange;
    private int totalRolls = 0;
    private TreeMap<Integer, Integer> theseBins;
    // <Key = the sum of a pair of dice, value = frequency of that sum>


    public Bins(int lowRange, int highRange) {
        theseBins = new TreeMap<Integer, Integer>();

        for (int i = lowRange; i <= highRange ; i++) {
            // <Key = the sum of a pair of dice, value = frequency of that sum>
            theseBins.put(i, 0);
        }
    }

    public void addSumToBin(int sum) {
        //take the sum and match with key

        theseBins.put(sum, theseBins.get(sum) + 1);
        // go into key, grab the value, add 1 to it.

        totalRolls++;
    }


    //getters and setters




}
