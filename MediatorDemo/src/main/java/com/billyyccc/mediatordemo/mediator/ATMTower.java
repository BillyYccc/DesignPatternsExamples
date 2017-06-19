package com.billyyccc.mediatordemo.mediator;

import com.billyyccc.mediatordemo.colleague.AirlinerColleague;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Billy Yuan on 2017/6/19.
 * Email: billy112487983@gmail.com
 */

/* ATM means Air Traffic Management 空管
 * ATMTower 空管控制塔, Mediator in Pattern */

public abstract class ATMTower {
    private String airportName;
    protected List<AirlinerColleague> airlinerList = new ArrayList<>();

    public abstract void addLandingAirliner(AirlinerColleague airlinerColleague);

    public abstract void scheduleLandingAirliners();

    public String getAirportName() {
        return airportName;
    }

    protected void setAirportName(String airportName) {
        this.airportName = airportName;
    }
}
