import java.util.Scanner;

class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee ID: " + id + ", Name: " + name;
    }
}

class EmployeeList {
    private Employee[] employees;
    private int count;

    public EmployeeList(int capacity) {
        employees = new Employee[capacity];
        count = 0;
    }

    public void addEmployee(String name, int id) {
        if (count < employees.length) {
            employees[count++] = new Employee(name, id);
            System.out.println("Employee added.");
        } else {
            System.out.println("List is full.");
        }
    }

    public void removeEmployee(int id) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (employees[i].getId() == id) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null;
                System.out.println("Employee removed.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee not found.");
        }
    }

    public void displayEmployees() {
        if (count == 0) {
            System.out.println("No employees to display.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println(employees[i]);
            }
        }
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeList employeeList = new EmployeeList(10);
        int choice;

        do {
            System.out.println("\nEnter your choice:");
            System.out.println("1. Add an employee");
            System.out.println("2. Remove an employee");
            System.out.println("3. Display employees");
            System.out.println("4. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter employee name: ");
                    String name = scanner.next();
                    System.out.print("Enter employee ID: ");
                    int id = scanner.nextInt();
                    employeeList.addEmployee(name, id);
                    break;

                case 2:
                    System.out.print("Enter employee ID to remove: ");
                    int removeId = scanner.nextInt();
                    employeeList.removeEmployee(removeId);
                    break;

                case 3:
                    employeeList.displayEmployees();
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}

