package Moves.Sigilyph;

import Project.Main;
import ru.ifmo.se.pokemon.*;
public class Confide extends StatusMove {
    public Confide(Type type, double pow, double acc) {
        super(Type.NORMAL,0,0);

    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK,-1);
    }
    @Override
    protected String describe() {
        return " снизил SPECIAL_ATTACK на 1 ступень ";
    }
}



