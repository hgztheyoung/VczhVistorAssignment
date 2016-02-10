/**
 * Created by hgz on 2016/2/10.
 */
public class firstisPissgetResV implements ScrewVistorI<Boolean> {
    Piss first;
    AreEqualScrewVisitor v2 = new AreEqualScrewVisitor();
    public firstisPissgetResV(Piss first) {
        this.first = first;
    }

    @Override
    public Boolean forFuck(Fuck second) throws Exception {
        return v2.Visit(first,second);
    }

    @Override
    public Boolean forShit(Shit second) throws Exception {
        return v2.Visit(first,second);
    }

    @Override
    public Boolean forPiss(Piss second) throws Exception {
        return v2.Visit(first,second);
    }
}
