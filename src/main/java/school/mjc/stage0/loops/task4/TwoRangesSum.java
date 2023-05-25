package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int skippedSum = lastInRow, countedSum = 0;
        if(numberToSkip > lastInRow && lastInRow > 0) {
                System.out.println("number to skip is bigger then the last");
                return;
            }
            else if(lastInRow < 0){
                System.out.println("last number in row is negative");
                return;
            }
        else{
            for(int i = 1; i < lastInRow; i++){ 
             if(i == numberToSkip){
                    skippedSum += i;
                    continue;
                }
                else
                    countedSum += i;
            }
        }
        System.out.println("skipped sum is " + skippedSum);
        System.out.println("counted sum is " + countedSum);
    }
}
