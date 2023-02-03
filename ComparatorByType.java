package OOP_6;

import java.util.Comparator;

public class ComparatorByType implements Comparator<BaseUnit> {
    @Override
    public int compare(BaseUnit unit1, BaseUnit unit2) {
        if (unit1 instanceof BaseMagic) {
            return -1;
        } else if (unit2 instanceof BaseMagic) {
            return 1;
        } else if (unit1.getType().equals("farmer")) {
            return 1;
        } else if (unit2.getType().equals("farmer")) {
            return -1;
        } else {
            return unit1.getType().compareTo(unit2.getType());
        }

    }
}