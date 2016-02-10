/**
 * Created by hgz on 2016/2/10.
 */
public class FuckD extends ScrewD {
    PersonD p;

    public FuckD(PersonD p) {
        this.p = p;
    }

    @Override
    public Object accept(ScrewVistorI ask) throws Exception {
        return ask.forFuck(p);
    }
}
