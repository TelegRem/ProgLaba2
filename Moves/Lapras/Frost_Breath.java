package Moves.Lapras;

import ru.ifmo.se.pokemon.*;
public class Frost_Breath extends SpecialMove {

    public Frost_Breath (Type type,double pow,double acc) {

        super(Type.ICE,60,90);

    }

    @Override
    protected double calcCriticalHit(Pokemon pokemon, Pokemon pokemon1) {
        return 1.5;
    }

    @Override
    protected String describe() {
        return " использует Frost Breath ";
    }
}
