package com.company.easy;

public class E197_RisingTemperature {


    //  MYSQL
//      Select w2.id
//      from weather as w1, weather as w2
//      where w1.temperature < w2.temperature AND w1.recordDate = w2.recordDate - INTERVAL 1 DAY;


        // ORACLE SOLUTION
//      SELECT w2.Id as Id
//      FROM Weather w1, Weather w2
//      WHERE w2.Temperature > w1.Temperature AND
//      TRUNC(w2.RecordDate) - TRUNC(w1.RecordDate) = 1
}

