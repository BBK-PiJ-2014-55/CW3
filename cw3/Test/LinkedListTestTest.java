import org.junit.Test;

public class LinkedListTestTest {
    @Test
    public void test() {
        LinkedList list = new LinkedList();
        list.add(15);
        list.add(16);
        list.add(10);
        System.out.println("Does 10 exist in the list?" + list.find(10));
        System.out.println("Does 15 exist in the list?" + list.find(15));
        System.out.println("Does 16 exist in the list?" + list.find(16));
        System.out.println("Does 20 exist in the list?" + list.find(20));

        System.out.println("deleting 15");

        list.delete(15);
        System.out.println("Does 15 exist in the list?" + list.delete(15));



        System.out.println("Done");

    }


    public void testGetHead() {
        assert
    }







}