package homework_nr_5;

public enum Weekday {
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
    public boolean IsWeekday(){
        boolean a = false;
        switch (this){
            case Monday:
            case Tuesday:
            case Wednesday:
            case Thursday:
            case Friday:
                a = true;
                break;
            case Sunday:
            case Saturday:
        }
    return a;
    }
    public boolean IsHoliday(){
        boolean a = false;
        switch (this){
            case Monday:
            case Tuesday:
            case Wednesday:
            case Thursday:
            case Friday:
                break;
            case Saturday:
            case Sunday:
                a = true;
        }
        return a;
    }
}
