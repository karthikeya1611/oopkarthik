import java.util.*;
interface games{
     void play();
}
class football implements games{
    public void play() {
        System.out.println("boys are Playing football!");
    }
}
class basketball implements games {
   public  void play() {
        System.out.println("boys are Playing basketball!");
        }
    }
    class volleyball implements games {
       public  void play() {
        System.out.println("boys are Playing volleyball!");
    }
}
public class Main2 {
    public static void main(String[] args) {
        games foot = new football();
        games basket = new basketball();
        games volley= new volleyball();
        foot.play();
        basket.play();
        volley.play();
    }
}