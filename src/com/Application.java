package com;

import java.util.Date;

/**
 * Created by sergei on 08.07.15.
 */
public class Application {

    public static Date startDate;
    static public WorkeresHolder workeresHolder;




    public static void main(String[] args) {
        startDate = new Date(0);
        Date newDate = new Date();



        int workerNumber = (int) ((Math.random()*90)+10);
        workeresHolder = WorkeresHolder.getInstase();
        //
        for (Integer i = 0; i < workerNumber; i++) {
            workeresHolder.addWorker(new Worker(i));
        }
        


        try {
            Thread.sleep(startDate.getTime());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }





    }
}
