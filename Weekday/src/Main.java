
        public class Main {
            public static void main(String[] args) {
                System.out.println("Question 1");

                System.out.println("\nIs day a weekday?\n");
                for (DayOfWeek count : DayOfWeek.values()) {
                    System.out.println(count + " - " + DayOfWeek.isWeekDay(count));
                }
                System.out.println("\nIs day a holiday?");
                for (DayOfWeek count : DayOfWeek.values()) {
                    System.out.println(count + " - " + DayOfWeek.isHoliday(count));
                }
                System.out.println("\nQuestion 2" + "\n");
                DayOfWeek sat = DayOfWeek.SATURDAY;
                for (DayOfWeek count : DayOfWeek.values()) {
                    System.out.println(count + " - " + count.compareTo(sat));
                }
            }
        }
