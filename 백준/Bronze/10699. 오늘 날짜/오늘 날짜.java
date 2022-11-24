import java.text.SimpleDateFormat;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        String pattern = "yyyy-MM-dd";

        SimpleDateFormat simpleDateFormat;
        simpleDateFormat = new SimpleDateFormat(pattern);

        String final_Date = simpleDateFormat.format(date);
        System.out.print(final_Date);
    }
}