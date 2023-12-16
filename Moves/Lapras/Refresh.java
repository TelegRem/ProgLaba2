package Moves.Lapras;

import ru.ifmo.se.pokemon.*;

public class Refresh extends StatusMove {

    public Refresh (Type type, double pow, double acc) {
        super(Type.NORMAL,0,0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        if(pokemon.getCondition() == Status.PARALYZE){

        }
         if(pokemon.getCondition() == Status.POISON){

        }
         if(pokemon.getCondition() == Status.BURN){

        }

    }
    @Override
    protected String describe() {
        return " использует Refresh ";
    }
}
