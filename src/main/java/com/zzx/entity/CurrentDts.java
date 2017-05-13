package com.zzx.entity;

import com.zzx.util.ContainsDts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Observable;

/**
 * Created by Administrator on 2017/5/13 0013.
 */
@Component
public class CurrentDts{
    private String dtsNumber;


    public String getDtsNumber() {
        return dtsNumber;
    }

    public void setDtsNumber(String dtsNumber) {
        this.dtsNumber = dtsNumber;
    }


}
