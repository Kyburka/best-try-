package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.status.*;
import moves.physical.*;

public class Azurill extends Pokemon {
    private int baseHealthPoints;
    private int baseAttack;
    private int baseDefence;
    private int baseSpecialAttack;
    private int baseSpecialDefence;
    private int baseSpeed;

    public Azurill(String name, int level) {
        super(name, level);
        setType(Type.NORMAL, Type.FAIRY);
        baseHealthPoints = 50;
        baseAttack = 20;
        baseDefence = 40;
        baseSpecialAttack = 20;
        baseSpecialDefence = 40;
        baseSpeed = 20;
        setStats(baseHealthPoints, baseAttack, baseDefence, baseSpecialAttack, baseSpecialDefence, baseSpeed);
        setMove(new WorkUp(), new Confide());

    }
}