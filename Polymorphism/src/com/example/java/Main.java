package com.example.java;

class Movie{
    private String name;

    public Movie(String name){
        this.name =name;
    }

    public String plot(){
        return "No plot Mate";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    @Override
    public String plot(){
        return "A Shark Eats people";
    }
}

class IndependanceDay extends Movie{
    public IndependanceDay(){
        super("Indepedance Day");
    }

    @Override
    public String plot() {
        return "Aliens kill people";
    }
}

class MazeRunner extends Movie{
    public MazeRunner(){
        super("Maze be runners");
    }

    @Override
    public String plot() {
        return "People running in mazes";
    }
}

class StarWars extends Movie{
    public StarWars(){
        super("Star Wars!");
    }

    @Override
    public String plot() {
        return "A bunch of wars amongst stars!";
    }
}

class Forgetable extends Movie{
    public Forgetable(){
        super("Forgetable");
    }

//    no plot method
}



public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int i = 1; i < 11; i++) {
            Movie movie=randomMovie();
            System.out.println("Movie #"+ i+ " : "+movie.getName()+"\n" + "Plot: "+movie.plot()+"\n" );
        }
    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random()*5)+1;
        System.out.println("random number generator was: " + randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();

            case 2:
                return new IndependanceDay();

            case 3:
                return new MazeRunner();

            case 4:
                return new StarWars();

            case 5:
                return new Forgetable();
        }

        return null;
    }
}
