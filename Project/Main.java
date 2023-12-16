package Project;

import Pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {
    public static void main(String[] args) {

        //https://pokemondb.net/pokedex/lapras
        //https://pokemondb.net/pokedex/smoochum
        //https://pokemondb.net/pokedex/jynx
        //https://pokemondb.net/search?q=Poliwag
        //https://pokemondb.net/pokedex/poliwhirl
        //https://pokemondb.net/pokedex/poliwrath


        Battle b = new Battle();
        Jynx p1 = new Jynx("Jynx", 1);
        Lapras p2 = new Lapras("Lapras",1);
        Poliwag p3 = new Poliwag("Poliwag",1);
        Poliwhirl p4 = new Poliwhirl("Poliwhirl",1);
        Smoochum p5 = new Smoochum("Smoochum",1);
        Poliwrath p6 = new Poliwrath("Poliwrath",1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }

    public static boolean chance (double d) {

        return d > Math.random();
    }
}