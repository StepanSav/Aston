
public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", 89556667711L, 30000, 30);
        employees[1] = new Employee("Petrov Petr", "Manager", "petrov@mailbox.com", 89556667722L, 40000, 35);
        employees[2] = new Employee("Sidorov Sidor", "Developer", "sidorov@mailbox.com", 89556667733L, 50000, 28);
        employees[3] = new Employee("Smirnov Smirn", "Designer", "smirnov@mailbox.com", 89556667744L, 60000, 32);
        employees[4] = new Employee("Kuznetsov Kuzya", "Analyst", "kuznetsov@mailbox.com", 89556667755L, 70000, 40);

        for (Employee employee : employees) {
            employee.displayInfo();
        }
        Park amusementPark = new Park("Развлекательный Парк", 3);
        amusementPark.addAttraction(0, "Американские горки", "10:00 - 22:00", 100);
        amusementPark.addAttraction(1, "Колесо обозрения", "10:00 - 22:00", 200);
        amusementPark.addAttraction(2, "Поездка на лодке", "10:00 - 20:00", 300);
        amusementPark.displayAttractions();
    }
}