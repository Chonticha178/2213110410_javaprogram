import javax.swing.*;
public class Lab605 {

	public static void main(String[] args) {
		int number[] = new int[5];
		for(int i=0;i<number.length;i++) {
		 number[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number "+(i+1)+" :"));
		}
		showEven(number);
		showOdd(number);
	}
	public static void showEven(int[] nums) {
		String even = "";
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0) {
				even+=nums[i]+" ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of even number: "+"\n"+even);
	}
	public static void showOdd(int[] nums) {
		String odd="";
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2!=0) {
				odd+=nums[i]+" ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of even number: "+"\n"+odd);
	}
}
