public class Main {
    public static void main(String[] args) {
        System.out.println("Testing MyArrayList:");
        MyList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println("Size of list: " + arrayList.size());
        System.out.println("Element at index 1: " + arrayList.get(1));
        arrayList.remove(0);
        System.out.println("Size of list after removal: " + arrayList.size());
        arrayList.clear();
        System.out.println("Size of list after clear: " + arrayList.size());
        System.out.println("Is list empty: " + arrayList.isEmpty());


        System.out.println("\nTesting MyLinkedList:");
        MyList<String> linkedList = new MyLinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        System.out.println("Size of list: " + linkedList.size());
        System.out.println("Element at index 1: " + linkedList.get(1));
        linkedList.remove(0);
        System.out.println("Size of list after removal: " + linkedList.size());
        linkedList.clear();
        System.out.println("Size of list after clear: " + linkedList.size());
        System.out.println("Is list empty: " + linkedList.isEmpty());
    }
}