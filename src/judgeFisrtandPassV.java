/**
 * Created by hgz on 2016/2/10.
 */
class judgeFisrtandPassV implements ScrewVistorI<Boolean> {
    Screw second;

    public judgeFisrtandPassV(Screw second) {
        this.second = second;
    }

    @Override
    public Boolean forFuck(Fuck first) throws Exception {
        return (Boolean) second.accept(new firstisFuckgetResV(first));
    }

    @Override
    public Boolean forShit(Shit first) throws Exception {
        return (Boolean) second.accept(new firstisShitgetResV(first));
    }

    @Override
    public Boolean forPiss(Piss first) throws Exception {
        return (Boolean) second.accept(new firstisPissgetResV(first));
    }
}
