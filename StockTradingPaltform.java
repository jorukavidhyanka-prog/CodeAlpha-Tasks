import java.util.HashMap;
import java.util.Map;

public class StockTradingApp {

    static double balance = 10000;
    static Map<String, Integer> portfolio = new HashMap<>();

    public static void buyStock(String symbol, int quantity, double price) {
        double cost = quantity * price;

        if (cost > balance) {
            System.out.println("Insufficient balance!");
            return;
        }

        balance -= cost;
        portfolio.put(symbol, portfolio.getOrDefault(symbol, 0) + quantity);

        System.out.println("Bought " + quantity + " shares of " + symbol);
    }

    public static void sellStock(String symbol, int quantity, double price) {
        int owned = portfolio.getOrDefault(symbol, 0);

        if (owned < quantity) {
            System.out.println("Not enough shares to sell!");
            return;
        }

        balance += quantity * price;
        portfolio.put(symbol, owned - quantity);

        System.out.println("Sold " + quantity + " shares of " + symbol);
    }

    public static void showPortfolio() {
        System.out.println("\nPortfolio:");
        for (String stock : portfolio.keySet()) {
            System.out.println(stock + " : " + portfolio.get(stock) + " shares");
        }
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {

        buyStock("AAPL", 10, 180);
        buyStock("GOOG", 5, 140);

        showPortfolio();

        sellStock("AAPL", 5, 180);

        showPortfolio();
    }
}