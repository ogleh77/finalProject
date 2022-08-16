package com.example.finalproject.actors;

public class Loan {
    private int loanId;
    private String whoGave;
    private String whoTake;
    private String sentBy;
    private String phone;
    private String date;

    public Loan(int loanId, String whoGave, String whoTake, String sentBy, String phone, String date) {
        this.loanId = loanId;
        this.whoGave = whoGave;
        this.whoTake = whoTake;
        this.sentBy = sentBy;
        this.phone = phone;
        this.date = date;
    }

    public Loan(int loanId, String whoGave, String whoTake, String sentBy, String phone) {
        this.loanId = loanId;
        this.whoGave = whoGave;
        this.whoTake = whoTake;
        this.sentBy = sentBy;
        this.phone = phone;
    }

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public String getWhoGave() {
        return whoGave;
    }

    public void setWhoGave(String whoGave) {
        this.whoGave = whoGave;
    }

    public String getWhoTake() {
        return whoTake;
    }

    public void setWhoTake(String whoTake) {
        this.whoTake = whoTake;
    }

    public String getSentBy() {
        return sentBy;
    }

    public void setSentBy(String sentBy) {
        this.sentBy = sentBy;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "loanId=" + loanId +
                ", whoGave='" + whoGave + '\'' +
                ", whoTake='" + whoTake + '\'' +
                ", sentBy='" + sentBy + '\'' +
                ", phone='" + phone + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
