package cmis141.week7;

/**
 * Created by jstok on 8/2/2017.
 */
public class WeekSeven {
    private void soManyStrings() {
        String s1 = new String("ABC");
        String s2 = new String("DEF");

        String sb1 = new String("ABC");
        String sb2 = new String("DEFGHI");
        System.out.println("The third character of sb1 is " + sb1.charAt(2));
        System.out.println("The third character of sb2 is " + sb2.charAt(2));

        char c1 = s1.charAt(3);
        System.out.println("c = " + c1);

        c1 = s2.charAt(3);
        System.out.println("c = " + c1);

        String s3 = s1.substring(0,1);
        System.out.println(s3);
    }

    private void checkEquivilance() {
        String s1 = new String("ABC");
        String s2 = s1;
        String s3 = new String("ABC");

        if (s1 == s2) {
            System.out.println("s1 == s2");
        }
        if (s1.equals(s2)) {
            System.out.println("s1.equals(s2)");
        }
        if (s1 == s3) {
            System.out.println("s1 == s3");
        }
        if (s1.equals(s3)) {
            System.out.println("s1.equals(s3)");
        }
    }

    public static void main(String[] args) {
        WeekSeven wk7 = new WeekSeven();
        //wk7.soManyStrings();
        wk7.checkEquivilance();

        System.out.println("hello moto\b");

        StringBuilder builder = new StringBuilder(16);
        builder.append("hi");
        System.out.println(builder);
        builder.append(true);
        System.out.println(builder);
        builder.append(55);
        System.out.println(builder);
        builder.reverse();
        System.out.println(builder);
        System.out.println(builder.charAt(3));
        System.out.println(builder.toString());
    }
}
