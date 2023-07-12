package newCom.testDome.Dome21_Math;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDome {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        //使用连个构造方法
        //Date(long date) 参数式毫秒
        //Date()
        Date data1 = new Date(23234);
        System.out.println(data1);


        Calendar c1 = Calendar.getInstance();
        int year = c1.get(Calendar.YEAR);
        int month = c1.get(Calendar.MONTH);
        int day = c1.get(Calendar.DAY_OF_MONTH);
        int hour = c1.get(Calendar.HOUR_OF_DAY);
        int minute  = c1.get(Calendar.MINUTE);
        int second = c1.get(Calendar.SECOND);
        int minllisecond = c1.get(Calendar.MILLISECOND);
        StringBuffer sb = new StringBuffer(50);
        sb.append(year).append("年").append(month).append("月").append(day).append("日").append(hour).append("时").append(minute).append("分").append(second).append("秒").append(minllisecond).append("毫秒");
        System.out.println(sb.toString());

        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss SSS");
        String nowData = df.format(new Date());
        System.out.println(nowData);
    }
}
