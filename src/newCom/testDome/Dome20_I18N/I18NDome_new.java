package newCom.testDome.Dome20_I18N;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class I18NDome_new {
    public static void main(String[] args) {
        // 创建一个本地语言环境对象，该对象会根据参数设置来自动选择与之相关的语言环境
//        参数：语言，地区q
        Locale locale_CN = new Locale("zh","CN");
        Locale locale_US = new Locale("en","US");

        //获取当前系统默认的语言环境
        Locale locale_default = Locale.getDefault();


        Scanner input = new Scanner(System.in);
        //用于绑定属性文件的工具类(参数：属性文件的基本名--就是前缀)
        ResourceBundle r = ResourceBundle.getBundle("newCom.testDome.Dome20_I18N.info",locale_CN);
        r.getString("system.name");
        System.out.println(r.getString("system.name"));
        System.out.print("input.username");
        String username = input.nextLine();
        System.out.print(r.getString("input.password"));
        String password = input.nextLine();

        if ("admin".equals(username) && "123".equals(password)){
            System.out.println(r.getString("login.sucess"));
            String welcome = r.getString("welcome");
            //动态文本格式化
            welcome =  MessageFormat.format(welcome,username);
            System.out.println(welcome);

        }else {
            System.out.println(r.getString("login.error"));
        }
    }
}
