# Function Hall Booking System

A beginner-friendly Java Full-Stack project using Spring Boot, MySQL, JPA, HTML, CSS and JavaScript.

## Features
- Browse/search function halls
- Hall capacity, facilities and pricing
- Date availability check
- Customer booking
- Booking lookup by email
- Booking cancellation
- Test payment status and transaction reference
- REST APIs
- MySQL persistence
- Sample data
- Ready for extension with authentication, admin dashboard, email/SMS and a real payment gateway

## Tech Stack
Java 17, Spring Boot, Spring Web, Spring Data JPA, MySQL, Maven, HTML, CSS, JavaScript.

## Run
1. Install JDK 17+, Maven and MySQL.
2. Put your MySQL password in `src/main/resources/application.properties`.
3. Run:
   `mvn spring-boot:run`
4. Open: http://localhost:8080

## API examples
GET `/api/halls`
GET `/api/halls/search?location=Tirupati`
GET `/api/bookings/availability?hallId=1&date=2026-10-15`
POST `/api/bookings`
POST `/api/bookings/{id}/test-payment`
DELETE `/api/bookings/{id}`

## Payment note
The included payment action is a TEST payment simulation. Never store card numbers, CVV, UPI PINs or other sensitive payment credentials in your database. For production, integrate a PCI-compliant payment provider's hosted/secure checkout and store only safe transaction metadata.

## Suggested future modules
Authentication/roles, admin dashboard, hall images, multiple time slots, invoices/PDF, email notifications, coupons, reviews, real payment gateway, reports and deployment.
