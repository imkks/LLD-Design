# PaymentGateway LLD

This module implements a basic payment gateway system. It demonstrates:

- **Payment Methods**: Abstraction for different payment types.
- **Payment Requests/Responses**: Handling payment initiation and results.
- **Transaction Management**: Track and manage payment transactions.
- **Service Layer**: Orchestrates payment processing.

## Main Classes
- `PaymentService`: Main service for processing payments.
- `PaymentMethod`: Interface for payment types.
- `PaymentRequest` / `PaymentResponse`: Data transfer objects.
- `Transaction`: Represents a payment transaction.
- `Application`: Entry point for running the payment simulation.

## Usage
Run `Application.java` to simulate payment flows. Extend classes to add new payment methods or features.
