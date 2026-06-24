# Stock Trading Application

## Overview
This is a simple Java-based Stock Trading Application that allows users to buy and sell stocks, manage their portfolio, and track their account balance.

## Features
- Buy stocks
- Sell stocks
- View portfolio
- Check account balance
- Simple console-based interface

## Technologies Used
- Java
- HashMap Collection Framework

## How It Works
1. The user starts with an initial balance of $10,000.
2. Stocks can be purchased if sufficient funds are available.
3. Stocks can be sold if the user owns enough shares.
4. The portfolio and balance are updated after each transaction.

## Project Structure

```text
StockTradingApp.java
```

## Running the Application

### Compile

```bash
javac StockTradingApp.java
```

### Run

```bash
java StockTradingApp
```

## Example Output

```text
Bought 10 shares of AAPL
Bought 5 shares of GOOG

Portfolio:
AAPL : 10 shares
GOOG : 5 shares
Balance: $7500.0

Sold 5 shares of AAPL

Portfolio:
AAPL : 5 shares
GOOG : 5 shares
Balance: $8400.0
```

## Future Enhancements
- User login and authentication
- Real-time stock prices
- Database integration
- Transaction history
- Graphical User Interface (GUI)
- REST API using Spring Boot

## Author
Developed as a simple Java stock trading mini-project for learning object-oriented programming and collections.