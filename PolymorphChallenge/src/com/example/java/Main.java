package com.example.java;

class Car {
    //    variables
    private String name;

    private Boolean engine;

    private int wheels;

    private int cylanders;

    //    inlne setup for constructor connector
    public Car(Boolean engine, int wheels, int cylanders, String name) {

        this.engine = engine;
        this.wheels = wheels;
        this.cylanders = cylanders;
        this.name = name;
    }
// getter and setters


    public Boolean getEngine() {
        return engine;
    }

    public void setEngine(Boolean engine) {
        this.engine = engine;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getCylanders() {
        return cylanders;
    }

    public void setCylanders(int cylanders) {
        this.cylanders = cylanders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //    I like to move it!
    public String Move() {
        if (engine == false) {
            return " this is car is a " + getName() + ". It doesn't need no " + getEngine();
        } else {
            return " your car is done did! ";
        }
    }
}
//        I hate one file
//  Starting cars


class Porsche extends Car{
    public Porsche(){super(true,4,16, "Porsche");}
    @Override
    public String Move(){
        return "Dang thats a fast " + getName() +" with "+ getCylanders()+" amount of cylanders and "+ getWheels()+" amount of wheels";
    }

}
class Jugar extends Car {
    public Jugar() {
        super(true, 4, 18, "Jugar");
    }

    @Override
    public String Move() {
        return "Dang thats a fast " + getName() + " with " + getCylanders() + " amount of cylanders and " + getWheels() + " amount of wheels";
    }
}
 class Tesla extends Car{
     public Tesla(){super(false,4,0, "Tesla");}
//     no move()
}














public class Main {

    public static void main(String[] args) {
        // write your code here
        for (int i = 1; i < 11; i++) {
            Car car=randomCar();
            System.out.println("Car Type #"+ i+ " : "+car.getName()+"\n" + "Locomotion "+car.Move()+"\n" );
        }
    }

    public static Car randomCar(){
        int randomNumber = (int) (Math.random()*3)+1;
        System.out.println("random number generator was: " + randomNumber);
        switch (randomNumber){
            case 1:
                return new Porsche();

            case 2:
                return new Jugar();

            case 3:
                return new Tesla();
        }

        return null;
    }
}
