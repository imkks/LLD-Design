package RateLimitter.Strategy;

public interface RateLimitter {
    boolean allowRequest(String user);
    
}
