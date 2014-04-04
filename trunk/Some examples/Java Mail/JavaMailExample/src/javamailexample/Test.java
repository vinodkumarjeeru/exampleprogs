/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javamailexample;

/**
 *
 * @author Admin
 */
interface A {

    void print();
}

public class Test {

    public static void main(String args[]) {

        A a = new A() {
            @Override
            public void print() {
                System.out.println("Print");
            }
        };
        
        a.print();
    }
}
