package moves.status;

import ru.ifmo.se.pokemon.*;

public class Harden extends StatusMove {
    public Harden() {
        super(Type.NORMAL, 0.0, 100.0);
    }

    @Override
    protected void applySelfEffects(Pokemon me) {
        me.setMod(Stat.DEFENSE, 1);
    }

    @Override
    protected String describe() {
        return "Использует статус-действие Harden";
    }
}
