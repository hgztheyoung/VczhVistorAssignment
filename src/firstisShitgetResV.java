/**
 * Created by hgz on 2016/2/10.
 */
public class firstisShitgetResV implements ScrewVistorI<Boolean> {
    Shit first;
    AreEqualScrewVisitor v2 = new AreEqualScrewVisitor();
    public firstisShitgetResV(Shit first) {
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
