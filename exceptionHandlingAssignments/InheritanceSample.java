package exceptionHandlingAssignments;

class Animal {
    public void eat(String str) {
        System.out.println("Eating for grass");
    }
}

class Goat extends Animal {
    public void eat(String str) {
        System.out.println("blank");
    }
}

class Another extends Goat{
  public void eat(String str) {
        System.out.println("another");
  }
}

public class InheritanceSample {
    public static void main(String[] args) {
        Animal a = new Animal();
        Another t5 = (Another) new Goat();
    }
}