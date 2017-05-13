package com.zzx.util;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/5/13 0013.
 */
@Component
public class ContainsDts {
    public boolean test(String s) {
        return s.toLowerCase().contains("dts");
    }
}
