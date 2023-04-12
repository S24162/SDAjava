package pl.sdacademy.java.advanced.F_Interfaces;

class AppInterfaces {
    public static void main(String[] args) {
        Human human = new Human();
        Bird bird = new Bird();
        human.makeSound();
        bird.makeSound();
        bird.eat("food");
    }


}
