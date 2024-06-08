package jp.fixie.test;

public class AssignmentLoop5 {
	
	// ループ文
	// 小問5

	public static void main(String[] args) {
		System.out.println("ループ-小問5");
		 // Declare variable and set value 
        int result2 = 500;
		 // Declare variable and set value 
        int substract2 = 101;
        // Output result2
        System.out.println("result2-初期値 : " + result2);
        // Repeat the process using a while(true) loop
        while (true) {
            // Check condition and exit the loop if false
            if (result2 - substract2 < 0) {
                break;
            }
            // Subtract and update
            result2 -= substract2;
            // Output result2
            System.out.println("result2-減算 : " + result2);
        }
        // Output result2
        System.out.println("result2-結果 : " + result2);
    }
}
