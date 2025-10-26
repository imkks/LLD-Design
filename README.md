# Low Level Design (LLD) Java Repository

This repository contains multiple projects demonstrating Low Level Design (LLD) concepts in Java. Each folder represents a different system or design pattern implementation. Below is an overview of each project:

## Projects

### BookMyShow
A simulation of the BookMyShow ticket booking system. It covers:
- Movie and Theatre management
- Show scheduling
- Seat booking and allocation
- Location-based search
- Core classes: `BookingService`, `Show`, `Movie`, `Theatre`, `Screen`, `Seat`, `Location`

### PaymentGateway
A basic payment gateway implementation. It includes:
- Payment method abstraction
- Payment request/response handling
- Transaction management
- Core classes: `PaymentService`, `PaymentMethod`, `PaymentRequest`, `PaymentResponse`, `Transaction`, `Application`

### RateLimiter
Implements various rate limiting strategies. Useful for controlling API usage and traffic. Strategies include:
- Fixed Window
- Sliding Window
- Sliding Window Counter
- Leaky Bucket
- Token Bucket
- Core classes: `RateLimitterFactory`, `RateLimitter`, and strategy classes under `Strategy/`

## How to Use
Navigate to each project folder for its source code. Each project is self-contained and can be run independently.

---

For more details, see the individual README files in each project folder.
