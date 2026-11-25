package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.physical.*;
import moves.status.*;

public class Nincada extends Pokemon {
    private int baseHealthPoints;
    private int baseAttack;
    private int baseDefence;
    private int baseSpecialAttack;
    private int baseSpecialDefence;
    private int baseSpeed;

    public Nincada(String name, int level) {
        super(name, level);
        setType(Type.BUG, Type.GROUND);
        baseHealthPoints = 31;
        baseAttack = 45;
        baseDefence = 90;
        baseSpecialAttack = 30;
        baseSpecialDefence = 30;
        baseSpeed = 40;
        setStats(baseHealthPoints, baseAttack, baseDefence, baseSpecialAttack, baseSpecialDefence, baseSpeed);
        setMove(new AerialAce(), new Facade(), new Harden());

    }
}