public class Employee {

    public String name;
    public String position;
    public String email;
    public long phoneNumber;
    public int salary;
    public int age;

    public Employee(String name,String position,String email,long phoneNumber,int salary,int age){

        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
        public void displayInfo() {

            System.out.println("ФИО: " + name );
            System.out.println("Должность: " + position );
            System.out.println("email: " + email );
            System.out.println("Номер телефона: " + phoneNumber);
            System.out.println("Зарплата: " + salary );
            System.out.println("Возраст: " + age);

        }
}


