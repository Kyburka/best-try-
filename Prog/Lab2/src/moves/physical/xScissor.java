package moves.physical;

import ru.ifmo.se.pokemon.*;

public class xScissor extends PhysicalMove {
    public xScissor() {
        super(Type.BUG,80.0,90.0);
    }
    @Override
    protected String describe() {
        return "Использует физическую атаку X-Scissor";
    }
}
