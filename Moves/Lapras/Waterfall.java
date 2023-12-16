package Moves.Lapras;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Waterfall extends PhysicalMove {

    public Waterfall (Type type,double pow,double acc) {
        super(Type.WATER,80,100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
            Effect.flinch(pokemon);
    }
    @Override
    protected String describe() {
        return " использует Waterfall ";
    }
}
