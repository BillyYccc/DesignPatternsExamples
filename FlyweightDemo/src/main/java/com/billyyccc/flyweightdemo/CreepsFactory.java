package com.billyyccc.flyweightdemo;

/**
 * Created by Billy Yuan on 2017/5/28.
 * Email: billy112487983@gmail.com
 */

import java.util.Hashtable;
import java.util.Map;

/**
 * DOTA2小兵工厂类，FlyweightFactory类
 */
public class CreepsFactory {
    private static Map<String, MeleeCreep> flyweights = new Hashtable<>();

    /*If key exists in Map, return flyweight from Map*/
    public MeleeCreep getCreeps(String key) {
        if (flyweights.containsKey(key)) return flyweights.get(key);

    /*If key does not exist in Map, create flyweight*/
        MeleeCreep meleeCreep;
        switch (key) {
            case "Radiant":
                meleeCreep = new RadiantMeleeCreep();
                meleeCreep.sightRange = 750;
                meleeCreep.attackRange = 100;
                meleeCreep.experience = 40;
                break;
            case "Dire":
                meleeCreep = new DireMeleeCreep();
                meleeCreep.sightRange = 750;
                meleeCreep.attackRange = 100;
                meleeCreep.experience = 40;
                break;
            default:
                throw new IllegalArgumentException("Unsupported meleeCreep type");
        }
        flyweights.put(key, meleeCreep);
        return meleeCreep;
    }

    //Use Singleton in CreepsFactory
    private static class CreepsFactoryHolder {
        private static final CreepsFactory INSTANCE = new CreepsFactory();
    }

    private CreepsFactory() {

    }

    public static CreepsFactory getInstance() {
        return CreepsFactoryHolder.INSTANCE;
    }
}
