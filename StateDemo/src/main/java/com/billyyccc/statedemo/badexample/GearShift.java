package com.billyyccc.statedemo.badexample;

/**
 * Created by Billy Yuan on 2017/6/2.
 * Email: billy112487983@gmail.com
 */

/*假设变速器一共有空挡，1-5前进档和倒挡，升档操作，退档操作*/
public class GearShift {
    private int NEUTRAL_GEAR = 0;
    private int FIRST_FORWARD_GEAR = 1;
    private int SECOND_FORWARD_GEAR = 2;
    private int THIRD_FORWARD_GEAR = 3;
    private int FOURTH_FORWARD_GEAR = 4;
    private int FIFTH_FORWARD_GEAR = 5;
    private int REVERSE_GEAR = -1;

    private int gearState = 0;

    public void upShift() {
        if (gearState == REVERSE_GEAR) gearState = NEUTRAL_GEAR;
        if (gearState == NEUTRAL_GEAR) gearState = FIRST_FORWARD_GEAR;
        if (gearState == FIRST_FORWARD_GEAR) gearState = SECOND_FORWARD_GEAR;
        if (gearState == SECOND_FORWARD_GEAR) gearState = THIRD_FORWARD_GEAR;
        if (gearState == THIRD_FORWARD_GEAR) gearState = FOURTH_FORWARD_GEAR;
        if (gearState == FOURTH_FORWARD_GEAR) gearState = FIFTH_FORWARD_GEAR;
        if (gearState == FIFTH_FORWARD_GEAR) {
            throw new UnsupportedOperationException("不支持的升档操作...");
        }
    }

    public void downShift(int newGearState) {
        if (newGearState >= NEUTRAL_GEAR && gearState >= NEUTRAL_GEAR) {
            gearState = newGearState;
        } else if (newGearState == REVERSE_GEAR && gearState == NEUTRAL_GEAR) {
            gearState = newGearState;
        } else {
            throw new UnsupportedOperationException("不支持的降档操作...");
        }
    }
}
