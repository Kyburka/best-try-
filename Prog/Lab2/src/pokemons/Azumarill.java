package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.status.*;
import moves.physical.*;

public class Azumarill extends Pokemon {
    private int baseHealthPoints;
    private int baseAttack;
    private int baseDefence;
    private int baseSpecialAttack;
    private int baseSpecialDefence;
    private int baseSpeed;

    public Azumarill(String name, int level) {
        super(name, level);
        setType(Type.WATER, Type.FAIRY);
        baseHealthPoints = 100;
        baseAttack = 50;
        baseDefence = 80;
        baseSpecialAttack = 60;
        baseSpecialDefence = 80;
        baseSpeed = 50;
        setStats(baseHealthPoints, baseAttack, baseDefence, baseSpecialAttack, baseSpecialDefence, baseSpeed);
        setMove(new WorkUp(), new Confide(), new AquaJet(), new PlayRough());

    }
}