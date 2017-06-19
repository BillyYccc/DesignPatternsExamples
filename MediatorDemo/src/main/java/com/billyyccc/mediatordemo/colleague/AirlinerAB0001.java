package com.billyyccc.mediatordemo.colleague;

import com.billyyccc.mediatordemo.mediator.ATMTower;

/**
 * Created by Billy Yuan on 2017/6/19.
 * Email: billy112487983@gmail.com
 */

/* AB0001号航班, ConcreteColleague in Pattern*/

public class AirlinerAB0001 extends AirlinerColleague {
    @Override
    public void prepareLanding(ATMTower atmTower) {
        atmTower.addLandingAirliner(this);
        System.out.println("AB0001号航班即将抵达" + atmTower.getAirportName());
    }

    @Override
    public void land() {
        System.out.println("AB0001号航班降落机场...");
    }
}
