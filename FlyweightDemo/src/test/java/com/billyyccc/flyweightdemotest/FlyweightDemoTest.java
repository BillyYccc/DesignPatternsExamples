package com.billyyccc.flyweightdemotest;

import com.billyyccc.flyweightdemo.CreepsFactory;
import com.billyyccc.flyweightdemo.MeleeCreep;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Billy Yuan on 2017/5/28.
 * Email: billy112487983@gmail.com
 */

public class FlyweightDemoTest {
    @Test
    public void creepsTest() {
        //小兵工厂
        CreepsFactory creepsFactory = CreepsFactory.getInstance();

        //通过小兵工厂获取实例
        MeleeCreep direMeleeCreepOnTopLane = creepsFactory.getCreeps("Dire");
        MeleeCreep direMeleeCreepOnMiddleLane = creepsFactory.getCreeps("Dire");
        MeleeCreep direMeleeCreepOnBottomLane = creepsFactory.getCreeps("Dire");
        MeleeCreep radiantMeleeCreepOnTopLane = creepsFactory.getCreeps("Radiant");
        MeleeCreep radiantMeleeCreepOnMiddleLane = creepsFactory.getCreeps("Radiant");
        MeleeCreep radiantMeleeCreepOnBottomLane = creepsFactory.getCreeps("Radiant");

        //小兵进行移动
        System.out.println("上路夜魇小兵移动");
        direMeleeCreepOnTopLane.move(100, 100, 0, 100);
        System.out.println("中路夜魇小兵移动");
        direMeleeCreepOnMiddleLane.move(100, 100, 50, 50);
        System.out.println("下路夜魇小兵移动");
        direMeleeCreepOnBottomLane.move(100, 100, 100, 0);
        System.out.println("上路天辉小兵移动");
        radiantMeleeCreepOnTopLane.move(0, 0, 0, 100);
        System.out.println("中路天辉小兵移动");
        radiantMeleeCreepOnMiddleLane.move(0, 0, 50, 50);
        System.out.println("下路天辉小兵移动");
        radiantMeleeCreepOnBottomLane.move(0, 0, 100, 0);

        //工厂只维护两个小兵对象
        assertThat(direMeleeCreepOnTopLane.hashCode(),
                both(is(direMeleeCreepOnMiddleLane.hashCode()))
                        .and(is(direMeleeCreepOnBottomLane.hashCode())));
        assertThat(radiantMeleeCreepOnTopLane.hashCode(),
                both(is(radiantMeleeCreepOnMiddleLane.hashCode()))
                        .and(is(radiantMeleeCreepOnBottomLane.hashCode())));
    }
}