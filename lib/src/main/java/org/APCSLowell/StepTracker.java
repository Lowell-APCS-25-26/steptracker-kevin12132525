package org.APCSLowell;

public class StepTracker {
    private int minimum;
    private int totalSteps;
    private int numDays;
    private int numActiveDays;
    
    public StepTracker(int activityThreshold) {
        minimum = activityThreshold;
        totalSteps = 0;
        numDays = 0;
        numActiveDays = 0;
    }
    
    public void addDailySteps(int stepCount) {
        totalSteps += stepCount;
        numDays++;
        if (stepCount >= minimum) {
            numActiveDays++;
        }
    }
    
    public int activeDays() {
        return numActiveDays;
    }
    
    public double averageSteps() {
        if (numDays == 0) {
            return 0;
        }
        return (double) totalSteps / numDays;
    }
}
