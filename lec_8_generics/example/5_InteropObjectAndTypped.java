class RawTest {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("First");
        list.add("Second");
        List<String> strList = list; //#1
        for (Iterator<String> itemItr = strList.iterator(); itemItr.hasNext(); )
            System.out.println("Item : " + itemItr.next());

        List<String> strList2 = new LinkedList<>();
        strList2.add("First");
        strList2.add("Second");
//strList.add(10); //#1: generates compiler error
        List list2 = strList2; //#2
//list2.add(10);//#2: compiles fine, results in runtime exception
        for (Iterator<String> itemItr = list2.iterator(); itemItr.hasNext(); )
            System.out.println("Item : " + itemItr.next());
    }
}