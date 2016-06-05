package DBPackage;

import javax.persistence.*;

/**
 * Created by Eric the Red on 6/5/2016.
 */
@Entity
@Table(name = "RACES", schema = "", catalog = "")
public class RacesEntity {
    private String name;
    private int strAdjust;
    private int dexAdjust;
    private int conAdjust;
    private int intAdjust;
    private int wisAdjust;
    private int chaAdjust;
    private String size;
    private int baseHeight;
    private int numHeightDice;
    private int typeHeightDice;
    private int baseWeight;
    private int numWeightDice;
    private int typeWeightDice;
    private int speed;
    private String languages;

    @Id
    @Column(name = "name", nullable = false, length = 0)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "strAdjust", nullable = false)
    public int getStrAdjust() {
        return strAdjust;
    }

    public void setStrAdjust(int strAdjust) {
        this.strAdjust = strAdjust;
    }

    @Basic
    @Column(name = "dexAdjust", nullable = false)
    public int getDexAdjust() {
        return dexAdjust;
    }

    public void setDexAdjust(int dexAdjust) {
        this.dexAdjust = dexAdjust;
    }

    @Basic
    @Column(name = "conAdjust", nullable = false)
    public int getConAdjust() {
        return conAdjust;
    }

    public void setConAdjust(int conAdjust) {
        this.conAdjust = conAdjust;
    }

    @Basic
    @Column(name = "intAdjust", nullable = false)
    public int getIntAdjust() {
        return intAdjust;
    }

    public void setIntAdjust(int intAdjust) {
        this.intAdjust = intAdjust;
    }

    @Basic
    @Column(name = "wisAdjust", nullable = false)
    public int getWisAdjust() {
        return wisAdjust;
    }

    public void setWisAdjust(int wisAdjust) {
        this.wisAdjust = wisAdjust;
    }

    @Basic
    @Column(name = "chaAdjust", nullable = false)
    public int getChaAdjust() {
        return chaAdjust;
    }

    public void setChaAdjust(int chaAdjust) {
        this.chaAdjust = chaAdjust;
    }

    @Basic
    @Column(name = "size", nullable = false, length = 0)
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Basic
    @Column(name = "baseHeight", nullable = false)
    public int getBaseHeight() {
        return baseHeight;
    }

    public void setBaseHeight(int baseHeight) {
        this.baseHeight = baseHeight;
    }

    @Basic
    @Column(name = "numHeightDice", nullable = false)
    public int getNumHeightDice() {
        return numHeightDice;
    }

    public void setNumHeightDice(int numHeightDice) {
        this.numHeightDice = numHeightDice;
    }

    @Basic
    @Column(name = "typeHeightDice", nullable = false)
    public int getTypeHeightDice() {
        return typeHeightDice;
    }

    public void setTypeHeightDice(int typeHeightDice) {
        this.typeHeightDice = typeHeightDice;
    }

    @Basic
    @Column(name = "baseWeight", nullable = false)
    public int getBaseWeight() {
        return baseWeight;
    }

    public void setBaseWeight(int baseWeight) {
        this.baseWeight = baseWeight;
    }

    @Basic
    @Column(name = "numWeightDice", nullable = false)
    public int getNumWeightDice() {
        return numWeightDice;
    }

    public void setNumWeightDice(int numWeightDice) {
        this.numWeightDice = numWeightDice;
    }

    @Basic
    @Column(name = "typeWeightDice", nullable = false)
    public int getTypeWeightDice() {
        return typeWeightDice;
    }

    public void setTypeWeightDice(int typeWeightDice) {
        this.typeWeightDice = typeWeightDice;
    }

    @Basic
    @Column(name = "speed", nullable = false)
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Basic
    @Column(name = "languages", nullable = false, length = 0)
    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RacesEntity that = (RacesEntity) o;

        if (strAdjust != that.strAdjust) return false;
        if (dexAdjust != that.dexAdjust) return false;
        if (conAdjust != that.conAdjust) return false;
        if (intAdjust != that.intAdjust) return false;
        if (wisAdjust != that.wisAdjust) return false;
        if (chaAdjust != that.chaAdjust) return false;
        if (baseHeight != that.baseHeight) return false;
        if (numHeightDice != that.numHeightDice) return false;
        if (typeHeightDice != that.typeHeightDice) return false;
        if (baseWeight != that.baseWeight) return false;
        if (numWeightDice != that.numWeightDice) return false;
        if (typeWeightDice != that.typeWeightDice) return false;
        if (speed != that.speed) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (size != null ? !size.equals(that.size) : that.size != null) return false;
        if (languages != null ? !languages.equals(that.languages) : that.languages != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + strAdjust;
        result = 31 * result + dexAdjust;
        result = 31 * result + conAdjust;
        result = 31 * result + intAdjust;
        result = 31 * result + wisAdjust;
        result = 31 * result + chaAdjust;
        result = 31 * result + (size != null ? size.hashCode() : 0);
        result = 31 * result + baseHeight;
        result = 31 * result + numHeightDice;
        result = 31 * result + typeHeightDice;
        result = 31 * result + baseWeight;
        result = 31 * result + numWeightDice;
        result = 31 * result + typeWeightDice;
        result = 31 * result + speed;
        result = 31 * result + (languages != null ? languages.hashCode() : 0);
        return result;
    }
}
