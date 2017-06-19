package com.billyyccc.mediatordemo.colleague;

import com.billyyccc.mediatordemo.mediator.ATMTower;

/**
 * Created by Billy Yuan on 2017/6/19.
 * Email: billy112487983@gmail.com
 */

/* 客机, Colleague in Pattern */

public abstract class AirlinerColleague {
    /* 与空管控制塔取得联系, 准备降落 */
    public abstract void prepareLanding(ATMTower atmTower);

    /* 空管塔已经调度完成, 即将降落 */
    public abstract void land();
}
