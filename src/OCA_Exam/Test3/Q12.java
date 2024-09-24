package OCA_Exam.Test3;

public class Q12 {

	public static void main(String[] args) {
		String[] strs = new String[3];
		int idx = 0;
		for (String s : strs) {
			strs[idx].concat(" element " + idx);
			idx++;
		}
		for(idx = 0;idx<strs.length;idx++) {
			System.out.println(strs[idx]);
		}

	}

}
