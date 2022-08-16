package com.example.myproject.services;

public class DailyReport {
    private int reportID;
    private int todayReg;
    private int todayOutDated;
    private int female;
    private int male;

    public DailyReport(int reportID, int todayReg, int todayOutDated, int female, int male) {
        this.reportID = reportID;
        this.todayReg = todayReg;
        this.todayOutDated = todayOutDated;
        this.female = female;
        this.male = male;
    }

    public int getReportID() {
        return reportID;
    }

    public void setReportID(int reportID) {
        this.reportID = reportID;
    }

    public int getTodayReg() {
        return todayReg;
    }

    public void setTodayReg(int todayReg) {
        this.todayReg = todayReg;
    }

    public int getTodayOutDated() {
        return todayOutDated;
    }

    public void setTodayOutDated(int todayOutDated) {
        this.todayOutDated = todayOutDated;
    }

    public int getFemale() {
        return female;
    }

    public void setFemale(int female) {
        this.female = female;
    }

    public int getMale() {
        return male;
    }

    public void setMale(int male) {
        this.male = male;
    }

    @Override
    public String toString() {
        return "DailyReport{" +
                "reportID=" + reportID +
                ", todayReg=" + todayReg +
                ", todayOutDated=" + todayOutDated +
                ", female=" + female +
                ", male=" + male +
                '}';
    }
}
