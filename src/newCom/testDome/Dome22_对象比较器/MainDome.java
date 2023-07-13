package newCom.testDome.Dome22_对象比较器;

import java.util.Arrays;

public class MainDome {
    public static void main(String[] args) {
        int[] nums = {11,2,35,64,23,44};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));


        String[] names = {"jack","tome","飞飞","小红"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
    }
}
