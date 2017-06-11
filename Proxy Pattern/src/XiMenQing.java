/**
 * Created by 82512 on 2017/6/9.
 */
public class XiMenQing {
    public static void main(String [] args){
        //WangPo wangpo=new WangPo();//把王叫出来
        //wangpo.happyWithMan();//看到没，虽然表面上王婆在做，实际上爽的是潘金莲
        //wangpo.makeEyesWithMan();

        JiaShi jiashi =new JiaShi();
        WangPo wangpo =new WangPo(jiashi);
        wangpo.makeEyesWithMan();
        wangpo.happyWithMan();

    }
}
