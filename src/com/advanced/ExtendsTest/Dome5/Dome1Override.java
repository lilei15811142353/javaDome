package com.advanced.ExtendsTest.Dome5;

/**
 * 发放覆盖重写注意事项
 * 1.必须保证子父类之间发放的名称相同，参数列表也相同
 *  //@Override,写在方法的前面，用来检测是不是有效的正确覆盖重写
 * 这个注解就算不写，只要满足要求，也是正确的覆盖重写
 * 2.子类方法的返回值必须小于等于父类方法的返回值范围
 * 3.子类方法的权限必须大于等于父类方法的权限修饰符
 * 小扩展提示：public > protected > (default) > private
 * 备注：(default)不是关键字default ，而是什么都不写，留空
 */
public class Dome1Override {
    
}
