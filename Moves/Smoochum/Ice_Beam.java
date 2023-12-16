package Moves.Smoochum;

import Project.Main;
import ru.ifmo.se.pokemon.*;

public class Ice_Beam extends SpecialMove {
    private boolean succes = false;
    public Ice_Beam () {
        super(Type.ICE,90,100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Main.chance(0.1))
        Effect.freeze(pokemon);
        succes = true;
    }

    @Override
    protected String describe() {
        return " использует Ice Beam " + ((succes) ? "и заморозил врага" : "");
    }
}
