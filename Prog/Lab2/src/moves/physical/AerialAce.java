package moves.physical;

import ru.ifmo.se.pokemon.*;

public class AerialAce extends PhysicalMove {
    public AerialAce() {
        super(Type.FLYING,60.0,100.0);
    }
    @Override
    protected String describe() {
        return "Использует физическую атаку Aerial Ace";
    }
}
