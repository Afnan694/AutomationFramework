package w2a.rough;

import java.util.Date;

public class TimeStamp {
    public static void main(String[] args) {
        Date d = new Date();
        String screenShotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";
        System.out.println(screenShotName);
        System.out.println(d);


    }
}
