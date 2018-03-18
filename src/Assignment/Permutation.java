package Assignment;

import java.util.ArrayList;

public class Permutation {

	public ArrayList<ArrayList<Integer>> permute(int[] numbers) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        search(numbers, 0, result);
        return result;
    }
 
    void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
    public void search(int[] numbers, int start,  ArrayList<ArrayList<Integer>> result) {
        if(start == numbers.length - 1) {
            ArrayList<Integer> ArrayList = new ArrayList<>();
            for(int num:numbers) {
                ArrayList.add(num);
            }
            result.add(ArrayList);
            return;
        }
        for(int i = start; i < numbers.length; i++) {
            swap(numbers, start, i);
            search(numbers, start + 1, result);
            swap(numbers, start, i);
        }
    }
 
    public static void main(String[] args) {
		int[] input = {1,2, 3};
        Permutation p=new Permutation();
        System.out.println(p.permute(input));
    }
	
}
