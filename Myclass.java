public class MyClass {
    static int count = 0;
    final double pi = 3.1415;

    MyClass() {
        count++;
    }

    public void display() {
        System.out.println("Value of the count is " + count);
        System.out.println("Value of the pi is " + pi + '\n');
    }

    public static void main(String[] args) {
        MyClass object1 = new MyClass();
        object1.display();

        MyClass object2 = new MyClass();
        object2.display();

        MyClass object3 = new MyClass();
        object3.display();
    }
}
