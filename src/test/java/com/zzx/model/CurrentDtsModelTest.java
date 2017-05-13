package com.zzx.model;

import com.zzx.TestBase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017/5/13 0013.
 */
public class CurrentDtsModelTest extends TestBase {

    @Autowired
    private ClipBoardModel clipBoardModel;

    @Autowired
    private CurrentDtsModel currentDtsModel;

    @Test
    public void test1() throws Exception {
        clipBoardModel.setClipBoardText("abc");
        assert currentDtsModel.getDtsNumber().equalsIgnoreCase("dts not found");
    }

    @Test
    public void test2() throws Exception {
        clipBoardModel.setClipBoardText("abc dts123");
        assert currentDtsModel.getDtsNumber().equalsIgnoreCase("dts found");
    }
}