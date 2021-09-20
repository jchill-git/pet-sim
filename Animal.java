abstract class Animal {
    //variables
    String type;
    protected int legs;
    
    //constructor
    protected Animal(String type, int legs){
        this.type=type;
        this.legs=legs;
    }
    
    abstract void eat();
    
    void walk() {
    System.out.println("A "+type+" walks on "+legs+" legs.");
    }
    
    public static void main(String[] args) {
        Spider spider1 = new Spider("jumping spider");
        spider1.walk();
        spider1.eat();
        
        Cat cat1 = new Cat("tabby");
        cat1.walk();
        cat1.eat();
        cat1.feed();
        cat1.adopt("Samantha");
        cat1.feed();
    }

}

class Spider extends Animal{
    
    //constructor
    Spider(String type ){
        super(type,8);
    }
    
    void eat() {
        System.out.println("A "+type+" primarily eats insects.");
    }
}

interface Pet{
    void adopt(String name);
    void feed();
}

class Cat extends Animal implements Pet{
    String name;
    Boolean adopted;
    
    //constructor
    Cat(String type){
        super(type,4);
        adopted=false;
        
    }
    
    void eat() {
        System.out.println("A domestic "+type+" primarily eats pet food, but a wild "+type+" eats small birds and rodents.");
    }
    
    public void adopt(String name){
        this.name=name;
        adopted=true;
        System.out.println("You've adopted a "+type+" named "+name);
    }
    
    public void feed() {
        if(adopted==false) {
            System.out.println("You can't feed a cat you don't own.");
        }
        else {
            System.out.println("You fed "+name+" some kibbles.");
        }
    }
}