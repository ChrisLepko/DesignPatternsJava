package Fabryka;

public abstract class Tree {

    private TreeType type;
    private String name;
    private String trunk;
    private String branch;
    private String leaves;
    private int age;
    private double perimeter;

    public abstract void fell();
    public abstract void grow(int age, double perimeter);

    public Tree(TreeType type, String name, String trunk, String branch, String leaves, int age, double perimeter) {
        this.type = type;
        this.name = name;
        this.trunk = trunk;
        this.branch = branch;
        this.leaves = leaves;
        this.age = age;
        this.perimeter = perimeter;
    }

    public TreeType getType() {
        return type;
    }

    public void setType(TreeType type) {
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

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
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
                ", branch='" + branch + '\'' +
                ", leaves='" + leaves + '\'' +
                ", age=" + age +
                ", perimeter=" + perimeter +
                '}';
    }
}
