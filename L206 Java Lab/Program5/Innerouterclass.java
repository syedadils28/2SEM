/*5. Write a Java program to implement Inner class and demonstrate its Access
protection */

class Outer {
    private int outdata = 10;

    void display() {
        Inner in = new Inner();
        System.out.println("Accessing from outer class");
        System.out.println("The value of outdata is " + outdata);
        System.out.println("The value of indata is " + in.indata);
        System.out.println(" ");
    }

    class Inner {
        private int indata = 20;

        void inmethod() {
            System.out.println("Accessing from inner class");
            System.out.println("The sum of indata & outdata is " + (outdata + indata));
        }
    }
}

public class Innerouterclass {
    public static void main(String args[]) {
        Outer out = new Outer();
        out.display();
        Outer.Inner in = out.new Inner();
        in.inmethod();
    }
}