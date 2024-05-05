import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Asia", 1234, 1);
        Worker worker2 = new Worker("Kasia", 3241, 2);
        Worker worker3 = new Worker("Basia", 4231, 3);
        Worker worker4 = new Worker("Tosia", 3412, 4);

        Manager manager = new Manager("Tomek", 6543, 5);

        System.out.println("Pracownik 1 zarobki: " + worker1.getSalary());
        worker1.work();
        System.out.println("Pracownik 2 zarobki: " + worker2.getSalary());
        worker2.work();
        System.out.println("Pracownik 3 zarobki: " + worker3.getSalary());
        worker3.work();
        System.out.println("Pracownik 4 zarobki: " + worker4.getSalary());
        worker4.work();

        System.out.println("Zarobki managera: " + manager.getSalary());
        manager.work();
    }
}