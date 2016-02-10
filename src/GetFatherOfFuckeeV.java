/**
 * Created by hgz on 2016/2/10.
 */
public class GetFatherOfFuckeeV implements ScrewVistorI<Person> {
    @Override
    public Person forFuck(Person p) {
        return p.getFather();
    }

    @Override
    public Person forShit() throws Exception {
        throw new Exception();        //I don't know how to throw a exception here.
    }

    @Override
    public Person forPiss(Bitch b) throws Exception {
        throw new Exception();
    }
}
