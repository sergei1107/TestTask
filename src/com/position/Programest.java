package com.position;

/**
 * Created by sergei on 08.07.15.
 */
 public class Programest extends Position {

    String positionWork = "писать код";
    int workTime=0;

    @Override
    public long work() {
        return 0;
    }

    @Override
    public String getPositionWork() {
        return positionWork;
    }

    @Override
    public boolean isHaveTimeforJob() {
        return false;
    }

    @Override
    public long getTimeforWorkDone() {
        return 0;
    }

    @Override
    public int earnedMoney() {
        return 0;
    }


}
