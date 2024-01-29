import java.util.Scanner;

class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void updateSalary(double percentageIncrease) {
        if (percentageIncrease > 0) {
            double increaseAmount = (percentageIncrease / 100) * salary;
            salary += increaseAmount;
            System.out.println("Salary updated successfully.");
        } else {
            System.out.println("Invalid percentage increase. Salary not updated.");
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Job Title: " + jobTitle + ", Salary: $" + salary;
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee job title: ");
        String jobTitle = scanner.nextLine();

        System.out.print("Enter employee salary: $");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(name, jobTitle, salary);

        while (true) {
            System.out.println("\nEmployee Information:");
            System.out.println(employee);

            System.out.println("\nChoose an option:");
            System.out.println("1. Calculate salary increase");
            System.out.println("2. Update salary");
            System.out.println("3. Quit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter percentage increase: ");
                    double percentageIncrease = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline
                    double newSalary = employee.getSalary() + (percentageIncrease / 100) * employee.getSalary();
                    System.out.println("New salary after increase: $" + newSalary);
                    break;
                case 2:
                    System.out.print("Enter percentage increase: ");
                    percentageIncrease = scanner.nextDouble();
                    scanner.nextLine();
                    employee.updateSalary(percentageIncrease);
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
