package com.zzx.model;

import org.springframework.stereotype.Component;

import java.util.Observable;

/**
 * Created by Administrator on 2017/5/13 0013.
 */
@Component
public class ClipBoard extends Observable{

    public String getClipBoardText() {
        return clipBoardText;
    }

    public void setClipBoardText(String clipBoardText) {
        this.clipBoardText = clipBoardText;
        setChanged();
        notifyObservers();
    }

    private String clipBoardText;

    public ClipBoard() {
        this.clipBoardText = "";
    }
}
