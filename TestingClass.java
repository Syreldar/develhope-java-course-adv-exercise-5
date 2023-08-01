public class TestingClass
{
    public enum Month
    {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }

    public static void main(String[] args)
    {
        for (Month month : Month.values())
        {
            String message = month.name().endsWith("Y") ? "ends with y" : "doesn't end with y";
            System.out.printf("%s %s\n", month.name(), message);
        }
    }
}
