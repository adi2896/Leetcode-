/*Angle Between Hands of a Clock
Given two numbers, hour and minutes. Return the smaller angle (in sexagesimal units) formed between the hour and the minute hand.
Input: hour = 12, minutes = 30
Output: 165
Input: hour = 4, minutes = 50
Output: 155
*/

class Solution {
    public double angleClock(int hour, int minutes) 
    {
        double hourAngle, minAngle, angle;
        hourAngle = 30*hour+0.5*minutes;
        minAngle = 6*minutes;
        angle = Math.abs(hourAngle-minAngle);
        if(angle>180)
            return (360-angle);
        else
            return angle;
    }
}