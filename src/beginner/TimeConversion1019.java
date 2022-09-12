/**
 * Title: Time Conversion
 * 
 * @author Joao Victor dos Santos
 * Date (dd/mm/yyyy): 12/09/2022
 * 
 * Description: Read an integer value, which is the duration in seconds of a certain event in a factory, and 
 * 			inform it expressed in hours:minutes:seconds.
 *
 */

package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimeConversion1019 {
	public static void main(String[] args) throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		
		int seconds = Integer.parseInt(in.readLine());
		
		int hours = seconds/3600;
		int minutes = (seconds/60)%60;
		seconds %= 60;
		
		String print = String.format("%d:%d:%d", hours, minutes, seconds);
		System.out.println(print);
	}
}
