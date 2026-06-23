/**
 * This program is a basic budget calculator
 * @author thekhaleed
 * @version 1.1 2026-June-23
 */

public class BudgetCalculator {
    public static void main(String[]args){
        double monthlyIncome = 25000;
        double rent = 12000;
        double food = 8000;
        double transport = 1000;
        double entertainment = 250;

        double totalExpenses = rent + food + transport + entertainment;
        double remainingMoney = monthlyIncome - totalExpenses;
        double percentageOfIncomeRemaining = remainingMoney/monthlyIncome * 100;

        System.out.println("Total Expenses:" + totalExpenses);
        System.out.println("Remaining Money:" + remainingMoney);
        System.out.println("Percentage Remaining:" + percentageOfIncomeRemaining + "%");

    }
}
