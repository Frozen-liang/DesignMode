package com.ljd.designmode.creator.singlemode.hunger;

/**
 * @Name ljd
 * @Description TODO
 * @date 2022/10/19 09:18
 * @Version 1.0
 */
public class StaticMember {

    private StaticMember(){

    }

    private static final StaticMember staticMember = new StaticMember();

    public static StaticMember getStaticMember(){
        return staticMember;
    }
}
