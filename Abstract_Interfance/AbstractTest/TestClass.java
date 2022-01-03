package com.example.demo.Abstract_Interfance.AbstractTest;


public class TestClass {

    public static void main(String[] args) {
        InterfanceEntity entity = new InterfanceEntity();
        //匿名内部类形式 做入参
        System.out.println("===抽象类做入参，以匿名内部类方式实现======");
        entity.AsParam(new InregerDemo() {
            @Override
            public void param1() {
                System.out.println("param1");
            }

            @Override
            public Integer param2(Integer var1, String var2) {
                System.out.println("param2 var1:"+var1+"var2:"+var2);
                return null;
            }
        });

        System.out.println("===抽象类做入参，以实现类的方式实现====");
        entity.AsParam(new InregerDemoClass());

        System.out.println("===抽象类做返回值，以匿名内部类的方式实现===");
        entity.AsReturn1().param1();
        entity.AsReturn1().param2(25,"25");

        System.out.println("===抽象类做返回值，以实现类的方式实现===");
        entity.AsReturn2().param1();
        entity.AsReturn2().param2(35,"35");
    }
}
