package com.position;

/**
 * Created by sergei on 08.07.15.
 */
public class Desiner extends Position {

  public static String dutie ="рисовать макет";

  //40 hour perweek
  public static long standartWorkTime = 40*60*60*1000;
  //start week with 0 hour
  public static long  weekWorkTime = 0;
  // time will be need for a job will be done
  public static long timeforWorkDone = 60*60*1000;


  @Override
  public boolean isHaveTimeforJob() {
    if (standartWorkTime <(weekWorkTime += timeforWorkDone)){
      return true;
    }
    return false;
  }
}
