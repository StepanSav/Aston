
public class Main {
    public static void main(String[] args) {
        DOG dog1 = new DOG();
        CAT cat1 = new CAT();
        dog1.run(150);
        dog1.swim(5);
        cat1.run(100);
        cat1.swim(10);
        CAT[] cats = new CAT[3];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new CAT();
            cats[i].setFoodBowl(10);
            cats[i].eat(5);
            System.out.println("Кот " + (i + 1) + " сытый: " + cats[i].isFull());
        }
        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего собак: " + DOG.getDogCount());
        System.out.println("Всего котов: " + CAT.getCatCount());
    }
}