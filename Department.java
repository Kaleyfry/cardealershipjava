package cardealership;

import java.time.LocalDateTime;
import java.util.List;

public abstract class Department {
    private String deptName;
    private int numEmployees;

    public Department() {
        this.deptName = "Generic";
        this.numEmployees = 0;
    }

    public Department(String name, int numEmployees) {
        this.deptName = name;
        this.numEmployees = numEmployees;
    }

    public static void printIsOpen(List<Department> depts, LocalDateTime today) {
        // cycle through each department in provided List
        for (Department d : depts) {
            // print out name of dept and return if the Dept is open today
            System.out.println(d.toString() + " is open today? " + d.isOpenToday(today));
        }
    }

    public abstract boolean isOpenToday(LocalDateTime day);

    @Override
    public String toString() {
        return this.deptName + " Department";
    }
}