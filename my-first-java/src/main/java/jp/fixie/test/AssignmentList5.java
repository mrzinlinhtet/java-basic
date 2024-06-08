package jp.fixie.test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AssignmentList5 {
	
	// 大問4	 - java.util.List
	// 小問5
	
	public static void main(String[] args) {
		System.out.println("リスト-小問5");
        // Declare and initialize linkedList1
        List<String> linkedList1 = new LinkedList<>();
        // Insert "Java" at the end of linkedList1
        linkedList1.addLast("Java");
        // Insert "研修" at the end of linkedList1
        linkedList1.addLast("研修");
        // Insert "リスト" into the second element of linkedList1
        linkedList1.add(1, "リスト");
        // Output the value of linkedList1
        System.out.println("linkedList1 = " + linkedList1);
        // Declare and initialize linkedList2
        List<String> linkedList2 = new LinkedList<>();
        // Insert "コレクション" into linkedList2 at the end
        linkedList2.addLast("コレクション");
        // Insert all elements of linkedList1 at the end of linkedList2
        linkedList2.addAll(linkedList1);
        // Output the value of linkedList2
        System.out.println("linkedList2 = " + linkedList2);
        // Declare and initialize linkedList3
        List<String> linkedList3 = new LinkedList<>();
        // Insert all elements of linkedList2 at the end of linkedList3
        linkedList3.addAll(linkedList2);
        // Insert all elements of linkedList1 after the third element of linkedList3
        linkedList3.addAll(2, linkedList1);
        // Output the value of linkedList3
        System.out.println("linkedList3 = " + linkedList3);
        // Delete all elements of linkedList1
        linkedList1.clear();
        // Output the value of linkedList1
        System.out.println("linkedList1 = " + linkedList1);
        // Check whether linkedList2 contains "リスト" and output the result
        System.out.println("linkedList2に「リスト」があるか: " + linkedList2.contains("リスト"));
        // Check whether linkedList2 contains "リス" and output the result
        System.out.println("linkedList2に「リス」があるか： " + linkedList2.contains("リス"));
        // Search the index of the element that matches "研" from the beginning
        System.out.println("linkedList3「研」のインデックス（頭から検索）: " + linkedList3.indexOf("研"));
        // Search the index of the element that matches "研修" from the beginning
        System.out.println("linkedList3「研修」のインデックス（頭から検索）: " + linkedList3.indexOf("研修"));
        // Search from the end the index of the element that matches "研"
        System.out.println("linkedList3「研」のインデックス（最後から検索）: " + linkedList3.lastIndexOf("研"));
        // Search from the end the index of the element that matches "研修"
        System.out.println("linkedList3「研修」のインデックス（最後から検索）: " + linkedList3.lastIndexOf("研修"));
        // Delete the second element of linkedList2
        linkedList2.remove(1);
        // Output the value of linkedList2
        System.out.println("linkedList2 = " + linkedList2);
        // Search for elements that match "リスト" from the beginning and delete them only once
        linkedList3.remove("リスト");
        // Output the value of linkedList3
        System.out.println("linkedList3 = " + linkedList3);
        // Delete all elements that match the elements held in linkedList2
        linkedList3.removeAll(linkedList2);
        // Output the value of linkedList3
        System.out.println("linkedList3 = " + linkedList3);
        // Replace the second element with "研修"
        linkedList3.set(1, "研修");
        // Output the value of linkedList3
        System.out.println("linkedList3 = " + linkedList3);
        // Calculate the number of elements of linkedList3 and output to the console
        System.out.println("linkedList3の要素数: " + linkedList3.size());
        // Declare linkedList4 and set it to a sublist of linkedList2 (second and third elements)
        List<String> linkedList4 = linkedList2.subList(1, 3);
        // Output the value of linkedList4
        System.out.println("linkedList4 = " + linkedList4);
        // Declare a String type variable array and convert linkedList2 to an array
        String[] array = linkedList2.toArray(new String[0]);
        // Output the value of array
        System.out.println("array = " + Arrays.toString(array));
    }
}
