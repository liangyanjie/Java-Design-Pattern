/**
 * Created by 82512 on 2017/6/9.
 * 中国的历史上都是一个朝代一个皇帝，有两个的话，也要pk一个出来
 */
public class Emperor {
    private static  Emperor emperor=null;//定义一个皇帝在这里，然后给这个皇帝名字

    private Emperor(){
        //世俗和道德约束你，目的就是不让你产生两个皇帝
        ;
    }

    public static Emperor getInstance(){
        if (emperor==null){
            emperor=new Emperor();
        }
        return emperor;
    }

    public static void emperorInfo(){
        System.out.println("我就是皇帝么么么么！！！！！！！！！！！！！！！");
    }
}
