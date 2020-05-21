package cardealership;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Dealership {
    public static void main(String[] args) {

        LightTruck lt = new LightTruck("21232323KD232", 48000.00, 6200.00, 2019, "Toyota", "Tacoma", "Blue", 100000L,
                90000L, true, VehicleClassification.NEW);

        if (lt.getIs4wd()) {
            int gears = lt.xferCase.getNumGears();
            System.out.println("Number of Gears: " + gears);
        }

        // Leaseable lease = new Car("86397468364FD", 330000.00, 42000.00, 2019,
        // "Chevrolet", "Impala", "White",
        // VehicleClassification.NEW);

        // System.out.println("Number of months to lease: " + lease.getLeaseTerm());

        // // Instanciate new object for each Department
        // ServiceDepartment sd = new ServiceDepartment();
        // FinanceDepartment fd = new FinanceDepartment();
        // SalesDepartment sales = new SalesDepartment();

        // Add our departments to a List
        // List<Department> depts = new ArrayList<>();
        // depts.add(sd);
        // depts.add(fd);
        // depts.add(sales);

        // Department.printIsOpen(depts, LocalDateTime.now());
    }
}