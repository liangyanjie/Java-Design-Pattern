/**
 * Created by 82512 on 2017/6/9.
 * 王婆太聪明了，不过没人看得上他，不过他可以作为一个人的代理
 */
public class WangPo implements KindWomen {
    private KindWomen kindwomen;
    public WangPo(){
        this.kindwomen=new PanJinLian();
    }

    public WangPo(KindWomen kindwomen){
        this.kindwomen=kindwomen;
    }

    @Override
    public void makeEyesWithMan() {
        this.kindwomen.makeEyesWithMan();//都这么老了，还跟谁抛
    }

    @Override
    public void happyWithMan() {
        this.kindwomen.happyWithMan();//自己老了，可以让年轻的人去干
    }
}
