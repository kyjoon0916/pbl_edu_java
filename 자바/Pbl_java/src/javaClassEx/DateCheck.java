package javaClassEx;

    class DateCheck {
    private int day;
    private int month;
    private int year;
    private boolean isValid;
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        if()
        
        this.day = day;
    }
    public int getMonth() {
       return month;
    }
    public void setMonth(int month) {
        if(month<1||month>12){
            isValid =false;
            return;
        }
        else
            isValid = true;
        this.month = month;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void showDate(int day, int month, int year){
            
        System.out.println(year+"년"+month+"월"+day+"일");
    }
}

