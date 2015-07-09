package com.position;

import com.Worker;
import com.WorkeresHolder;

import java.util.ArrayList;

/**
 * Created by sergei on 08.07.15.
 */
public class Counter extends Position {

    String positionWork = "составить отчетность";
    private ArrayList<Worker> workeresHolder = WorkeresHolder.getInstase().getWorkers();




    @Override
    public String getPositionWork() {
        return  positionWork;
    }




    public void makeReportes(){

    }

}
