package com.zzx.entity;

import org.springframework.stereotype.Component;

import java.util.Observable;

/**
 * Created by Administrator on 2017/5/13 0013.
 */
@Component
public class ClipBoard{

    public String getClipBoardText() {
        return clipBoardText;
    }

    public void setClipBoardText(String clipBoardText) {
        this.clipBoardText = clipBoardText;

    }

    private String clipBoardText;

}
