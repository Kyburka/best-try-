import ru.ifmo.se.pokemon.Battle;
import pokemons.*;

public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();

        Azurill ally1 = new Azurill("1 союзник", 10);
        Marill ally2 = new Marill("2 союзник", 10);
        Nincada ally3 = new Nincada("3 союзник", 10);

        Azumarill foe1 = new Azumarill("1 противник", 10);
        Shedinja foe2 = new Shedinja("2 противник", 10);
        Seviper foe3 = new Seviper("3 противник", 10);

        battle.addAlly(ally1);
        battle.addAlly(ally2);
        battle.addAlly(ally3);

        battle.addFoe(foe1);
        battle.addFoe(foe2);
        battle.addFoe(foe3);

        battle.go();
    }
}