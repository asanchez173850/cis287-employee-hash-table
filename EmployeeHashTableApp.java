public class EmployeeHashTableApp {

    public static void main(String[] args) {

        EmployeeHashTable table = new EmployeeHashTable(10);

        Employee employee1 =
                new Employee("Alex", 101, 50000);

        Employee employee2 =
                new Employee("Emma", 102, 55000);

        Employee employee3 =
                new Employee("Maria", 103, 60000);

        Employee employee4 =
                new Employee("David", 104, 62000);

        Employee employee5 =
                new Employee("Sophia", 105, 58000);

        Employee employee6 =
                new Employee("Liam", 106, 65000);


        System.out.println("ADDING EMPLOYEES");
        System.out.println("----------------");

        table.add(employee1);
        table.add(employee2);
        table.add(employee3);
        table.add(employee4);
        table.add(employee5);
        table.add(employee6);


        System.out.println("\nCOLLISION TEST");
        System.out.println("--------------");

        int alexBucket = table.getBucket("Alex");
        int emmaBucket = table.getBucket("Emma");

        System.out.println(
                "Alex hashes to bucket " + alexBucket
        );

        System.out.println(
                "Emma hashes to bucket " + emmaBucket
        );

        if (alexBucket == emmaBucket) {
            System.out.println(
                    "Collision confirmed: Alex and Emma are stored "
                    + "in the same bucket."
            );
        }


        table.displayTable();


        System.out.println("\nRETRIEVING EMPLOYEES");
        System.out.println("--------------------");

        printEmployee(table.get("Alex"));
        printEmployee(table.get("Emma"));
        printEmployee(table.get("Maria"));


        System.out.println("\nSEARCHING FOR MISSING EMPLOYEE");
        System.out.println("------------------------------");

        Employee missing = table.get("Robert");

        if (missing == null) {
            System.out.println("Robert was not found.");
        } else {
            System.out.println(missing);
        }
    }


    private static void printEmployee(Employee employee) {

        if (employee == null) {
            System.out.println("Employee not found.");
        } else {
            System.out.println(employee);
        }
    }
}