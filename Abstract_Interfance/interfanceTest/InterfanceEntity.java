package com.example.demo.Abstract_Interfance.interfanceTest;

//用接口做入参和出参的类
public class InterfanceEntity {
    //用接口做形参
    //这个在调用的时候  也必须实例化这个接口当参数  可以是匿名内部类的形式  也可以是  实现类的形式
    public  void AsParam(InregerDemo id){
        id.param2(1,"ss");
        id.param1();
    }

    //用接口做返回值  一定要返回接口的实例
    //以匿名内部类的方式
    public InregerDemo AsReturn1(){
        return new InregerDemo(){
            @Override
            public void param1() {
                System.out.println("接口做返回值  匿名内部类形式  param1");
            }

            @Override
            public Integer param2(Integer var1, String var2) {

                System.out.println("接口做返回值  匿名内部类形式  param2  入参 var1 :"+var1+"=var2:="+var2+"返回值："+(var1+var2.length()));

                return var1+var2.length();
            }
        };
    }


    //用接口做返回值  以实体类的形式返回
    public InregerDemo AsReturn2(){
        return new InregerDemoClass();
    }
}
