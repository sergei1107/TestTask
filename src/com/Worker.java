package com;

import com.position.Position;

import java.util.List;

/**
 * Created by sergei on 08.07.15.
 */
public class Worker implements Runnable {

    String name;
    public List<Position> positions;

    final long workTimeLimet = 40*60*60*1000;
          long workcurrentTime = 0;
     private   Position curentPosition ;

   public boolean isWork = false;

        Worker(Integer i){
            name = i.toString();
         }




    public void registerJob(Position curentPosition){
      this.curentPosition = curentPosition;
    }



        public synchronized boolean isCanDoJob(String job){
            for (Position position:positions){
                if(workTimeLimet<workcurrentTime+position.getTimeforWorkDone() &&
                        position.isHaveTimeforJob() && position.getPositionWork().equals(job)){
                       isWork = true;
                        workcurrentTime+=position.getTimeforWorkDone();
                      registerJob(position);
                    return true;

                }else return false;
            }
            return false;
        }

        //create week report
    public Report makeReport(){

        Report report = new Report();



        return report;
    }


// evry worker spleep when have job
    @Override
    public void run() {
            while (true){

                if (curentPosition != null){
                    try {
                        Thread.sleep(curentPosition.work());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    isWork =false;
                    curentPosition=null;
                }
            }


    }





}
