package com.ljd.principle.lockage.test;

import com.ljd.principle.lockage.entity.SgEntity;
import com.ljd.principle.lockage.service.SgSkin;
import com.ljd.principle.lockage.service.impl.DefaultSkin;
import com.ljd.principle.lockage.service.impl.LjdSkin;

/**
 * @Name ljd
 * @Description TODO
 * @date 2022/10/17 11:07
 * @Version 1.0
 */
public class SgInput {
    public static void main(String[] args) {
        // 创建对象
        SgEntity sgEntity = new SgEntity();
        // 创建皮肤对象
//        DefaultSkin defaultSkin = new DefaultSkin();
        LjdSkin ljdSkin = new LjdSkin();
        // 设置皮肤
//        sgEntity.setSgSkin(defaultSkin);
        sgEntity.setSgSkin(ljdSkin);
        // 执行
        sgEntity.display();
    }
}
