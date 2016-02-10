/**
 * Created by hgz on 2016/2/10.
 */
public class Piss extends Screw {
    public Bitch b;

    public Piss(Bitch b) {
        this.b = b;
    }

    @Override
    public Object accept(ScrewVistorI ask) throws Exception {
        return ask.forPiss(b);
    }
}
