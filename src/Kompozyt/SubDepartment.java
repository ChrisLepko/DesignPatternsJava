package Kompozyt;

public class SubDepartment extends SubDepartmentCategory {

    public SubDepartment(String positionName, String hierarchy) {
        super(positionName, hierarchy);
    }

    @Override
    public void displayHierarchy() {
        System.out.println(getPositionName() + " : " + getHierarchy());
    }
}
