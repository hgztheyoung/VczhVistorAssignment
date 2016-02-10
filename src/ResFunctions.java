/**
 * Created by hgz on 2016/2/10.
 */
public class ResFunctions {
    public static String getName(Screw s) throws Exception {
        ScrewVistorI<String> v = new nameOfV();
        return (String) s.accept(v);
    }

    public static Person getFatherOfFuckee(Screw s) throws Exception {
        ScrewVistorI<Person> v = new GetFatherOfFuckeeV();
        return (Person) s.accept(v);
    }

    public static Boolean areEqual(Screw first,Screw second) throws Exception {
        return (Boolean) first.accept(new judgeFisrtandPassV(second));
    }
}
