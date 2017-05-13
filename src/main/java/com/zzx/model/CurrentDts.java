package com.zzx.model;

import com.zzx.util.ContainsDts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2017/5/13 0013.
 */
@Component
public class CurrentDts {
    private String dtsNumber;
    @Autowired
    private ClipBoard clipBoard;
    @Autowired
    private ContainsDts containsDts;

    public String getDtsNumber() {
        return dtsNumber;
    }

    public void setDtsNumber(String dtsNumber) {
        this.dtsNumber = dtsNumber;
    }

    public CurrentDts() {


    }

    @PostConstruct
    public void postConstruct() {
        clipBoard.addObserver((Observable o, Object arg) -> {
            if (((ClipBoard) o).getClipBoardText().toLowerCase().contains("dts")) {
                dtsNumber = "dts found";
                System.out.println(dtsNumber);
            }
        });
    }
}
