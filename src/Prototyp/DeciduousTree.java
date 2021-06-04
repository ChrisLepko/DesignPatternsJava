package Prototyp;

public class DeciduousTree extends Tree {

    public DeciduousTree(String type, String name, String trunk, int branchQuantity, String leaves, int age, double perimeter) {
        super(type, name, trunk, branchQuantity, leaves, age, perimeter);
    }

    @Override
    public Tree copy() {
        DeciduousTree deciduousTree = new DeciduousTree(this.getType(), this.getName(), this.getTrunk(), this.getBranchQuantity(), this.getLeaves(), this.getAge(), this.getPerimeter());
        return  deciduousTree;
    }

    @Override
    public void fell() {
        System.out.println("Deciduous tree has felled");
    }

    @Override
    public void grow(int age, double perimeter) {
        setAge(getAge() + age);
        setPerimeter(getPerimeter() + perimeter);

        System.out.println("Deciduous tree has grown by " + age + " years and " + perimeter + "cm in perimeter");
    }
}
