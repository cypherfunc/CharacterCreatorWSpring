package CreaturePackage;

import javafx.beans.binding.IntegerBinding;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;

/**
 * Created by Eric the Red on 6/14/2016.
 */

//Represents a Skill score, including its ability score dependency and state of proficiency
public class Skill {

    private String name;
    private IntegerProperty mod;
    private BooleanProperty prof;

    private Creature me;
    private Ability ability;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getMod() {
        return mod.get();
    }
    public IntegerProperty modProperty() {
        return mod;
    }
    public void setMod(int mod) {
        this.mod.set(mod);
    }

    public boolean getProf() {
        return prof.get();
    }
    public BooleanProperty profProperty() {
        return prof;
    }
    public void setProf(boolean prof) {
        this.prof.set(prof);
    }

    public Ability getAbility() {
        return ability;
    }

    //If creature is proficient in this skill, adds creature's proficiency bonus
    private int checkProf() {
        if (this.prof.get()) {
            return me.getProfBonus();
        } else {
            return 0;
        }
    }

    //Constructor, binds skill to given creature's particular ability
    public Skill(String name, Creature person, Ability abil) {
        this.name = name;
        this.me = person;
        this.ability = abil;
        this.mod.bind(new IntegerBinding(){
            {
                //updates skill modifier if ability or proficiency changes
                super.bind(ability.modProperty(), Skill.this.prof);
            }

            //calculates skill modifier from ability and proficiency
            @Override
            protected int computeValue() {
                return ability.getMod() + Skill.this.checkProf();
            }
        });
    }

}
