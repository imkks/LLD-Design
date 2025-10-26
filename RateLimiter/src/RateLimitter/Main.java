package RateLimitter;

import RateLimitter.Strategy.RateLimitter;

// import RateLimitter.Strategy.Fixwindow;

public class Main {
    public static void main(String[] args) throws InterruptedException{
         RateLimitter limiter = RateLimitterFactory.createLimitter("fixedwindow");

        for (int i = 0; i < 10; i++) {
            if (limiter.allowRequest("krishna")) {
                System.out.println("✅ Request " + i + " allowed");
            } else {
                System.out.println("❌ Request " + i + " rejected");
            }
            Thread.sleep(800);
        }
    }
}