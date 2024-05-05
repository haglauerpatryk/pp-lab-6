import java.util.ArrayList;
import java.util.List;

import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Worker worker1 = new Worker("Asia", 1234, 1, "11.17.2021", "jeszcze nie programista");
        Worker worker2 = new Worker("Kasia", 3241, 2, "3.12.2000", "programista");
        Worker worker3 = new Worker("Basia", 4231, 3, "11.8.2012", "super programista");
        Worker worker4 = new Worker("Tosia", 3412, 4, "6.11.2012", "troche bardziej programista");
        Worker worker5 = new Worker("Zosia", 4321, 5, "12.6.2012", "programista");
        Worker worker6 = new Worker("Krysia", 5432, 6, "12.6.2012", "programista");

        Manager manager1 = new Manager("Tomek", 6543, 5, "12.6.2012", "szeryf");
        Manager manager2 = new Manager("Krzysiek", 7654, 6, "12.6.2012", "szeryf");
        Manager manager3 = new Manager("Kuba", 8765, 7, "12.6.2012", "szeryf");

        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(worker6);
        employees.add(manager1);
        employees.add(manager2);
        employees.add(manager3);

        double totalSalary = 0;
        double totalManagerSalary = 0;
        double totalWorkerSalary = 0;

        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
            if (employee instanceof Manager) {
                totalManagerSalary += employee.getSalary();
            } else if (employee instanceof Worker) {
                totalWorkerSalary += employee.getSalary();
            }
        }

        System.out.println("Totalne zarobki przez wszystkich zatrudnionych: " + totalSalary);
        System.out.println("Totalne zarobki przez wszystkich managerow: " + totalManagerSalary);
        System.out.println("Totalne zarobki przez wszystkich pracownikow: " + totalWorkerSalary);

        for (Employee employee : employees) {
            List<Employee> matchingEmployees = new ArrayList<>();
            for (Employee otherEmployee : employees) {
                if (employee.equals(otherEmployee)) {
                    matchingEmployees.add(otherEmployee);
                }
            }
            if (matchingEmployees.size() > 1) {
                System.out.println("Pracownicy z ID " + employee.getId() + ": ");
                for (Employee matchingEmployee : matchingEmployees) {
                    System.out.println("- " + matchingEmployee.getName() + " (Pozycja: " + matchingEmployee.getPosition() + ")");
                }
            }
        }
    }
}