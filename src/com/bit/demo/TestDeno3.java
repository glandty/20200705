package com.bit.demo;
class Test{
    int a;//包访问权限
}
public class TestDeno3 {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.a);
    }
}
