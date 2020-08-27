package com.company;

import Hero.*;

public class Main {

    public static void main(String[] args) {
        Warrior warrior = new Warrior(130, 40, "CRITICAL DAMAGE");
        Medic medic = new Medic(140,0, " ЛЕЧИТ ГЕРОЕВ ");
        Magic magic = new Magic(150,35,"CRITICAL DAMAGE");

        HavingSuperAbility[] heroes = {warrior,medic,magic};
        for (HavingSuperAbility r: heroes) {
            r.superAbilityType();
        }


    }
    public static void hit(HavingSuperAbility hit){
        hit.superAbilityType();
    }

}
