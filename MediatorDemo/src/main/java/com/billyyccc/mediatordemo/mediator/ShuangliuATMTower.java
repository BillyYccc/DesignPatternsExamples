package com.billyyccc.mediatordemo.mediator;

import com.billyyccc.mediatordemo.colleague.AirlinerColleague;

/**
 * Created by Billy Yuan on 2017/6/19.
 * Email: billy112487983@gmail.com
 */

/* 双流机场空管控制塔
 * ConcreteMediator in Pattern */

public class ShuangliuATMTower extends ATMTower {
    public ShuangliuATMTower() {
        this.setAirportName("双流机场");
    }

    @Override
    public void addLandingAirliner(AirlinerColleague airlinerColleague) {
        airlinerList.add(airlinerColleague);
    }

    @Override
    public void scheduleLandingAirliners() {
        for (AirlinerColleague airlinerColleague : airlinerList) {
            airlinerColleague.land();
        }
    }
}
