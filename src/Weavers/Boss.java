package Weavers;

import java.util.Stack;

public class Boss {
    //TODO: MAKE SUPER CLASS USE BIKE EXAMPLE AND CREATE DIFFERENT FILES FOR EACH BOSS
    int char_hp;
    int char_atk;
    int char_def;
    int char_spd;
    public String name;

    public Skill[] bossSkills;

    public void setChar_hp(int char_hp) {
        this.char_hp = char_hp;
    }

    public void setChar_atk(int char_atk) {
        this.char_atk = char_atk;
    }

    public void setChar_def(int char_def) {
        this.char_def = char_def;
    }

    public void setChar_spd(int char_spd) {
        this.char_spd = char_spd;
    }

    public int getChar_hp() {
        return char_hp;
    }

    public int getChar_atk() {
        return char_atk;
    }

    public int getChar_def() {
        return char_def;
    }

    public int getChar_spd() {
        return char_spd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill[] getBossSkills() {
        return bossSkills;
    }

    public void setBossSkills(Skill[] bossSkills) {
        this.bossSkills = bossSkills;
    }

    public Boss(String name, Skill[]skills, int char_spd, int char_atk, int char_def, int char_hp){
        this.name = name;
        this.bossSkills = skills;
        this.char_atk = char_atk;
        this.char_def = char_def;
        this.char_hp = char_hp;
        this.char_spd = char_spd;
    }

}
