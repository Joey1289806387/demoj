package test;

import com.baomidou.mybatisplus.generator.config.IFileCreate;
import com.sun.org.apache.regexp.internal.RE;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import net.minidev.json.JSONUtil;

import org.assertj.core.util.DateUtil;
import org.omg.CORBA.ARG_OUT;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Test {
    public static void main(String[] args) throws IOException {
     /*   List<Student> list = new ArrayList<Student>();
        List<String> list1 = new ArrayList<String>();
        list1.add("1");
        list1.add("5qwwee");
        list1.add("ace");
        list1.add("4d");
        list1.add("2ddd");
        list1.add("3");
        list1.add("bq");*/

/*        WeakHashMap<String, String> wm = new WeakHashMap<>();
        wm.put(new String("语文"),new String("优秀"));
        wm.put(new String("英语"),new String("良好"));
        wm.put(new String("数学"),new String("好"));
        wm.put(new String("地理"),new String("一般"));
        wm.put("德语","不会");
        System.out.println(wm);
        System.gc();
        System.runFinalization();
        System.out.println("--------------");
        System.out.println(wm);
        HashMap<String, Integer> map = new HashMap<>();
        map.put("张三",10);
        map.put("李四",23);
        map.put("张五",45);
        map.put("张六",52);
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        System.out.println(entries);
        Set<String> strings = map.keySet();
        System.out.println(strings);
        Collection<Integer> values = map.values();
        System.out.println(values);
//        map.clear();
        boolean empty = map.isEmpty();
        System.out.println(empty);
        Integer a = map.remove("张三");
        System.out.println(a);
        System.out.println(entries);
        Properties properties = new Properties();
        properties.setProperty("username","smart");
        properties.setProperty("passeword","123456");
        properties.store(new FileOutputStream("d:\\test.ini"),"配置文件");
        Properties properties1 = new Properties();
        properties1.setProperty("gender","male");
        properties1.load(new FileInputStream("d:\\test.ini"));
        System.out.println(properties1);*/
      /*  Date yesterday = DateUtil.yesterday();
        System.out.println(yesterday);
        int i = DateUtil.yearOf(new Date());
        System.out.println(i);
        System.out.println(DateUtil.tomorrow());
        System.out.println();*/
      for (PayMethod pm:PayMethod.values()){
          System.out.println("间接变量，支付方式->"+pm);
      }
        EnumMap<PayMethod, String> payMethodStringEnumMap = new EnumMap<>(PayMethod.class);
        payMethodStringEnumMap.put(PayMethod.月付30天,"to support");
        payMethodStringEnumMap.put(PayMethod.货到7天,"to unsupport");
        for (PayMethod pm:PayMethod.values()){
            System.out.println("pay methods:"+pm.name()+payMethodStringEnumMap.get(pm));
        }
        EnumSet<Currency> currencies = EnumSet.allOf(Currency.class);
        for (Currency cs:currencies){
            System.out.println("币种："+cs);
        }
        System.out.println(ClearEnum.BUSS.getIndex());
        System.out.println(ClearEnum.BUSS.getName());

    }

    public enum PayMethod{
        货到7天,货到15天,月付15天,月付30天,月付90天;
    }
    public enum Currency{
        rmb,usd;
    }
    public enum ClearEnum{
        SPEAD("0","fapiao"),OTHER("1","GONGZI"),BUSS("3","ZHICHU");
        private String index;
        private String name;

        ClearEnum(String index, String name) {
            this.index = index;
            this.name = name;
        }
        public static String getName(String index){
            for (ClearEnum clearEnum:ClearEnum.values()){
                if (clearEnum.getIndex().equals(index)){
                    return clearEnum.name;
                }
            }
            return "";
        }
        public String getIndex(){
            return index;
        }
        public String getName(){
            return name;
        }
    }
    /**
     *
     * @param str 输入参数
     * @param fun String 为输入参数类型  Integer 为输出参数类型
     * @return 返回字符串长度
     */
    public static int testFunc(String str, Function<String,Integer> fun){
        Integer length = fun.apply(str);
        return length;
    }

    public static void testFun(String str, Consumer<String> con){
        con.accept(str);
    }
    public static String testFun2(Supplier<String> sup){
        return sup.get();
    }

    /**
     *
     * @param str
     * @param pre
     * @return
     */
    public static boolean testPre(String str, Predicate<String> pre){
        return pre.test(str);
    }

}

