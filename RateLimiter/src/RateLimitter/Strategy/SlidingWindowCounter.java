package RateLimitter.Strategy;

import java.util.HashMap;
import java.util.Map;

public class SlidingWindowCounter implements RateLimitter {
    int capacity;
    Map<String,Integer> previousWindowCount;
   Map<String,Integer>  currentWindowCount;
    long windowLength;
    long startTime;
    // int
   public SlidingWindowCounter()
    {
        capacity=3;
        windowLength=5;
        startTime=System.currentTimeMillis();
        previousWindowCount=new HashMap<>();
        currentWindowCount=new HashMap<>();

    }
    

    @Override
    public boolean allowRequest(String user) {
        long reqestTime=System.currentTimeMillis();
        long elapsedTime=reqestTime-startTime;
        if(elapsedTime>=windowLength)
        {
            previousWindowCount=currentWindowCount;
            currentWindowCount=new HashMap<>();
            startTime=(reqestTime/windowLength)*windowLength;
        elapsedTime=reqestTime-startTime;

        }
          long token= (int) 
          (1.0-(1.0*elapsedTime/windowLength))*
          previousWindowCount.getOrDefault(user, 0)+
          currentWindowCount.getOrDefault(user, 0);
           if(token<capacity)
           {
            currentWindowCount.put(user, currentWindowCount.getOrDefault(user, 0)+1);
            return true;
           }
        
        return false;
    }
    
}
