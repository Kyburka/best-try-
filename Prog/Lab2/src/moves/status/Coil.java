package moves.status;

import ru.ifmo.se.pokemon.*;

public class Coil extends StatusMove {
    public Coil() {
        super(Type.POISON, 0.0, 100.0);
    }

    @Override
    protected void applySelfEffects(Pokemon me) {
        me.setMod(Stat.ATTACK, 1);
        me.setMod(Stat.DEFENSE, 1);
        me.setMod(Stat.ACCURACY, 1);
    }

    @Override
    protected String describe() {
        return "Использует статус-действие Coil";
    }
}
