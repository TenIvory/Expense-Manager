package com.example.expensemanager;

import org.checkerframework.checker.units.qual.A;

public class TransactionModel {
    private String ID,Notes,Amount,Type, Date;

    //Constructor
    public TransactionModel (String ID,String Notes, String Amount,String Type, String Date) {
        this.ID = ID;
        this.Notes = Notes;
        this.Amount = Amount;
        this.Type = Type;
        this.Date = Date;

    }

    //Getters and Setters
    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setNotes(String Notes){
        this.Notes = Notes;
    }

    public String getNotes() {
        return Notes;
    }

    public void setAmount(String Amount) {
        this.Amount = Amount;
    }

    public String getAmount(){
        return Amount;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getType(){
        return Type;
    }

    public void setDate(String Date){
        this.Date = Date;
    }

    public String getDate(){
        return Date;
    }


}
