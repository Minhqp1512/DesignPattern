package StructuralPattern.FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class SoldierFactoty {
    private static final Map<String, ISoldier> soldiers = new HashMap<>();

    private SoldierFactoty() {
        throw new IllegalStateException();
    }

    public static synchronized ISoldier createSoldier(String name) {
        ISoldier soldier = soldiers.get(name);
        if (soldier == null) {
            waitingForCreateASoldier();
            soldier = new Soldier(name);
            soldiers.put(name, soldier);
        }
        return soldier;
    }

    public static synchronized int getTotalOfSoldiers() {
        return soldiers.size();
    }

    private static void waitingForCreateASoldier() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
