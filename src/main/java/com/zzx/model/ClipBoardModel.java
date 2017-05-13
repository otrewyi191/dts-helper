package com.zzx.model;

import com.zzx.entity.ClipBoard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Observable;

/**
 * Created by Administrator on 2017/5/13 0013.
 */
@Component
public class ClipBoardModel extends Observable{

    public String getClipBoard() {
        return clipBoard.getClipBoardText();
    }

    public void setClipBoard(String s) {
        clipBoard.setClipBoardText(s);
        setChanged();
        notifyObservers();
    }

    @Autowired
    private ClipBoard clipBoard;

}
