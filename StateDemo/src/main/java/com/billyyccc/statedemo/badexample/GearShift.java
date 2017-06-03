package com.billyyccc.statedemo.badexample;

/**
 * Created by Billy Yuan on 2017/6/2.
 * Email: billy112487983@gmail.com
 */

/*假设变速器一共有空挡，1-5前进档和倒挡，升档操作upShift，退档操作downShift*/
public class GearShift {
    private static final int NEUTRAL_GEAR = 0;
    private static final int FIRST_FORWARD_GEAR = 1;
    private static final int SECOND_FORWARD_GEAR = 2;
    private static final int THIRD_FORWARD_GEAR = 3;
    private static final int FOURTH_FORWARD_GEAR = 4;
    private static final int FIFTH_FORWARD_GEAR = 5;
    private static final int SIXTH_FORWARD_GEAR = 6;
    private static final int SEVENTH_FORWARD_GEAR = 7;
    private static final int REVERSE_GEAR = -1;

    private int gearState = 0;

    public void upShift() {
        if (gearState == REVERSE_GEAR) {
            gearState = NEUTRAL_GEAR;
            System.out.println("从倒车档挂入空挡...");
        }
        if (gearState == NEUTRAL_GEAR) {
            gearState = FIRST_FORWARD_GEAR;
            System.out.println("从空档挂入1档...");
        }
        if (gearState == FIRST_FORWARD_GEAR) {
            gearState = SECOND_FORWARD_GEAR;
            System.out.println("从1档挂入2档...");
        }
        if (gearState == SECOND_FORWARD_GEAR) {
            gearState = THIRD_FORWARD_GEAR;
            System.out.println("从2档挂入3档...");
        }
        if (gearState == THIRD_FORWARD_GEAR) {
            gearState = FOURTH_FORWARD_GEAR;
            System.out.println("从3档挂入4档...");
        }
        if (gearState == FOURTH_FORWARD_GEAR) {
            gearState = FIFTH_FORWARD_GEAR;
            System.out.println("从4档挂入5档...");
        }
        if (gearState == FIFTH_FORWARD_GEAR) {
            gearState = SIXTH_FORWARD_GEAR;
            System.out.println("从5档挂入6档...");
        }
        if (gearState == SIXTH_FORWARD_GEAR) {
            gearState = SEVENTH_FORWARD_GEAR;
            System.out.println("从6档挂入7档...");
        }
        if (gearState == SEVENTH_FORWARD_GEAR) {
            throw new UnsupportedOperationException("不支持的升档操作...");
        }
    }

    public void downShift(int newGearState) {
        if (gearState == REVERSE_GEAR) {
            throw new UnsupportedOperationException("不支持的降档操作...");
        }
        if (gearState == NEUTRAL_GEAR) {
            gearState = REVERSE_GEAR;
            System.out.println("从空档挂入倒车档...");
        }
        if (gearState == FIRST_FORWARD_GEAR) {
            gearState = NEUTRAL_GEAR;
            System.out.println("从1档挂入空档...");
        }
        if (gearState == SECOND_FORWARD_GEAR) {
            gearState = FIRST_FORWARD_GEAR;
            System.out.println("从2档挂入1档...");
        }
        if (gearState == THIRD_FORWARD_GEAR) {
            gearState = SECOND_FORWARD_GEAR;
            System.out.println("从3档挂入2档...");
        }
        if (gearState == FOURTH_FORWARD_GEAR) {
            gearState = THIRD_FORWARD_GEAR;
            System.out.println("从4档挂入3档...");
        }
        if (gearState == FIFTH_FORWARD_GEAR) {
            gearState = FOURTH_FORWARD_GEAR;
            System.out.println("从5档挂入4档...");
        }
        if (gearState == SIXTH_FORWARD_GEAR) {
            gearState = FIFTH_FORWARD_GEAR;
            System.out.println("从6档挂入5档...");
        }
        if (gearState == SEVENTH_FORWARD_GEAR) {
            gearState = SIXTH_FORWARD_GEAR;
            System.out.println("从7档挂入6档...");
        }
    }
}
