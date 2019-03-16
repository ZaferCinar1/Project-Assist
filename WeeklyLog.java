/*
 * @author Ersin Sensoy
 * @version  1.0
 * @date 03.05.017
 */
public class WeeklyLog {
	int weekNumber;
	String weekText ="";
	public WeeklyLog(int weekNumber, String weekText){
		this.weekNumber = weekNumber;
		this.weekText = weekText;
	}
	//methods
	/**
	 * sets the text of the WeeklyLog. 
	 */
	public void setText(String text){
		weekText = text;
	}
	/**
	 * @return weekText(WeeklyLog)
	 */
	public String getText(){
		return weekText;
	}
	/**
	 * @return	weekNumber (WeeklyLog)
	 */
	public int getWeekNumber(){
		return weekNumber;
	}
}
