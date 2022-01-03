package com.example.demo.Abstract_Interfance.interfanceTest;

public class InregerDemoClass implements InregerDemo {


    @Override
    public void param1() {
        System.out.println("InregerDemo实现类param1  方法");
    }

    @Override
    public Integer param2(Integer var1, String var2) {
        System.out.println("InregerDemo实现类param2  方法 入参为:"+var1+ "---"+ var2+"返回值为 "+(var1+var2.length()));

        return var1+var2.length();
    }
}
