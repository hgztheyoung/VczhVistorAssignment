/**
 * Created by hgz on 2016/2/10.
 */
public class nameOfV implements ScrewVistorI<String> {
    @Override
    public String forFuck(Fuck fuck) {
        return "Fuck";
    }

    @Override
    public String forShit(Shit s) {
        return "Shit";
    }

    @Override
    public String forPiss(Piss piss) {
        return "Piss";
    }
}
