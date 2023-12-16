package Pokemons;

import Moves.Jynx.Draining_Kiss;
import Moves.Smoochum.Facade;
import Moves.Smoochum.Ice_Beam;
import Moves.Smoochum.Pound;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Jynx extends Pokemon {
    public Jynx(String name, int level) {
        super(name, level);
        super.setType(Type.PSYCHIC, Type.ICE);
        super.setStats(65, 50, 35, 115, 95, 95);

        super.setMove(new Facade(),new Ice_Beam(),new Pound(),new Draining_Kiss());
    }
}
