package src.hackerrank.all;

public class CountingValleys {

    public static void main(String[] args) {
        String input = "UDDDUDUU";
        countingValleys(input.length(), input);
    }

    private static int countingValleys(int n, String s) {
        char[] steps = s.toCharArray();
        int baseLevel = 0;
        int currentLevel = 0;
        int countedValleys = 0;

        for (char step : steps) {

            // check if it's step into valley
            if (step == 'D' && currentLevel == baseLevel) {
                countedValleys++;
            }

            // update current level state
            if (step == 'U') {
                currentLevel++;
            } else {
                currentLevel--;
            }
        }

        return countedValleys;
    }
}

//    Gary is an avid hiker. He tracks his hikes meticulously, paying close attention to small details like topography.
//    During his last hike he took exactly  steps. For every step he took, he noted if it was an uphill, , or a downhill,  step.
//    Gary's hikes start and end at sea level and each step up or down represents a  unit change in altitude. We define the following terms:
//
//        A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level.
//        A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.
//        Given Gary's sequence of up and down steps during his last hike, find and print the number of valleys he walked through.
//
//        For example, if Gary's path is , he first enters a valley  units deep. Then he climbs out an up onto a mountain  units high. Finally, he returns to sea level and ends his hike.
//
//        Function Description
//
//        Complete the countingValleys function in the editor below. It must return an integer that denotes the number of valleys Gary traversed.
//
//        countingValleys has the following parameter(s):
//
//        n: the number of steps Gary takes
//        s: a string describing his path
