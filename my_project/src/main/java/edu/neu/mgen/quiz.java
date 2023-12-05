package edu.neu.mgen;

public class quiz{
    public static void main(String[] args) {
        System.out.println("Main start");
        TestClass testClass = new TestClass();
        testClass.protectedMethod();
        testClass.privateMethod(); // Why does this cause error?
        System.out.println("Main end");
    }
}
