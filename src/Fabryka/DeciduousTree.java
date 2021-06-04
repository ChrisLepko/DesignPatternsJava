package Fabryka;

public class DeciduousTree extends Tree {

    public DeciduousTree(TreeType type, String name, String trunk, String branch, String leaves, int age, double perimeter) {
        super(type, name, trunk, branch, leaves, age, perimeter);
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
