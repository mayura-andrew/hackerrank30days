package Car;

public class Car {
    
    int maxSpeed = 100;
    int minSpeed = 0;
    double weight = 345.454;
    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";
    
    
    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn) {
    	maxSpeed = customMaxSpeed;
    	weight = customWeight;
    	isTheCarOn = customIsTheCarOn;
    	
    }
  
    
    
    public void printVariable() {
        System.out.println("This is a Max Speed of the Car " + maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
    }
    
    public void updateMinSpeed() {
    	minSpeed = maxSpeed;
    	maxSpeed = maxSpeed +1;
    }
    
    
    public static void main(String[] args) {
       System.out.println("Birthday Car");
       Car birthdayPresent = new Car(500, 2000.33, true);
       birthdayPresent.printVariable();
       System.out.println("Christmess Car");
       Car ChristPresent = new Car(5500, 2000.33, false);
       ChristPresent.printVariable();
       
        
    }
    
    
    
    
}
