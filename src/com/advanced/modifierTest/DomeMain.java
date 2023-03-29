package com.advanced.modifierTest;

/**
 * java中有四种权限修饰符
 *              public    >     protected    >     (default)     >     private
 * 
 * 同一个类         yes             yes                 yse                 yse
 * 同一个包         yes             yes                 yes                 no
 * 不同包子类       yes             yes                 no                  no
 * 不同包非子类     yes             no                   no                  no
 * 
 * 
 * 注意事项
 * (default):不是关键字defalut，而是根本不写
 */
public class DomeMain {
    public static void main(String[] args) {
        
    }
}
