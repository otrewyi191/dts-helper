package com.zzx.model;

import com.zzx.TestBase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/5/13 0013.
 */
public class ClipBoardTest extends TestBase {
    @Autowired
    private ClipBoard clipBoard;

    @Test
    public void test1(){
        assert clipBoard!=null;
    }
    @Test
    public void test2(){
        String toSet="zzxtest";
        clipBoard.setClipBoardText(toSet);
        assert clipBoard.getClipBoardText().equalsIgnoreCase("zzxtest");
    }
}