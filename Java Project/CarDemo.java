public class CarDemo {
    
    public enum Color{
        RED, ORANGE, YELLOW, GREEN, INDIGO, BLUE
    }
    public enum Model{
        SEDAN, SUV, CONVERTIBLE, HATCHBACK
    }
    public static class Car{
        private int year;
        private Model model;
        private Color color;

        public Car(int yr, Model m, Color c){
            this.year = yr;
            this.model = m;
            this.color = c;
        }
        public void display() {
            System.out.println("Car year: " + year);
            System.out.println("Car model: " + model);
            System.out.println("Car color: " + color);
        }
    }

    public static void main(String[] args){
        Car car1 = new Car(2014, Model.SUV, Color.RED);
        Car car2 = new Car(2020, Model.SEDAN, Color.ORANGE);

        car1.display();
        car2.display();
    }
}
