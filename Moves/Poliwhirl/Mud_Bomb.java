package Moves.Poliwhirl;

import Project.Main;
import ru.ifmo.se.pokemon.*;

public class Mud_Bomb extends SpecialMove {
    private boolean succes = false;
    public Mud_Bomb () {
        super(Type.GROUND,65,85);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Main.chance(0.3)){
            pokemon.setMod(Stat.ACCURACY,-1);
             succes = true;
        }
    }
    @Override
    protected String describe() {
        return " использует Mud Bomb " + ((succes) ? "и снизил точность врагу" : "");
    }
}
