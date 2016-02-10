/**
 * Created by hgz on 2016/2/10.
 */
public class AreEuqalV implements ScrewVistorI<Boolean> {
    public Screw another;

    public AreEuqalV(Screw another) {
        this.another = another;
    }

    @Override
    public Boolean forFuck(Person p) throws Exception {
        return another instanceof Fuck;
    }

    @Override
    public Boolean forShit() throws Exception {
        return another instanceof Shit;
    }

    @Override
    public Boolean forPiss(Bitch b) throws Exception {
        return another instanceof Piss;
    }
}
