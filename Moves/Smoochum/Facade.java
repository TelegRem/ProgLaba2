package Moves.Smoochum;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

    public class Facade extends PhysicalMove {

        private boolean succes = false;

        public Facade() {
            super(Type.NORMAL, 70, 100);
        }

        @Override
        protected void applyOppDamage(Pokemon p, double damage) {
            if (p.getCondition() == Status.BURN || p.getCondition() == Status.POISON || p.getCondition() == Status.PARALYZE) {
                succes = true;
                damage = damage * 2;
            }
        }

        @Override
        protected String describe() {
            if (this.succes == true) {
                return " ударил Facade с удвоенной силой ";
            }
            return " ударил Facade со стандартной силой ";
        }
    }

