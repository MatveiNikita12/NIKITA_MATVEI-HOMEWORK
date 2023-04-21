package homework_nr_5;

public enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    public boolean IsWeekday(){
        boolean a = false;
        switch (this){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                a = true;
                break;
            case SUNDAY:
            case SATURDAY:
        }
    return a;
    }
    public boolean IsHoliday(){
        boolean a = false;
        switch (this){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                break;
            case SATURDAY:
            case SUNDAY:
                a = true;
        }
        return a;
    }
}
