package Budowniczy;

public class TestTreeBuilderPattern {
    public static void main(String[] args) {

        Tree tree = Tree.treeBuilder()
                .name("Brzoza")
                .type("Liściaste")
                .perimeter(30)
                .branchQuantity(20)
                .create();

        System.out.println(tree);
    }
}
