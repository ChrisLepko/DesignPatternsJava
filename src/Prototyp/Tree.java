package Prototyp;

public abstract class Tree {

    private String type;
    private String name;
    private String trunk;
    private int branchQuantity;
    private String leaves;
    private int age;
    private double perimeter;

    public abstract void fell();
    public abstract void grow(int age, double perimeter);
    public abstract Tree copy();

    public Tree(String type, String name, String trunk, int branchQuantity, String leaves, int age, double perimeter) {
        this.type = type;
        this.name = name;
        this.trunk = trunk;
        this.branchQuantity = branchQuantity;
        this.leaves = leaves;
        this.age = age;
        this.perimeter = perimeter;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrunk() {
        return trunk;
    }

    public void setTrunk(String trunk) {
        this.trunk = trunk;
    }

    public Integer getBranchQuantity() {
        return branchQuantity;
    }

    public void setBranchQuantity(int branchQuantity) {
        this.branchQuantity = branchQuantity;
    }

    public String getLeaves() {
        return leaves;
    }

    public void setLeaves(String leaves) {
        this.leaves = leaves;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public String toString() {
        return "model.Tree{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", trunk='" + trunk + '\'' +
                ", branchQuantity='" + branchQuantity + '\'' +
                ", leaves='" + leaves + '\'' +
                ", age=" + age +
                ", perimeter=" + perimeter +
                '}';
    }
}
