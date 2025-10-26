# RateLimiter LLD

This module demonstrates various rate limiting strategies for APIs and services. It includes:

- **Fixed Window**
- **Sliding Window**
- **Sliding Window Counter**
- **Leaky Bucket**
- **Token Bucket**

## Main Classes
- `RateLimitterFactory`: Factory for creating rate limiter instances.
- `RateLimitter`: Base interface/class for rate limiters.
- Strategy classes: Implementations under `Strategy/` folder.
- `Main`: Entry point for running rate limiter simulations.

## Usage
Run `Main.java` to test different rate limiting strategies. Extend or modify strategies to experiment with LLD concepts.
