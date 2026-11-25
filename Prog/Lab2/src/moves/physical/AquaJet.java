package moves.physical;

import ru.ifmo.se.pokemon.*;

public class AquaJet extends PhysicalMove {
    public AquaJet() {
        super(Type.WATER,40.0,90.0, 1, 1); // одна из единичек (вторая) - кол-во хитов, чек конструктор родителя.
    }
    @Override
    protected String describe() {
        return "Использует физическую атаку Aqua Jet";
    }
}
