package leet.exercises.exercise1;

public class TwoSum {

    public int[] sum(int[] patito23, int target){
        for (int i = 0; i < patito23.length; i++) {
            for (int j = 0; j < patito23.length; j++) {
                if (patito23[i] + patito23[j] == target){
                    return new int[] {i, j};
                }
                
            }
            
        }
        return new int[] {};
    }

}
