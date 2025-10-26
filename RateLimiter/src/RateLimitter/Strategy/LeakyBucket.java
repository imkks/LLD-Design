package RateLimitter.Strategy;

import java.util.Queue;

public class LeakyBucket  implements RateLimitter{
    int capacity;
    int leakRate;
    // 
    LeakyBucket(){
        this.capacity=3;
        this.leakRate=1;
}


    @Override
    public boolean allowRequest(String user) {

        return false;
    }

    
}
