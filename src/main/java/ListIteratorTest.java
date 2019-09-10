
import java.util.ListIterator;
import java.util.ListResourceBundle;
import java.util.Scanner;
import java.util.ArrayList;
//code for how to use a ListIterator to loop through all the values of an  array list
public class ArrayListIteratorTest {
    public static void main(String[] args){
        ArrayList<String> myArrlist = new ArrayList<String>();
        myArrlist.add("one");
        myArrlist.add("two");
        myArrlist.add("four");
        myArrlist.add(2, "three");
        //Get the iterator
        ListIterator<String> iterator = myArrlist.listIterator();
        //Use hasNext() to check whether more elements exist
        while (iterator.hasNext()){
            System.out.println(iterator.next()); //call next() to get the next item from itwrator
        }

    }
}

