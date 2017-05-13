package com.zzx.model;

import com.zzx.TestBase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/5/13 0013.
 */
public class CurrentDtsTest extends TestBase {

    @Autowired
    private ClipBoard clipBoard;

    @Autowired
    private CurrentDts currentDts;

    @Test
    public void test1() throws Exception {
        clipBoard.setClipBoardText("abc");
        assert currentDts.getDtsNumber() == null;
    }

    @Test
    public void test2() throws Exception {
        clipBoard.setClipBoardText("abc dts123");
        System.out.println(currentDts.getDtsNumber());
    }
}