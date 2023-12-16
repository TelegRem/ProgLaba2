package Moves.Sigilyph;

import ru.ifmo.se.pokemon.*;
public class Dream_Eater extends SpecialMove {
    private boolean succes = false;
    public Dream_Eater(Type type, double pow, double acc) {
        super(Type.PSYCHIC,100,100);
    }

    @Override
    protected void applyOppDamage(Pokemon p,double dmg){

        if (p.getCondition() == Status.SLEEP) {
            p.setMod(Stat.HP,(int)Math.round(dmg));
            succes = true;
        }
    }
 /*   @Override
    protected void applySelfDamage(Pokemon p,double dmg) {
        if (p.getCondition() == Status.SLEEP) {
            p.setMod(Stat.HP,(int)Math.round(dmg));
        }
    }*/
     @Override
     protected String describe() {
         if (this.succes == true) {
             return " ударил спящего ";
         }
         return " не ударил ";
     }


}
