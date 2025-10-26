package RateLimitter.Strategy;

import java.util.HashMap;
import java.util.Map;

public class TokenBucket implements RateLimitter {
    int refil;
    int capacity;
    Map<String,Integer> token;
    Map<String,Long> lastRequest;
    public TokenBucket()
    {
        refil=2;
        capacity=3;
        token=new HashMap<>();
        lastRequest=new HashMap<>();
    }

    @Override
    public boolean allowRequest(String user) {
        long currentTimeMillis=System.currentTimeMillis();
        if(token.containsKey(user))
        {
        int elapsedTime= (int)((currentTimeMillis-lastRequest.get(user))/1000);
          token.put(user, Math.min(token.get(user)+elapsedTime*refil,capacity));
          if(token.get(user)>0)
          {
            token.put(user, token.get(user)-1);
          lastRequest.put(user, currentTimeMillis);

            return true;
          }

        }
        else
        {
            token.put(user, capacity-1);
            lastRequest.put(user, currentTimeMillis);
            return true;

        }
        return false;
    }
    
    
}
