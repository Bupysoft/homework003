public class Main {
    public static void main(String[] args) {

        Car car=new Car();
        car.brand="Toyota";
        car.model="Auris";
        car.year=1990;
        System.out.println("2.");
        System.out.println("Brand: "+ car.brand);
        System.out.println("Model: "+ car.model);
        System.out.println("Year: "+ car.year);
        car.startEngine();
        car.stopEngine();
        Calculator calc= new Calculator();
        int num1=2;
        int num2=6;
        int addition = calc.addition(num1, num2);
        System.out.println();
        System.out.println("3.");
        System.out.println("Addition: " + num1 +" + "+num2 +" = "+addition);
        double num3=6.7;
        double num4=8.13;
        boolean isGreater= calc.isGreater(num3,num4);
        System.out.println(num3 + " is Greater than "+num4 +" = "+isGreater);
        System.out.println();
        System.out.println("4.");
        NumberManipulator manipulator = new NumberManipulator();
        int number=8;
        System.out.println("Initial number: "+number);
        int incrementedNumber=manipulator.incrementByOne(number);
        System.out.println("Number after increment: " + incrementedNumber);
        int decrementedNumber=manipulator.decrementByOne(number);
        System.out.println("Number after decrement: " + decrementedNumber);

    }
}
