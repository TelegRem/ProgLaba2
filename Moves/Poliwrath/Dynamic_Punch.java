package Moves.Poliwrath;

import ru.ifmo.se.pokemon.*;

public class Dynamic_Punch extends PhysicalMove {
    public Dynamic_Punch () {
        super(Type.FIGHTING,100,50);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect.confuse(pokemon);
    }
    @Override
    protected String describe() {
        return " использует Dynamic Punch ";
    }
}
