/**
 * Created by 82512 on 2017/6/9.
 */
public class ZhaoYun {
    public static void main(String[] args){
        Context context;

        //刚到吴国拆第一个
        System.out.println("-----刚到吴国的时候 拆第一个-----");
        IStrategy first=new BackDoor();
        context=new Context(first);//拿到妙计
        context.operate();

        System.out.println("-----刘备乐不思蜀 拆第二个-----");
        IStrategy second=new BackDoor();
        context=new Context(second);//拿到妙计
        context.operate();

        System.out.println("-----孙权的小兵追来了 拆第三个-----");
        IStrategy third=new BackDoor();
        context=new Context(third);//拿到妙计
        context.operate();

    }
}

/**
 * 策略模式的好处主要体现在高内聚低耦合特性！！！
 * 它属于对象的行为模式，其用意是针对每组算法，将每一个算法封装到有共同接口懂得独立类中，从而使他们可以相互替换。
 */
/**
 * 体现了OCP原则
 */

/**
 *准备一组算法，并将每一组算法封装起来，使得他们可以互换。
 */

/**
 * 缺点就是客户端必须知道所有的策略类并自行调用
 */