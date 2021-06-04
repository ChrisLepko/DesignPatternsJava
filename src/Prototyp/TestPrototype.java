package Prototyp;

public class TestPrototype {
    public static void main(String[] args) {
        ConiferousTree coniferousTree = new ConiferousTree("coniferous", "pine", "test", 40, "test", 40, 70);
        ConiferousTree coniferousTreeCopy = (ConiferousTree) coniferousTree.copy();

        DeciduousTree deciduousTree = new DeciduousTree("deciduous", "birch", "test", 50, "test", 80, 140);
        DeciduousTree deciduousTreeCopy = (DeciduousTree) deciduousTree.copy();

        System.out.println("Oryginał Drzewa iglastego: " + coniferousTree);
        System.out.println("Kopia Drzewa iglastego: " + coniferousTreeCopy);

        System.out.println();

        System.out.println("Oryginał Drzewa liściastego: " + deciduousTree);
        System.out.println("Kopia Drzewa liściastego: " + deciduousTreeCopy);
    }
}
