package com.company;

public class Warrior extends Hero{
    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println(getClass().getSimpleName() + superAbilityType + " Combo; ");
    }
}
