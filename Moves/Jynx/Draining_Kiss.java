package Moves.Jynx;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Draining_Kiss extends SpecialMove {
    public Draining_Kiss() {
        super(Type.FAIRY,50,100);
    }

    protected String describe() {
        return " использует Draining Kiss ";
    }
}
