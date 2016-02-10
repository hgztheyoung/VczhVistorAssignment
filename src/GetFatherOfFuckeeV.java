/**
 * Created by hgz on 2016/2/10.
 */
public class GetFatherOfFuckeeV implements ScrewVistorI<PersonD> {
    @Override
    public PersonD forFuck(PersonD p) {
        return p.getFather();
    }

    @Override
    public PersonD forShit() throws Exception {
        throw new Exception();        //I don't know how to throw a exception here.
    }

    @Override
    public PersonD forPiss(BitchD b) throws Exception {
        throw new Exception();
    }
}
