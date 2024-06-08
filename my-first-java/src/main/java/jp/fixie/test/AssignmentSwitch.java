package jp.fixie.test;

import java.util.Scanner;

public class AssignmentSwitch {
    
    public static void main(String[] args) {
    	System.out.println("switch文-小問1");
        // Create variable [input] of String type to store value
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        // Control flow using a switch statement
        switch (input) {
            case "Java研修":
                System.out.println("がんばれ！");
                break;
            case "Java":
                System.out.println("hello, world");
                break;
            case "研修":
                System.out.println("world");
                break;
            default:
                System.out.println("不正な値です");
                break;
        }
        // Close scanner
        scanner.close();
    }
}
