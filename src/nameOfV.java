/**
 * Created by hgz on 2016/2/10.
 */
public class nameOfV implements ScrewVistorI<String> {
    @Override
    public String forFuck(Person p) {
        return "Fuck";
    }

    @Override
    public String forShit() {
        return "Shit";
    }

    @Override
    public String forPiss(Bitch b) {
        return "Piss";
    }
}
