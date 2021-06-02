package tema5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class User {
    private List<Card> cards= new ArrayList<>();
    private List<BankAccount> bankAccounts= new ArrayList<>();

    public User(List<Card> cards, List<BankAccount> bankAccounts) {
        this.cards = cards;
        this.bankAccounts = bankAccounts;
    }

    void addCard(Card x) {
        cards.add(x);

    }
    void addBankAccount(BankAccount y){
        bankAccounts.add(y);
    }
}
