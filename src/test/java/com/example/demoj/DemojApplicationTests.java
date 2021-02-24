package com.example.demoj;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemojApplicationTests {

    @Test
    void contextLoads() {
    }

   /* public static void main(String[] args) {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("1","张三");
        map.put("2","李四");
        map.put("3","王五");
        map.put("4","老刘");
        map.put("6","老六");
        map.put("7","老7");
        map.put("8","老8");
        map.put("17","十七");
        map.put("18","18");
        map.put("19","19");
        map.put("28","28");
        map.put("29","29");
        map.put("39","39");
        map.put("40","40");
        System.out.println(map.get("6"));
    }*/
   public void add(){
       int a=1;
       int b=2;
       int c=a+b;
       System.out.println(c);;
   }
   public static void main(String[] args) {
       DemojApplicationTests demo = new DemojApplicationTests();
       demo.add();
   }
}
