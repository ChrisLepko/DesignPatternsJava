package Kompozyt;

import java.util.ArrayList;
import java.util.List;

public class Department extends SubDepartment {

    List<SubDepartmentCategory> subDepartmentCategories = new ArrayList<>();

    public Department(String positionName, String hierarchy) {
        super(positionName, hierarchy);
    }

    @Override
    public void displayHierarchy() {
        System.out.println("\n" + getPositionName() + " : " + getHierarchy() + "\n");
        this.subDepartmentCategories.forEach(SubDepartmentCategory::displayHierarchy);
    }

    @Override
    public void add(SubDepartmentCategory subDepartmentCategory) {
       this.subDepartmentCategories.add(subDepartmentCategory);
    }
}
