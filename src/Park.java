
public class Park {
    public String name;
    public Attraction[] attractions;

    public Park(String name, int capacity) {
        this.name = name;
        this.attractions = new Attraction[capacity];
    }

    public void addAttraction(int index, String name, String hours, double price) {
        if (index >= 0 && index < attractions.length) {
            attractions[index] = new Attraction(name, hours, price);
        } else {
            System.out.println("Некорректный индекс: " + index);
        }
    }

    public void displayAttractions() {
        System.out.println("Аттракционы в " + name + ":");
        for (Attraction attraction : attractions) {
            if (attraction != null) {
                attraction.displayInfo();
            }
        }
    }

    public class Attraction {
        public String name;
        public String hours;
        public double price;

        public Attraction(String name, String hours, double price) {
            this.name = name;
            this.hours = hours;
            this.price = price;
        }

        public void displayInfo() {
            System.out.println("Название: " + name);
            System.out.println("Часы работы: " + hours);
            System.out.println("Цена: " + price);
            System.out.println();
        }
    }
}


