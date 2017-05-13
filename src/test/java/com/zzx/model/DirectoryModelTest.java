package com.zzx.model;

import com.zzx.TestBase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017/5/13 0013.
 */
public class DirectoryModelTest extends TestBase {

    @Autowired
    private ClipBoardModel clipBoardModel;

    @Autowired
    private DirectoryModel directoryModel;

    @Test
    public void setDirName() throws Exception {
        clipBoardModel.setClipBoardText("abc");
        System.out.println(directoryModel.getDirName());
    }
    @Test
    public void setDirName1() throws Exception {
        clipBoardModel.setClipBoardText("dtsabc");
        String dirName = directoryModel.getDirName();
        assert dirName.toLowerCase().startsWith("c:/");
    }

}