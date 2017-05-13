package com.zzx.model;

import com.zzx.TestBase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017/5/13 0013.
 */
public class ClipBoardModelTest extends TestBase {
    @Autowired
    private ClipBoardModel clipBoardModel;

    @Test
    public void test1(){
        assert clipBoardModel !=null;
    }
    @Test
    public void test2(){
        String toSet="zzxtest";
        clipBoardModel.setClipBoardText(toSet);
        assert clipBoardModel.getClipBoardText().equalsIgnoreCase("zzxtest");
    }
}