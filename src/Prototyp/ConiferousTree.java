package Prototyp;

public class ConiferousTree extends Tree {

    public ConiferousTree(String type, String name, String trunk, int branchQuantity, String leaves, int age, double perimeter) {
        super(type, name, trunk, branchQuantity, leaves, age, perimeter);
    }

    @Override
    public Tree copy() {
        ConiferousTree coniferousTree = new ConiferousTree(this.getType(), this.getName(), this.getTrunk(), this.getBranchQuantity(), this.getLeaves(), this.getAge(), this.getPerimeter());
        return  coniferousTree;
    }

    @Override
    public void fell() {
        System.out.println("Coniferous tree has felled");
    }

    @Override
    public void grow(int age, double perimeter) {
        setAge(getAge() + age);
        setPerimeter(getPerimeter() + perimeter);

        System.out.println("Coniferous tree has grown by " + age + " years and " + perimeter + "cm in perimeter");
    }
}
