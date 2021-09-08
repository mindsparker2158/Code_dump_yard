import java.util.Calendar;

public class Index {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println("Current Date and Time is  : ");
        System.out.format("%tB %te, %tY%n", cal, cal, cal);

            System.out.format("%tl:%tM %tp%n", cal, cal, cal);

      }
    }


