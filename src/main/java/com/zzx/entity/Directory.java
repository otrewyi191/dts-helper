package com.zzx.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Observable;

/**
 * Created by Administrator on 2017/5/13 0013.
 */
@Component
public class Directory{
    public String getDirName() {
        return dirName;
    }

    public void setDirName(String dirName) {
        this.dirName = dirName;
    }

    private String dirName;
}
