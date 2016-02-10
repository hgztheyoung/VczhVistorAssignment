/**
 * Created by hgz on 2016/2/10.
 */
public class Main {
    public static void main(String args[]) throws Exception {
        System.out.println(
                ResFunctions.getName(new Fuck(new Person()))
        );
        System.out.println(
                ResFunctions.getFatherOfFuckee(new Fuck(new Person()))
        );

        System.out.println(
                ResFunctions.areEqual(new Fuck(new Person()),
                        new Shit())
        );
        System.out.println(
                ResFunctions.areEqual(new Shit(),
                        new Shit())
        );
    }
}
