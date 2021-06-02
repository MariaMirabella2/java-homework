package tema5;

public class Card extends BankAccount {
    String expirationDate;
    String ownerName;
    String cardNumber;
    Card(String expiratonDate,String cardNumber, String ownerName ){
        super();
        expiratonDate=this.expirationDate;
        cardNumber=this.cardNumber;
        ownerName=this.ownerName;
    }
}
