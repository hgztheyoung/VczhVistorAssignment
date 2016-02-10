/**
 * Created by hgz on 2016/2/10.
 */
public class PissD extends ScrewD {
    public BitchD b;

    public PissD(BitchD b) {
        this.b = b;
    }

    @Override
    public Object accept(ScrewVistorI ask) throws Exception {
        return ask.forPiss(b);
    }
}
