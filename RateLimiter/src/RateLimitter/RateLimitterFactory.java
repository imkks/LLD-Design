package RateLimitter;

import RateLimitter.Strategy.FixedWindow;
import RateLimitter.Strategy.RateLimitter;
import RateLimitter.Strategy.SlidingWindow;
import RateLimitter.Strategy.SlidingWindowCounter;
import RateLimitter.Strategy.TokenBucket;

public class RateLimitterFactory {
    public static RateLimitter createLimitter(String type)
    {
       return switch (type.toLowerCase()) {
            case "fixedwindow"->new FixedWindow();
            case "tokenbucket"->new TokenBucket();
            case "slidingwindow"->new SlidingWindow();
            case "slidingwindowcounter"->new SlidingWindowCounter();
            default -> throw new IllegalArgumentException();
            
       };
    }
}
