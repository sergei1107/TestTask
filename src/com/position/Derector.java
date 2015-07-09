package com.position;

import com.Worker;
import com.WorkeresHolder;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by sergei on 08.07.15.
 */
public class Derector extends Position {


    private ArrayList<Worker> workeresHolder = WorkeresHolder.getInstase().getWorkers();

    private String[] duties={"писать код",
                             "рисовать макет",
                             "тестировать программу",
                             "продавать услуги",
                             "составить отчетность"};

            static final long anHour = 60*60*1000;
            int times = 0;
            Timer timer  = new Timer();






    public long work(){
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                if(times<40){
                    times++;
                    int work = (int) ((Math.random()*4));
                    String job =   duties[work];

                    for (int i = 0; i < workeresHolder.size(); i++) {
                        Worker worker = workeresHolder.get(i);
                        if(worker.isWork){
                            continue;
                        }else {
                               if (worker.isCanDoJob(job)){
                                   break;
                            }
                        }
                    }
                }else timer.cancel();
            }
        };
        timer.schedule(task,0,(60*60*1000));

return 0;
    }

    @Override
    public String getPositionWork() {
        return null;
    }

    @Override
    public boolean isHaveTimeforJob() {
        return false;
    }

    @Override
    public long getTimeforWorkDone() {
        return 0;
    }

}
