package Pokemons;

import Moves.Sigilyph.Confide;
import Moves.Sigilyph.Cosmic_Power;
import Moves.Sigilyph.Dream_Eater;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Sigilyph extends Pokemon {

    public Sigilyph (String name,int level){

        super(name,level);
        super.setType(Type.PSYCHIC, Type.FLYING);
        super.setStats(72,58,80,103,80,97);

        Confide confide = new Confide(Type.PSYCHIC,50,100);
        Cosmic_Power cosmic_power = new Cosmic_Power(Type.PSYCHIC, 0,0 );
        Dream_Eater dream_eater = new Dream_Eater(Type.PSYCHIC,100,100);

        super.setMove(confide,cosmic_power,dream_eater);
    }

}
