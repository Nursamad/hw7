package com.company;

public class Medic extends Hero{
    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println(getClass().getSimpleName() + superAbilityType + " Regenirate; ");
    }
}
