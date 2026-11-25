package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.status.*;
import moves.physical.*;
import moves.special.*;

public class Seviper extends Pokemon {
    private int baseHealthPoints;
    private int baseAttack;
    private int baseDefence;
    private int baseSpecialAttack;
    private int baseSpecialDefence;
    private int baseSpeed;

    public Seviper(String name, int level) {
        super(name, level);
        setType(Type.POISON);
        baseHealthPoints = 73;
        baseAttack = 100;
        baseDefence = 60;
        baseSpecialAttack = 100;
        baseSpecialDefence = 60;
        baseSpeed = 65;
        setStats(baseHealthPoints, baseAttack, baseDefence, baseSpecialAttack, baseSpecialDefence, baseSpeed);
        setMove(new Screech(), new Coil(), new SludgeBomb(), new xScissor());

    }
}
