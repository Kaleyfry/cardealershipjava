package cardealership;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class ServiceDepartment extends Department {
    // Constructor with deptName and numEmployees given

    @Override
    public boolean isOpenToday(LocalDateTime day) {
        if (day.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
            return false;
        } else {
            return true;
        }
    }

    public ServiceDepartment() {
        super("Service", 20);
    }

    // Create "association" between Vehicle and ServiceDepartment
    // Very loose, lifetime of objects are independent of one another
    public boolean changeEngineOil(Vehicle v) {
        // Because ServiceDepartment doesn't "own" the lifetime of the object it's good
        // practice to ensure a valid object has been passed in

        if (v != null) {
            return true;
        } else {
            return false;
        }

    }
}