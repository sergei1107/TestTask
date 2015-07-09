package com;

import java.util.ArrayList;

/**
 * Created by sergei on 08.07.15.
 */
public class WorkeresHolder {

    private static WorkeresHolder workeresHolder;

    private  ArrayList<Worker> workers;



        private WorkeresHolder(){
        workers = new ArrayList<>();
    }


    public  void addWorker(Worker worker){
        workers.add(PositionFactory.installPosition(worker));
    }


        public static WorkeresHolder getInstase(){
          if(workeresHolder ==null ){
        workeresHolder = new WorkeresHolder();
        return workeresHolder;
        }  else return workeresHolder;
}

    public ArrayList<Worker> getWorkers() {
        return workers;

    }






}
