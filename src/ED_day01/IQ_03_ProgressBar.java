package ED_day01;
/*
 * You are writing a program using an image processing library. 
 *Calling methods of this library 
can take quite a long time, so for the benefit of your users
you want to let them know what percentage of the task is already done. 
The library you're using has a getProgress() method to help you with this.
​
However, for some reason this method doesn't simply return a percentage of the task done. 
Instead it returns a "progress bar" - a string which consists of parts.
​
The left part of the bar is filled with the same character and represents the part of the task 
which is completed.
The right part of the bar is also filled with the same character 
(different from the character used for the left part of the bar) and
represents the part of the task which is yet to be done. 
​
Both parts of the bar have non-zero length.
Besides, the method uses different pairs of characters to generate the bar.
​
Evidently, this way of representing progress is not usable, so you have to convert it to 
a more useful form.
The input data consists of a single string. The length of the string is between 2 and 10 
characters, inclusive.
The string consists of two parts, each part filled with one character. The string doesn't 
contain any whitespace characters.
Output the percentage of the task which is already completed, as an integer (rounded down).
​
Example
input
XX--
output
50
​
input
0.....
output
16
 */

public class IQ_03_ProgressBar {

	public static void main(String[] args) {

		String input1 = "XX--";
		
		String input2 = "0.....";
		
		System.out.println("output\n"+getProgress(input1));
		
		System.out.println("output\n"+getProgress(input2));

}

	private static int getProgress(String input) {
		String done = input.substring(0, 1);
		
		int numOfDone=0;
		for(int i=0; i<input.length();i++) {
			if(input.substring(i, i+1).equals(done)) {
				numOfDone++;
			}
		}
		int percentageOfDone = numOfDone*100/input.length();
		return percentageOfDone;
	}

}