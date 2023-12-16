package Moves.Sigilyph;

import ru.ifmo.se.pokemon.*;

public class Cosmic_Power extends StatusMove {
    public Cosmic_Power(Type type, double pow, double acc) {
        super(Type.PSYCHIC,0,0);

    }
    @Override
    protected void applySelfEffects(Pokemon p) {

        p.setMod(Stat.DEFENSE,+1);
        p.setMod(Stat.SPECIAL_DEFENSE,+1);
    }
    @Override
    protected String describe() {
        return " увеличил показатели защиты на 1 ступень ";
    }
}
