/**
 * Created by hgz on 2016/2/10.
 */
public class GetFatherOfFuckeeV implements ScrewVistorI<Person> {
    @Override
    public Person forFuck(Fuck fuck) {
        return ((Fuck) fuck).p.getFather();
    }

    @Override
    public Person forShit(Shit s) throws Exception {
        throw new Exception();        //I don't know how to throw a exception here.
    }

    @Override
    public Person forPiss(Piss piss) throws Exception {
        throw new Exception();
    }
}
