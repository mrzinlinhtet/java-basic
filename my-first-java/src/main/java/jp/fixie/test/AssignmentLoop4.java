package jp.fixie.test;

public class AssignmentLoop4 {
	
	// ループ文
	// 小問4
	
	public static void main(String[] args) {
		System.out.println("ループ-小問4");
		 // Declare variable and set value 
        int result = 500;
		 // Declare variable and set value 
        int substract = 101;
        // Output result
        System.out.println("result-初期値 : " + result);
        // Repeat the process using a while(true) loop
        while (result > 0) {
            // Subtract and update
            result -= substract;
            // Output result
            System.out.println("result-減算 : " + result);
        }
	}
}
