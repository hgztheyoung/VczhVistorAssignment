/**
 * Created by hgz on 2016/2/10.
 */
public class Fuck extends Screw {
    Person p;

    public Fuck(Person p) {
        this.p = p;
    }

    @Override
    public Object accept(ScrewVistorI ask) throws Exception {
        return ask.forFuck(this);
    }
}
