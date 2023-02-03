package OOP_6;

import java.util.ArrayList;

public class Crossbowman extends BaseShooter {
    public Crossbowman(ArrayList<BaseUnit> gang, String name, int x, int y) {
        super("crossbowman", name, 6, 3, new int[]{2, 3}, 10, 4, 16);
        super.gang = gang;
        super.position = new Vector2(x, y);
    }
}