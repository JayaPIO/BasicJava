package Week4Day4;

import java.sql.*;
import java.util.Scanner;

public class Transaction {
    private static final String url = "jdbc:mysql://localhost:3306/jdbcDemo";
    private static final String username = "root";
    private static final String password = "123.com";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);

            connection.setAutoCommit(false);
            String debitQuery = "update accountsTable set balance = balance - ? where accountNo = ?";
            String creeditQuery = "update accountsTable set balance = balance + ? where accountNo = ? ";

            PreparedStatement debitStatement = connection.prepareStatement(debitQuery);
            PreparedStatement creditStatement = connection.prepareStatement(creeditQuery);

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter debit account number: ");
            int debitAcc = sc.nextInt();
            System.out.println("Enter credit account number: ");
            int creditAcc = sc.nextInt();
            System.out.println("Enter amount for transaction: ");
            double amount = sc.nextDouble();

            debitStatement.setDouble(1, amount);
            debitStatement.setInt(2, debitAcc);

            creditStatement.setDouble(1, amount);
            creditStatement.setInt(2, creditAcc);

            debitStatement.executeUpdate();
            creditStatement.executeUpdate();

            String query = "select balance from accountsTable where accountNo = ?";
            PreparedStatement balaceQuery = connection.prepareStatement(query);

            balaceQuery.setInt(1, debitAcc);

            ResultSet resultSet = balaceQuery.executeQuery();


            while (resultSet.next()) {
                double currentBalance = resultSet.getDouble("balance");
                if (isSufficient(amount, currentBalance)) {
                    connection.commit();
                } else {
                    connection.rollback();
                }
            }

            debitStatement.close();
            creditStatement.close();
            resultSet.close();
            sc.close();
            connection.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

    }

    public static boolean isSufficient(double amount, double balance) {

        if (balance > amount) {
            return true;
        } else {
            return false;
        }

    }
}
