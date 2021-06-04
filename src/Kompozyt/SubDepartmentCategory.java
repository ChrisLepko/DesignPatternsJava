package Kompozyt;

public abstract class SubDepartmentCategory {
    private String positionName;
    private String hierarchy;

    public SubDepartmentCategory(String positionName, String hierarchy) {
        this.positionName = positionName;
        this.hierarchy = hierarchy;
    }

    public String getPositionName() {
        return positionName;
    }

    public String getHierarchy() {
        return hierarchy;
    }

    public void add(SubDepartmentCategory subDepartmentCategory){
        throw new UnsupportedOperationException();
    }

    public abstract void displayHierarchy();
}


