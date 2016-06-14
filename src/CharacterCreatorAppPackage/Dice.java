package CharacterCreatorAppPackage;

import java.util.Arrays;
import java.util.Random;

/**
 * @author	Eric Rainville <ericrainvillevt@gmail.com>
 * @version 	0.1
 * @since 		2016-02-10
 */

public class Dice {

    /**
     * Returns the sum of a given number of rolls of a die with a given number of sides,
     * removes a given number of the highest or lowest rolls, and adds a modifier.
     *
     * <p>
     * @param	nDice 	number of rolls
     * @param	nSides 	number of sides on the die
     * @param	rollMod number to be added to the total
     * @param   removeHigh if true, removes highest rolls, if false, removes lowest
     * @param   nRemove number of rolls to remove
     * @return			integer sum of all rolls
     */
    public static int roll(int nDice, int nSides, int rollMod, boolean removeHigh, int nRemove) {

        if (nDice == 0 || nDice == nRemove){return 0;}
        else if (nSides == 1){return 1;}
        else if (nSides < 0 || nRemove < 0 || nDice < nRemove) {
            System.out.println("Dice Error: Quantity of dice must not be negative.\n" +
                    "Quantity of dice removed must be less than quantity rolled.\n" +
                    "Number of sides must be greater than 0.");
            return 0;
        } else {
            int[] rolls = new int[nDice];
            Random random = new Random();
            int total = 0;

            for (int r : rolls) rolls[r] = random.nextInt(nSides) + 1;
            Arrays.sort(rolls);

            if (removeHigh) {
                for (int i = 0; i < (nDice - nRemove); i++)
                    total += rolls[i];
            } else {
                for (int i = nRemove; i < nDice; i++)
                    total += rolls[i];
            }

            total = total + rollMod;
            return total;
        }
    }

    //Overloaded method options
    public static int roll(int nDice, int nSides) {
        return roll(nDice, nSides, 0, true, 0);
    }

    public static int roll(int nDice, int nSides, int rollMod) {
        return roll(nDice, nSides, rollMod, true, 0);
    }

    public static int roll(int nDice, int nSides, boolean removeHigh, int nRemove) {
        return roll(nDice, nSides, 0, removeHigh, nRemove);
    }


    //Common d20 rolls
    public static int rollCheck(int rollMod){
        return roll(1, 20, rollMod);
    }

    public static int rollAdvantage(int rollMod){
        return roll(2, 20, rollMod, false, 1);
    }

    public static int rollDisadvantage(int rollMod){
        return roll(2, 20, rollMod, true, 1);
    }

}