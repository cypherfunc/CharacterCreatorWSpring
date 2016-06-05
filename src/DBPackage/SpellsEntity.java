package DBPackage;

import javax.persistence.*;

/**
 * Created by Eric the Red on 6/5/2016.
 */
@Entity
@Table(name = "SPELLS", schema = "", catalog = "")
public class SpellsEntity {
    private String name;
    private Integer level;
    private String school;
    private Integer ritual;
    private Integer castingTime;
    private Integer range;
    private String components;
    private Integer concentration;
    private Integer duration;
    private String savingThrow;
    private Integer numDamageDice;
    private Integer damageDieType;
    private String description;

    @Id
    @Column(name = "name", nullable = false, length = 0)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "level", nullable = true)
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Basic
    @Column(name = "school", nullable = true, length = 0)
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Basic
    @Column(name = "ritual", nullable = true)
    public Integer getRitual() {
        return ritual;
    }

    public void setRitual(Integer ritual) {
        this.ritual = ritual;
    }

    @Basic
    @Column(name = "castingTime", nullable = true)
    public Integer getCastingTime() {
        return castingTime;
    }

    public void setCastingTime(Integer castingTime) {
        this.castingTime = castingTime;
    }

    @Basic
    @Column(name = "range", nullable = true)
    public Integer getRange() {
        return range;
    }

    public void setRange(Integer range) {
        this.range = range;
    }

    @Basic
    @Column(name = "components", nullable = true, length = 0)
    public String getComponents() {
        return components;
    }

    public void setComponents(String components) {
        this.components = components;
    }

    @Basic
    @Column(name = "concentration", nullable = true)
    public Integer getConcentration() {
        return concentration;
    }

    public void setConcentration(Integer concentration) {
        this.concentration = concentration;
    }

    @Basic
    @Column(name = "duration", nullable = true)
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @Basic
    @Column(name = "savingThrow", nullable = true, length = 0)
    public String getSavingThrow() {
        return savingThrow;
    }

    public void setSavingThrow(String savingThrow) {
        this.savingThrow = savingThrow;
    }

    @Basic
    @Column(name = "numDamageDice", nullable = true)
    public Integer getNumDamageDice() {
        return numDamageDice;
    }

    public void setNumDamageDice(Integer numDamageDice) {
        this.numDamageDice = numDamageDice;
    }

    @Basic
    @Column(name = "damageDieType", nullable = true)
    public Integer getDamageDieType() {
        return damageDieType;
    }

    public void setDamageDieType(Integer damageDieType) {
        this.damageDieType = damageDieType;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 0)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SpellsEntity that = (SpellsEntity) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (level != null ? !level.equals(that.level) : that.level != null) return false;
        if (school != null ? !school.equals(that.school) : that.school != null) return false;
        if (ritual != null ? !ritual.equals(that.ritual) : that.ritual != null) return false;
        if (castingTime != null ? !castingTime.equals(that.castingTime) : that.castingTime != null) return false;
        if (range != null ? !range.equals(that.range) : that.range != null) return false;
        if (components != null ? !components.equals(that.components) : that.components != null) return false;
        if (concentration != null ? !concentration.equals(that.concentration) : that.concentration != null)
            return false;
        if (duration != null ? !duration.equals(that.duration) : that.duration != null) return false;
        if (savingThrow != null ? !savingThrow.equals(that.savingThrow) : that.savingThrow != null) return false;
        if (numDamageDice != null ? !numDamageDice.equals(that.numDamageDice) : that.numDamageDice != null)
            return false;
        if (damageDieType != null ? !damageDieType.equals(that.damageDieType) : that.damageDieType != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (level != null ? level.hashCode() : 0);
        result = 31 * result + (school != null ? school.hashCode() : 0);
        result = 31 * result + (ritual != null ? ritual.hashCode() : 0);
        result = 31 * result + (castingTime != null ? castingTime.hashCode() : 0);
        result = 31 * result + (range != null ? range.hashCode() : 0);
        result = 31 * result + (components != null ? components.hashCode() : 0);
        result = 31 * result + (concentration != null ? concentration.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + (savingThrow != null ? savingThrow.hashCode() : 0);
        result = 31 * result + (numDamageDice != null ? numDamageDice.hashCode() : 0);
        result = 31 * result + (damageDieType != null ? damageDieType.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
