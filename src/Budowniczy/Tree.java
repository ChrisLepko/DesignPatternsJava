package Budowniczy;

public class Tree {
    private String type;
    private String name;
    private String trunk;
    private int branchQuantity;
    private String leaves;
    private int age;
    private double perimeter;

    private Tree(){

    }

    // prywatny konstruktor zrobiony aby uniemożliwić tworzenie obiektów w sposób inny niż poprzez buildera

    public static class TreeBuilder {
        private String type;
        private String name;
        private String trunk;
        private int branchQuantity;
        private String leaves;
        private int age = 1;
        private double perimeter;

        public TreeBuilder type(String type){
            this.type = type;
            return this;
        }

        public TreeBuilder name(String name) {
            this.name = name;
            return this;
        }

        public TreeBuilder trunk(String trunk){
            this.trunk = trunk;
            return this;
        }

        public TreeBuilder branchQuantity(int branchQuantity){
            this.branchQuantity = branchQuantity;
            return this;
        }

        public TreeBuilder leaves(String leaves){
            this.leaves = leaves;
            return this;
        }

        public TreeBuilder age(int age){
            this.age = age;
            return this;
        }

        public TreeBuilder perimeter(double perimeter){
            this.perimeter = perimeter;
            return this;
        }

        public Tree create(){
            if(type.isEmpty()){
                throw new IllegalStateException("Trzeba określić typ drzewa");
            }
            if(name.isEmpty()){
                throw new IllegalStateException("Trzeba określić nazwę drzewa");
            }

            Tree tree = new Tree();
            tree.type = this.type;
            tree.name = this.name;
            tree.trunk = this.trunk;
            tree.branchQuantity = this.branchQuantity;
            tree.leaves = this.leaves;
            tree.age = this.age;
            tree.perimeter = this.perimeter;

            return tree;
        }


    }

    public static TreeBuilder treeBuilder(){
        return new TreeBuilder();
    }

    @Override
    public String toString() {
        return "Tree{" +
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
