/**
 * Created by hgz on 2016/2/10.
 */
public interface ScrewVisitorI2<T>{
    T Visit(Fuck a, Fuck b);
    T Visit(Fuck a, Shit b);
    T Visit(Fuck a, Piss b);
    T Visit(Shit a, Fuck b);
    T Visit(Shit a, Shit b);
    T Visit(Shit a, Piss b);
    T Visit(Piss a, Fuck b);
    T Visit(Piss a, Shit b);
    T Visit(Piss a, Piss b);
}
