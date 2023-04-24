import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task0 {

    public static void main(String[] args) {
        String stones = "aaaAbbbB";
        Pattern pattern1 = Pattern.compile("a");
        Matcher matcher1 = pattern1.matcher(stones);
        int n = 0;

        Pattern pattern2 = Pattern.compile("B");
        Matcher matcher2 = pattern2.matcher(stones);
        int m = 0;

        while (matcher1.find()) {
            matcher1.group();
            n++;
        }

        while (matcher2.find()) {
            matcher2.group();
            m++;
        }

        String jewels = String.join(("a" + n), "", ("B" + m));
        System.out.println(jewels);
    }
}