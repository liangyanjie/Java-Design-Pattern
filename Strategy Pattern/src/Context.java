/**
 * Created by 82512 on 2017/6/9.
 */

//妙计有了，还需要个锦囊
public class Context {
    //构造函数有了
    private IStrategy strategy;
    public Context(IStrategy f){
        this.strategy=f;
    }

    //使用计谋了，看我出招
    public void operate(){
        this.strategy.operate();
    }

}
