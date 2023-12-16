package Pokemons;

import Moves.Poliwag.Blizzard;
import Moves.Poliwag.Double_Team;
import Moves.Poliwhirl.Mud_Bomb;
import Moves.Poliwrath.Dynamic_Punch;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Poliwrath extends Poliwhirl {
    public Poliwrath (String name,int level) {
        super(name,level);
        super.setType(Type.WATER,Type.FIGHTING);
        super.setStats(90,95,95,70,90,70);

        super.setMove(new Double_Team(),new Blizzard(),new Mud_Bomb(),new Dynamic_Punch());
    }
}
