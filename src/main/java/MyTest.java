/**
 * Created by hexiaolong1 on 2016/12/12.
 */
public class MyTest {

    public static void main(String[] args) {
        System.out.println("Hello, Git!");
        System.out.println("master");
        System.out.println("==== branch 1.0 start ====");
        System.out.println("The merge content is:");
        StringBuilder sb = new StringBuilder();
        sb.append("1").append("2");
        System.out.println(sb.toString());
        System.out.println("==== branch 1.0 end ====");
        System.out.println("==== branch 2.0 start ====");
        for (int i = 0; i < 2; i++) {
            System.out.println("i:" + i);
        }
        System.out.println("==== branch 2.0 end ====");
    }

}
