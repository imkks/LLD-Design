package RateLimitter.Strategy;

import java.util.HashMap;
import java.util.Map;

public class FixedWindow implements RateLimitter{
    int capacity;
    int window;
    long windowStart=System.currentTimeMillis();
    Map<String,Integer> requestCount;
    public FixedWindow()
    {
        capacity=3;
        window=4000;
        requestCount= new HashMap<>();
    }

    @Override
    public boolean allowRequest(String user) {
        long currentTimeMillis=System.currentTimeMillis();
        if(currentTimeMillis-windowStart<=window)
        {
            if(requestCount.getOrDefault(user,0)<capacity)
            {
                requestCount.put(user, requestCount.getOrDefault(user,0)+1);
                return true;
            }
            

        }
        else
        {
            windowStart=currentTimeMillis;
            requestCount= new HashMap<>();
            requestCount.put(user, 1);
            return true;
        }

        return false;  
      }

    
}
