package Fabryka;

public class TreeFactory {

    public static Tree getTree(TreeType TYPE, String name, String trunk, String branch, String leaves, int age, double perimeter) throws TreeTypeException {

        switch (TYPE){
            case DECIDUOUS:
                return new DeciduousTree(TYPE, name, trunk, branch, leaves, age, perimeter);
            case CONIFEROUS:
                return new ConiferousTree(TYPE, name, trunk, branch, leaves, age, perimeter);
        }
        throw new TreeTypeException("Given tree type does not exist");
    }
}
