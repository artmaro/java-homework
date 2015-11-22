import java.util.*;

class TestIterator {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 1; i < 10; i++)
            nums.add(i);
        System.out.println("Original list " + nums);
        Iterator<Integer> numsIter = nums.iterator();
        while (numsIter.hasNext()) {
            //numsIter.next(); to avoid error
            numsIter.remove();
        }
//removing without iterator will lead to concurrent modification error
        System.out.println("List after removing all elements" + nums);
    }
}
 