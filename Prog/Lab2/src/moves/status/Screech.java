package moves.status;

import ru.ifmo.se.pokemon.*;

public class Screech extends StatusMove {
    public Screech() {
        super(Type.NORMAL, 0.0, 85.0);
    }

    @Override
    protected void applyOppEffects(Pokemon enemy) {
        enemy.setMod(Stat.DEFENSE, -2);
    }

    @Override
    protected String describe() {
        return "Использует статус-действие Screech";
    }
}
