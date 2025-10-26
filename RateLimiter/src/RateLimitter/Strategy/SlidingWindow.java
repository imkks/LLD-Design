package RateLimitter.Strategy;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class SlidingWindow implements RateLimitter{
    long timeWindow;
    int capacity;
    Map<String,Queue<Long>> logs;
   public SlidingWindow()
    {
        capacity=5;
        timeWindow=2000;
        logs=new HashMap<>();
    }

    @Override
    public boolean allowRequest(String user) {
        long currentTimeMillis=System.currentTimeMillis();
        if(logs.containsKey(user))
        {
           var requests=logs.get(user);
            while(!requests.isEmpty() && currentTimeMillis-requests.peek()>=timeWindow)
                requests.poll();
            if(requests.size()<capacity)
            {
                requests.add(currentTimeMillis);
                return true;
            }

        }
        else
        {
            logs.put(user,new LinkedList<>());
            logs.get(user).add(currentTimeMillis);
            return true;

        }
        return false;
    }
    
}
