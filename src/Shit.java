/**
 * Created by hgz on 2016/2/10.
 */
public class Shit extends Screw {

    @Override
    public Object accept(ScrewVistorI ask) throws Exception {
        return ask.forShit(this);
    }
}
