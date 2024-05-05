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

        Manager manager = new Manager("Tomek", 6543, 5, "12.6.2012", "szeryf");

        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee employee : employees) {
            System.out.println("- " + employee.getName() + " has code: " + employee.hashCode());
        }

        Worker duplicateIDWorker = new Worker("Duplikat", 5364, 2, "2023-02-11", "super x2 programista");
        System.out.println(worker4.getName() + " rowny worker2: " + worker4.equals(worker2));
        System.out.println(worker4.getName() + " rowny manager: " + worker4.equals(manager));
        System.out.println(worker4.getName() + " rowny duplicateIDWorker: " + worker4.equals(duplicateIDWorker));
    }
}