package Moves.Poliwag;

import Project.Main;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Blizzard extends SpecialMove {

    public Blizzard () {
        super(Type.ICE,110,70);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (pokemon.hasType(Type.ICE) != true) {
            if (Main.chance(0.1)) {
                Effect.freeze(pokemon);
            }
        }
    }
}
