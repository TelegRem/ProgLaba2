package Pokemons;

import Moves.Lapras.Dragon_Dance;
import Moves.Lapras.Frost_Breath;
import Moves.Lapras.Refresh;
import Moves.Lapras.Waterfall;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Lapras extends Pokemon {
    public Lapras(String name,int level){
        super(name,level);
        super.setType(Type.WATER,Type.ICE);
        super.setStats(130,85,80,85,95,60);

        Dragon_Dance Dragon_Dance = new Dragon_Dance(Type.DRAGON,0,0);
        Frost_Breath Frost_Breath = new Frost_Breath(Type.ICE,60,90);
        Refresh refresh = new Refresh(Type.NORMAL,0,0);
        Waterfall waterfall = new Waterfall(Type.WATER,80,100);


        super.setMove(Dragon_Dance,Frost_Breath,refresh,waterfall);
    }
}
