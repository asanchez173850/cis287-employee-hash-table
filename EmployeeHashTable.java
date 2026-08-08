public class EmployeeHashTable {

    private LinkedList3<Employee>[] table;

    public EmployeeHashTable(int tableSize) {
        table = new LinkedList3[tableSize];

        for (int i = 0; i < table.length; i++) {
            table[i] = new LinkedList3<Employee>();
        }
    }

    private int hash(String name) {
        int hashValue = 0;

        for (int i = 0; i < name.length(); i++) {
            hashValue = (hashValue * 31 + name.charAt(i)) % table.length;
        }

        return hashValue;
    }

    public void add(Employee employee) {
        int bucket = hash(employee.getName());

        table[bucket].add(employee);

        System.out.println(
                employee.getName() + " added to bucket " + bucket
        );
    }

    public Employee get(String name) {
        int bucket = hash(name);

        LinkedList3<Employee> list = table[bucket];

        for (int i = 0; i < list.size(); i++) {
            Employee employee = list.get(i);

            if (employee.getName().equalsIgnoreCase(name)) {
                return employee;
            }
        }

        return null;
    }

    public int getBucket(String name) {
        return hash(name);
    }

    public void displayTable() {
        System.out.println("\nHASH TABLE CONTENTS");

        for (int i = 0; i < table.length; i++) {
            System.out.print("Bucket " + i + ": ");

            LinkedList3<Employee> list = table[i];

            if (list.isEmpty()) {
                System.out.println("empty");
            } else {
                for (int j = 0; j < list.size(); j++) {
                    System.out.print(list.get(j).getName());

                    if (j < list.size() - 1) {
                        System.out.print(" -> ");
                    }
                }

                System.out.println();
            }
        }
    }
}