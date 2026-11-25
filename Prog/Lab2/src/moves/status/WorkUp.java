package moves.status;

import ru.ifmo.se.pokemon.*;

public class WorkUp extends StatusMove {
    public WorkUp() {
        super(Type.NORMAL, 0.0, 100.0);
    }

    @Override
    protected void applySelfEffects(Pokemon me) {
        me.setMod(Stat.ATTACK, 1);
    }

    @Override
    protected String describe() {
        return "Использует статус-действие Work Up";
    }
}
