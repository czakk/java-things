package com.company.z2;

public class InsufficientFundsException extends RuntimeException{

    public InsufficientFundsException(int funds){
        super(String.format("Nie możesz wypłacić %d, ponieważ nie masz tyle na koncie!", funds));
    }
}
