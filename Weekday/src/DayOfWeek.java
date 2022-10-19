

public enum DayOfWeek {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;




    public static boolean isWeekDay(DayOfWeek dayOfWeek) {
        if (dayOfWeek.equals(SATURDAY) || dayOfWeek.equals(SUNDAY)) {
            return false;
        } else {

            return true;

        }
    }

    static boolean isHoliday(DayOfWeek dayOfWeek) {
        if (!isWeekDay(dayOfWeek)) {

            return true;
        } else {
            return false;
        }
    }

}
