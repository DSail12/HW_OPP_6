package OOP_6;

import java.util.ArrayList;

public class Wizard extends BaseMagic {
    Wizard(ArrayList<BaseUnit> gang, String name, int x, int y) {
        super("wizard", name, 17, 12, new int[]{-5, -5}, 30, 9, 1);
        super.gang = gang;
        super.position = new Vector2(x, y);
    }
}