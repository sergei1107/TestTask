package com;

import com.position.*;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by sergei on 08.07.15.
 */
public class PositionFactory {

static int workerNumber=0;

private static Position[] positions = {new Derector(),new Counter(),
                                       new Manager(),new Desiner(),
                                       new Tester(),new Programest()};


  public static Worker installPosition(Worker worker){

   switch (workerNumber) {
       case 0: worker.positions.add(new Derector());
           workerNumber++;
           return worker;
       case 1: worker.positions.add(new Manager());
           workerNumber++;
           return worker;
       case 2: worker.positions.add(new Counter());
           workerNumber++;
           return worker;
       default: int nuberPositiones = (int) ((Math.random()*5)+1);

           Position[] positionnew = positions.clone();
           for (int i = 0; i < nuberPositiones; i++) {

           }





   }
      return worker;
  }





}
