import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        CreditCard card = CreditCard.build().holderName("Rami").bankAccountNumber("123456798")
                .number("45800000444411112222").cvv("123").company(CreditCardCompany.Visa)
                .expirationDate(LocalDate.of(2026,12,1));
        System.out.println(card);


        //CreditCard card = new CreditCard(holderName:"Rami", cvv:"123", company:CreditCardCompany.Visa) //in typescript, python.... Not in Java
    }
}
