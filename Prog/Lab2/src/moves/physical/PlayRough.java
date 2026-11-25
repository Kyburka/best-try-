package moves.physical;

import ru.ifmo.se.pokemon.*;

public class PlayRough extends PhysicalMove {
    public PlayRough() {
        super(Type.NORMAL,90.0,90.0);
    }
    @Override
    protected void applyOppEffects(Pokemon enemy) {
        if (Math.random() <= 0.1) {
            Effect.flinch(enemy);
        }
    }
    @Override
    protected String describe() {
        return "Использует физическую атаку Play Rough";
    }
}
