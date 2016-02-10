/**
 * Created by hgz on 2016/2/10.
 */
public class AreEqualScrewVisitor implements ScrewVisitorI2<Boolean>{
    @Override
    public Boolean Visit(Fuck a, Fuck b) {
        return a.equals(b);
    }

    @Override
    public Boolean Visit(Fuck a, Shit b) {
        return false;
    }

    @Override
    public Boolean Visit(Fuck a, Piss b) {
        return false;
    }

    @Override
    public Boolean Visit(Shit a, Fuck b) {
        return false;
    }

    @Override
    public Boolean Visit(Shit a, Shit b) {
        return true;
    }

    @Override
    public Boolean Visit(Shit a, Piss b) {
        return false;
    }

    @Override
    public Boolean Visit(Piss a, Fuck b) {
        return false;
    }

    @Override
    public Boolean Visit(Piss a, Shit b) {
        return false;
    }

    @Override
    public Boolean Visit(Piss a, Piss b) {
        return a.equals(b);
    }
}
