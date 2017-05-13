package com.zzx.model;

import com.zzx.entity.CurrentDts;
import com.zzx.util.ContainsDts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Observable;

/**
 * Created by Administrator on 2017/5/13 0013.
 */
@Component
public class CurrentDtsModel extends Observable{
    @Autowired
    private CurrentDts currentDts;
    @Autowired
    private ClipBoardModel clipBoardModel;

    @Autowired
    private ContainsDts containsDts;

    public String getDtsNumber() {
        return currentDts.getDtsNumber();
    }

    public void setDtsNumber(String dtsNumber) {
        currentDts.setDtsNumber(dtsNumber);
    }

    public CurrentDtsModel() {


    }

    @PostConstruct
    public void postConstruct() {
        clipBoardModel.addObserver((o, arg) -> {
            String clipBoardText = ((ClipBoardModel) o).getClipBoard();
            if (containsDts.test(clipBoardText)) {
                setDtsNumber("dts found");

                //sent msg only when contain dts
                setChanged();
                notifyObservers();
            } else {
                setDtsNumber("dts not found");
            }
        });
    }
}
