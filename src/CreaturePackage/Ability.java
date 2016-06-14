package CreaturePackage;

import javafx.beans.property.IntegerProperty;

/**
 * Created by Eric the Red on 4/13/2016.
 */


//Represents an ability score, with inputs for base score and adjustments,
// and outputs for final score and modifier.

public class Ability {

    private String name;
    private IntegerProperty base;
    private IntegerProperty raceAdj;
    private IntegerProperty tempAdj;
    private IntegerProperty score;
    private IntegerProperty mod;

    //Constructor creates bindings to calculate score and modifier
    public Ability(String name) {
        this.name = name;
        score.bind(base.add(raceAdj).add(tempAdj));
        mod.bind((score.subtract(10)).divide(2));
    }


    public void setBase(int b) {
        this.base.set(b);
    }
    public void setRaceAdj(int r) {
        this.raceAdj.set(r);
    }
    public void setTempAdj(int t) {
        this.tempAdj.set(t);
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score.get();
    }
    public IntegerProperty scoreProperty() {
        return score;
    }

    public int getMod() {
        return mod.get();
    }
    public IntegerProperty modProperty() {
        return mod;
    }





}
