package Pokemons;

import Moves.Smoochum.Facade;
import Moves.Smoochum.Ice_Beam;
import Moves.Smoochum.Pound;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Smoochum extends Pokemon {

    public Smoochum(String name, int level) {
        super(name, level);
        super.setType(Type.PSYCHIC, Type.ICE);
        super.setStats(45, 30, 15, 85, 65, 65);

        super.setMove(new Facade(),new Ice_Beam(),new Pound());
    }

}
