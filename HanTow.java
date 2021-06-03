package towers;

import java.util.ArrayList;
import java.util.Arrays;

public class HanTow {
	
	public ArrayList<Integer> a1 = new ArrayList<Integer>(Arrays.asList(8,7,6,5,4,3,2,1));
	public ArrayList<Integer> a2 = new ArrayList<Integer>();
	public ArrayList<Integer> a3 = new ArrayList<Integer>();
	
	public void printTowers() {
		System.out.println("Tower 1: " + a1);
		System.out.println("Tower 2: " + a2);
		System.out.println("Tower 3: " + a3);
		System.out.println("\n");
	}
	
	public void moveDisc(ArrayList<Integer> from, ArrayList<Integer> to) {
		int disc = from.get(from.size() - 1);
		to.add(disc);
		from.remove(from.size() - 1);
	}
	
	public void HanoiTowers(int n, ArrayList<Integer> source, ArrayList<Integer> target, ArrayList<Integer> other) {
		if(n > 1) {
			HanoiTowers(n-1, source, other, target);
			moveDisc(source, target);
			HanoiTowers(n-1, other, target, source);
		}
	}

	public static void main(String[] args) {
		HanTow ht = new HanTow();
		ht.printTowers();
		ht.HanoiTowers(ht.a1.size()+1, ht.a1, ht.a3, ht.a2);
		ht.printTowers();

	}

}
