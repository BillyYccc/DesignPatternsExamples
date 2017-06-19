package com.billyyccc.mediatordemo.colleague;

import com.billyyccc.mediatordemo.mediator.ATMTower;

/**
 * Created by Billy Yuan on 2017/6/19.
 * Email: billy112487983@gmail.com
 */

/* GH0004号航班, ConcreteColleague in Pattern*/

public class AirlinerGH0004 extends AirlinerColleague {
    @Override
    public void prepareLanding(ATMTower atmTower) {
        atmTower.addLandingAirliner(this);
        System.out.println("GH0004号航班即将抵达" + atmTower.getAirportName());
    }

    @Override
    public void land() {
        System.out.println("GH0004号航班降落机场...");
    }
}
