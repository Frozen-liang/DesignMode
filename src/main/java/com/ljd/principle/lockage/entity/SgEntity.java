package com.ljd.principle.lockage.entity;

import com.ljd.principle.lockage.service.SgSkin;
import lombok.Data;

/**
 * @Name ljd
 * @Description TODO
 * @date 2022/10/17 11:10
 * @Version 1.0
 */
@Data
public class SgEntity {

    private SgSkin sgSkin;

    public void display() {
        sgSkin.display();
    }

}
