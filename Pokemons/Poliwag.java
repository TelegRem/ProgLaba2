package Pokemons;

import Moves.Poliwag.Blizzard;
import Moves.Poliwag.Double_Team;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Poliwag extends Pokemon {

    public Poliwag(String name,int level){
        super(name,level);
        super.setType(Type.WATER);
        super.setStats(40,50,40,40,40,90);




        super.setMove(new Double_Team(),new Blizzard());
    }

}
