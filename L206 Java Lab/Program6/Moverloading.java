/*6. Write a Java program to demonstrate Constructor Overloading and
Method Overloading */

class Prog {
    // Constructor Overloading
    Prog() {
        System.out.println("Welcome to JAVA");
    }

    Prog(String name) {
        System.out.println("Welcome to JAVA " + name);
    }

    // Method Overloading
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

}

class Moverloading {
    public static void main(String args[]) {
        Prog obj1 = new Prog();
        Prog obj2 = new Prog("programmers");

        int res = obj1.add(5, 6);
        System.out.println("addtion using interger: " + res);

        double res1 = obj1.add(12.5, 42.5);
        System.out.println("addtion using double: " + res1);
    }
}