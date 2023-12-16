package Pokemons;

import Moves.Poliwag.Blizzard;
import Moves.Poliwag.Double_Team;
import Moves.Poliwhirl.Mud_Bomb;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Poliwhirl extends Poliwag {

    public Poliwhirl (String name,int level) {
        super(name,level);
        super.setType(Type.WATER);
        super.setStats(65,65,65,50,50,90);

        super.setMove(new Double_Team(),new Blizzard(),new Mud_Bomb());
    }
}
