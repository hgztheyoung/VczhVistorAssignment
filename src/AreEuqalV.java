/**
 * Created by hgz on 2016/2/10.
 */
public class AreEuqalV implements ScrewVistorI<Boolean> {
    public ScrewD another;

    public AreEuqalV(ScrewD another) {
        this.another = another;
    }

    @Override
    public Boolean forFuck(PersonD p) throws Exception {
        return another instanceof FuckD;
    }

    @Override
    public Boolean forShit() throws Exception {
        return another instanceof ShitD;
    }

    @Override
    public Boolean forPiss(BitchD b) throws Exception {
        return another instanceof PissD;
    }
}
