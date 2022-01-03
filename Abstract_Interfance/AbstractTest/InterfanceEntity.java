package com.example.demo.Abstract_Interfance.AbstractTest;



//以抽象类做入参  或者  返回值
public class InterfanceEntity {

    //以抽象类做入参
    public void AsParam(InregerDemo id){
        id.param2(1,"ss");
    }

    //以抽象类做返回值
    public InregerDemo AsReturn1(){
        return new InregerDemo(){

            @Override
            public void param1() {
                System.out.println("抽象类做返回值  匿名内部类形式  param1");
            }

            @Override
            public Integer param2(Integer var1, String var2) {

                System.out.println("抽象类做返回值  匿名内部类形式  param2  入参 var1 :"+var1+"=var2:="+var2+"返回值："+(var1+var2.length()));

                return var1+var2.length();
            }
        };
    }


    //用接口做返回值  以实体类的形式返回
    public InregerDemo AsReturn2(){
        return new InregerDemoClass();
    }


}
