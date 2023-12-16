package Moves.Lapras;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Dragon_Dance extends StatusMove {

    public Dragon_Dance (Type type, double pow, double acc) {
        super(Type.DRAGON,0,0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.ATTACK,+1);
        pokemon.setMod(Stat.SPEED,+1);
    }

    @Override
    protected String describe() {
        return " использует Dragon Dance ";
    }
}
