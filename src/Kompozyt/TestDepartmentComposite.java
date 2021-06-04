package Kompozyt;

public class TestDepartmentComposite {
    public static void main(String[] args) {
        SubDepartmentCategory bankingDepartment = new Department("Bankowość", "Główny oddział");
        SubDepartmentCategory subFirst = new Department("Dział kredytowy", "Pododdział");

        SubDepartmentCategory subSecond = new Department("Dział zarządzania zasobami ludzkimi", "Pododdział");

        bankingDepartment.add(subFirst);
        bankingDepartment.add(subSecond);

        subFirst.add(new SubDepartment("Kredyty hipoteczne", "Jednostka pododziału"));
        subFirst.add(new SubDepartment("Kredyty inwestycyjne", "Jednostka pododziału"));
        subFirst.add(new SubDepartment("Kredyty dla osób prywatnych", "Jednostka pododziałuh"));


        subSecond.add(new SubDepartment("Dział rekrutacyjny", "Jednostka pododziału"));
        subSecond.add(new SubDepartment("Dział budżetowy", "Jednostka pododziału"));
        subSecond.add(new SubDepartment("Dział bezpieczeństwa", "Jednostka pododziału"));

        bankingDepartment.displayHierarchy();
    }
}
