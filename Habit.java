package application;

import java.util.ArrayList;
import java.util.List;

public class Habit {
	private String habit;
	private boolean[] daysOfWeek;
	private int goal;
	private int[] status;

	/**
	 * 
	 * @param habit  - the string of the habit that needs to be done
	 * @param goal   - the amount of days per week that the user is trying to get
	 *               the habit done
	 * @param dOW    - the days of the week that the user has set
	 * @param status - an int array where the index represents the days and Habit
	 *               where 0 = missed, 1 = completed, 2 = still to come
	 */
	public Habit(String habit, int goal, boolean[] dOW, int[] status) {
		this.habit = habit;
		this.goal = goal;
		this.daysOfWeek = dOW;
		this.status = status;
	}

	/**
	 * editgoal - edits the goal of a certain habit
	 * 
	 * @param hab     - the habit you want to change
	 * @param newGoal - the new int value you want to change goal to
	 */
	public void editGoal(int newGoal) {
		this.goal = newGoal;
	}

	/**
	 * editDaysOfWeek - edits the days of the week
	 * 
	 * @param hab     - the habit you want to change
	 * @param newGoal - the days of the week that the habit should be done
	 */
	public void editDaysOfWeek(boolean[] days) {
		this.daysOfWeek = days;
	}

	public void editStatus(int[] status) {
		this.status = status;
	}

	public String getHabit() {
		return this.habit;
	}

	public boolean[] getDays() {
		return daysOfWeek;
	}

	public int getGoal() {
		return this.goal;
	}

	public int[] getStatus() {
		return status;
	}

	/**
	 * getHabitInfo() - returns the habit information in a array format.
	 * 
	 * @return an array where the first value is the habit, the second value is the
	 *         days of the week, and the last value is goals
	 */
	public String[] getHabitInfo() {
		String[] info = new String[4];
		String days = booleanArrToString(daysOfWeek);
		String weeklyStatus = intArrToString(status);
		
		info[0] = habit;
		info[1] = String.valueOf(goal);
		info[2] = days;
		info[3] = weeklyStatus;

		return info;
	}

	public String toString() {
		return "Habit: " + habit + " | Days of the week: " + getHabitInfo()[2] + " | Goal: " + goal;
	}

	private String booleanArrToString(boolean[] bArr) {
		String s = "";

		for (int i = 0; i < 7; i++) {

			if (bArr[i] == true) {
				s += "1";
			} else {
				s += "0";
			}
		}
		return s;
	}

	private String intArrToString(int[] iArr) {
		String s = "";

		for (int i = 0; i < 7; i++) {
			s += iArr[i];
		}
		return s;
	}

}