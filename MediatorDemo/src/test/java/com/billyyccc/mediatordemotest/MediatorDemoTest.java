package com.billyyccc.mediatordemotest;

import com.billyyccc.mediatordemo.colleague.*;
import com.billyyccc.mediatordemo.mediator.ATMTower;
import com.billyyccc.mediatordemo.mediator.ShuangliuATMTower;
import org.junit.Test;

/**
 * Created by Billy Yuan on 2017/6/19.
 * Email: billy112487983@gmail.com
 */

public class MediatorDemoTest {
    @Test
    public void shuangliuAirportTest() {
        //实例化ConcreteMediator
        ATMTower atmTower = new ShuangliuATMTower();

        //机场同时来了四架客机
        AirlinerColleague airliner1 = new AirlinerAB0001();
        AirlinerColleague airliner2 = new AirlinerCD0002();
        AirlinerColleague airliner3 = new AirlinerEF0003();
        AirlinerColleague airliner4 = new AirlinerGH0004();
        System.out.println("-----双流机场同时来了四架客机-----");

        //准备降落
        airliner1.prepareLanding(atmTower);
        airliner3.prepareLanding(atmTower);
        airliner4.prepareLanding(atmTower);
        airliner2.prepareLanding(atmTower);
        System.out.println("-----四架客机准备降落-----");

        //空管控制塔进行调度
        System.out.println("空管控制台对即将降落的航班进行调度...");
        atmTower.scheduleLandingAirliners();
    }
}
