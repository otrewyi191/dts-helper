package com.zzx.model;

import com.zzx.entity.Directory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Observable;

/**
 * Created by Administrator on 2017/5/13 0013.
 */
@Component
public class DirectoryModel extends Observable{
    @Autowired
    private CurrentDtsModel currentDtsModel;

    public String getDirName() {
        return directory.getDirName();
    }

    public void setDirName(String dirName) {
        directory.setDirName(dirName);
    }

    @Autowired
    private Directory directory;

    @PostConstruct
    public void changeDirName()
    {
        currentDtsModel.addObserver(
                (o,arg)->{
                    directory.setDirName("c:/a/b/c/d/"+ currentDtsModel.getDtsNumber());
                    setChanged();
                    notifyObservers();
                }
        );
    }
}
