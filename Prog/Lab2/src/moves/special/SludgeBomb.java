package moves.special;

import ru.ifmo.se.pokemon.*;

public class SludgeBomb extends SpecialMove {
    public SludgeBomb() {
        super(Type.POISON, 90.0, 100.0);
    }
    @Override
    protected void applyOppEffects(Pokemon enemy) {
        if (Math.random() <= 0.3) {
            Effect.poison(enemy);
        }
    }
    @Override
    protected String describe() {
        return "Использует специальную атаку Sludge Bomb";
    }
}
