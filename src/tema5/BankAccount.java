package tema5;

import java.awt.image.BaseMultiResolutionImage;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private String iban;
    private Integer balance;
    private List<String> attachedCardNumbers= new ArrayList<>();
    BankAccount(String iban){
        this.iban = iban;
    }

    public BankAccount() {

    }

    void addMoney(Integer amount){
        this.balance+=amount;
        System.out.println("Your current balance is "+balance);
    }
    int withdrawMoney(Integer amount){
        if(this.balance>amount) {
            this.balance -= amount;
            return 0;
        }
        else {
            System.out.println("Your current balance is "+balance);
            return -1;
        }
    }
    void attachCard(String cardNumber){
        attachedCardNumbers.add(cardNumber);
    }

}
