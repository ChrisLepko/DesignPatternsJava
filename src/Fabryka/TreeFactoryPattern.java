package Fabryka;

public class TreeFactoryPattern {
    public static void main(String[] args) throws TreeTypeException {
        Tree deciduousTree = TreeFactory.getTree(TreeType.DECIDUOUS, "birch", "test", "test", "test", 80, 140);
        Tree coniferousTree = TreeFactory.getTree(TreeType.CONIFEROUS, "pine", "test", "test", "test", 40, 70);

        deciduousTree.grow(10, 20.25);
        coniferousTree.grow(5, 7.87);

        System.out.println(deciduousTree);
        System.out.println(coniferousTree);

        deciduousTree.fell();
        coniferousTree.fell();


        System.out.println(deciduousTree.getType());
        System.out.println(coniferousTree.getType());
    }
}
