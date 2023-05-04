package jawad;

public abstract class Car {
   public abstract void start();
   public abstract void stop();
}

public class Sedan extends Car {
   public void start() {
      System.out.println("Sedan started.");
   }
   public void stop() {
      System.out.println("Sedan stopped.");
   }
}

public class Main {
   public static void main(String[] args) {
      Car myCar = new Sedan();
      myCar.start();
      myCar.stop();
   }
}
