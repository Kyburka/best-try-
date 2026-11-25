package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.status.*;
import moves.physical.*;

public class Marill extends Pokemon {
    private int baseHealthPoints;
    private int baseAttack;
    private int baseDefence;
    private int baseSpecialAttack;
    private int baseSpecialDefence;
    private int baseSpeed;

    public Marill(String name, int level) {
        super(name, level);
        setType(Type.WATER, Type.FAIRY);
        baseHealthPoints = 70;
        baseAttack = 20;
        baseDefence = 50;
        baseSpecialAttack = 20;
        baseSpecialDefence = 50;
        baseSpeed = 40;
        setStats(baseHealthPoints, baseAttack, baseDefence, baseSpecialAttack, baseSpecialDefence, baseSpeed);
        setMove(new WorkUp(), new Confide(), new AquaJet());

    }
}