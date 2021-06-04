package Fabryka;

public class ConiferousTree extends Tree {

    public ConiferousTree(TreeType type, String name, String trunk, String branch, String leaves, int age, double perimeter) {
        super(type, name, trunk, branch, leaves, age, perimeter);
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
