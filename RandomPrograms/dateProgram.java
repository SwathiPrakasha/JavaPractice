package RandomPrograms;
/*This program prints the day - Monday/Tuesday/.... for any given date
 * 
 * input: date. month, year each in new line
 * output: day of that date.
 */
import java.util.*;
public class dateProgram{
	
static String getDay(String dd,String mm,String yyyy){
	Calendar c = Calendar.getInstance();
    c.set(Integer.parseInt(yyyy), Integer.parseInt(mm)-1, Integer.parseInt(dd));
    return(c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase());
}

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String month = in.next();
    String day = in.next();
    String year = in.next(); 
    in.close();
    
    
    System.out.println(getDay(day, month, year));
}
}