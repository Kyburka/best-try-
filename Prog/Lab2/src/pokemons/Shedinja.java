package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.status.*;
import moves.physical.*;

public class Shedinja extends Pokemon {
    private int baseHealthPoints;
    private int baseAttack;
    private int baseDefence;
    private int baseSpecialAttack;
    private int baseSpecialDefence;
    private int baseSpeed;

    public Shedinja(String name, int level) {
        super(name, level);
        setType(Type.GHOST, Type.BUG);
        baseHealthPoints = 1;
        baseAttack = 90;
        baseDefence = 45;
        baseSpecialAttack = 30;
        baseSpecialDefence = 30;
        baseSpeed = 40;
        setStats(baseHealthPoints, baseAttack, baseDefence, baseSpecialAttack, baseSpecialDefence, baseSpeed);
        setMove(new AerialAce(), new Facade(), new Harden(), new ConfuseRay());

    }
}