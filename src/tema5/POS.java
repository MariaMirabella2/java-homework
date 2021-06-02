package tema5;

import java.util.ArrayList;
import java.util.List;

public class POS {
    private List <BankAccount> bankAccounts= new ArrayList<>();
    void addKnownBankAccount(BankAccount bankAccount){
        bankAccounts.add(bankAccount);
    }
    void pay(int amount, Card card) {
        if (card.withdrawMoney(amount) == 0)
            System.out.println("The transaction was successful!");
        else
            System.out.println("Transaction unsuccessful!");
    }
}
