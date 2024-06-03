import java.time.LocalDate;

public class CreditCard {
    private String holderName;
    private String number;
    private String cvv;
    private LocalDate expirationDate;
    private CreditCardCompany company;
    private String bankAccountNumber;

    private CreditCard(){}
    public static CreditCard build()
    {
        return new CreditCard();
    }

    public CreditCard holderName(String name)
    {
        this.holderName = name;
        return this;
    }

    public CreditCard number(String number)
    {
        this.number = number;
        return this;
    }

    public CreditCard cvv(String cvv)
    {
        this.cvv = cvv;
        return this;
    }

    public CreditCard expirationDate(LocalDate expirationDate)
    {
        this.expirationDate = expirationDate;
        return this;
    }

    public CreditCard company(CreditCardCompany company)
    {
        this.company = company;
        return this;
    }

    public CreditCard bankAccountNumber(String bankAccountNumber)
    {
        this.bankAccountNumber = bankAccountNumber;
        return this;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "holderName='" + holderName + '\'' +
                ", number='" + number + '\'' +
                ", cvv='" + cvv + '\'' +
                ", expirationDate=" + expirationDate +
                ", company=" + company +
                ", bankAccountNumber='" + bankAccountNumber + '\'' +
                '}';
    }
}
