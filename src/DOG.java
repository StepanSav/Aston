public class DOG extends Animal {
        private static int dogCount = 0;
        public DOG() {
            dogCount++;
        }
        public static int getDogCount() {
            return dogCount;
        }
        public void run(int distance) {
            if (distance <= 500) {
                System.out.println("Собака пробежала " + distance + " м.");
            } else {
                System.out.println("Собака не может пробежать больше 500 м.");
            }
        }
        public void swim(int distance) {
            if (distance <= 10) {
                System.out.println("Собака проплыла " + distance + " м.");
            } else {
                System.out.println("Собака не может проплыть больше 10 м.");
            }
        }
    }

