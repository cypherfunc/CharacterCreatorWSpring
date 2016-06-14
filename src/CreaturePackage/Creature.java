package CreaturePackage;

import javafx.beans.property.IntegerProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eric the Red on 6/5/2016.
 */
public class Creature {
    protected IntegerProperty hitPoints;
    protected IntegerProperty armorClass;
    protected IntegerProperty passiveWisdom;
    protected IntegerProperty speed;
    protected IntegerProperty profBonus;

    protected Ability str;
    protected Ability dex;
    protected Ability con;
    protected Ability intel;
    protected Ability wis;
    protected Ability cha;
    protected ArrayList<Ability> abilities;

    protected ArrayList<Skill> skills;

    protected Size size;

    protected LawfulChaotic lnc;
    protected GoodEvil gne;



    public int getHitPoints() {
        return hitPoints.get();
    }
    public IntegerProperty hitPointsProperty() {
        return hitPoints;
    }
    public void setHitPoints(int hitPoints) {
        this.hitPoints.set(hitPoints);
    }

    public int getArmorClass() {
        return armorClass.get();
    }
    public IntegerProperty armorClassProperty() {
        return armorClass;
    }
    public void setArmorClass(int armorClass) {
        this.armorClass.set(armorClass);
    }

    public int getPassiveWisdom() {
        return passiveWisdom.get();
    }
    public IntegerProperty passiveWisdomProperty() {
        return passiveWisdom;
    }
    public void setPassiveWisdom(int passiveWisdom) {
        this.passiveWisdom.set(passiveWisdom);
    }

    public int getSpeed() {
        return speed.get();
    }
    public IntegerProperty speedProperty() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed.set(speed);
    }

    public int getProfBonus() {
        return profBonus.get();
    }
    public IntegerProperty profBonusProperty() {
        return profBonus;
    }
    public void setProfBonus(int profBonus) {
        this.profBonus.set(profBonus);
    }

    public ArrayList<Ability> getAbilities() {
        return abilities;
    }
    public void setAbilities(List abilities) {
        this.abilities = (ArrayList<Ability>) abilities;
    }

    public void setStr(Ability str) {
        this.str = str;
    }
    public Ability getStr() {
        return str;
    }

    public Ability getDex() {
        return dex;
    }
    public void setDex(Ability dex) {
        this.dex = dex;
    }

    public Ability getCon() {
        return con;
    }
    public void setCon(Ability con) {
        this.con = con;
    }

    public Ability getIntel() {
        return intel;
    }
    public void setIntel(Ability intel) {
        this.intel = intel;
    }

    public Ability getWis() {
        return wis;
    }
    public void setWis(Ability wis) {
        this.wis = wis;
    }

    public Ability getCha() {
        return cha;
    }
    public void setCha(Ability cha) {
        this.cha = cha;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }
    public void setSkills (List skills) {
        this.skills = (ArrayList<Skill>) skills;
    }

    public Size getSize() {
        return size;
    }
    public void setSize(Size size) {
        this.size = size;
    }

    public LawfulChaotic getLnc() {
        return lnc;
    }
    public void setLnc(LawfulChaotic lnc) {
        this.lnc = lnc;
    }

    public GoodEvil getGne() {
        return gne;
    }
    public void setGne(GoodEvil gne) {
        this.gne = gne;
    }
}
