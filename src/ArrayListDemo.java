import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
// A cool way to run this program from terminal is:
// java ArrayListDemo.java < numbers.txt > outPut.txt

public class ArrayListDemo {
    private static void  printArraylist(ArrayList<Integer> numbers){
        for(int number : numbers){
            System.out.println(number);
        }
    }
    public static void main(String args[]){

        // You cannot directly insert primitive types (so you can't insert int)
        /*
            Primitive Types to their Wrapper Class:
            byte    Byte
            boolean Boolean
            char    Character
            double  Double
            float   Float
            int     Integer
            long    Long
            short   Short
         */
        // You can assign a primitive to a Wrapper variable it is called auto-boxing
        // in revers it is outo-unboxing
        ArrayList<Integer> numbers = new ArrayList<>();

        Random rand = new Random();
        for(int i = 0; i < 10; i++){
            int randNumber = rand.nextInt(100);
            numbers.add(randNumber);
        }
        // enhanced for loop, printing numbers
        System.out.println("Printing numbers");
        printArraylist(numbers);

        //Copy numbers
        ArrayList<Integer> numbersSoftCopy = numbers;

        numbersSoftCopy.add(4,27);

        //print numbers and show that 27 was added
        System.out.println("Printing numbers");
        printArraylist(numbers);

        ArrayList<Integer> numbersHardCopy = new ArrayList<>(numbers);
        numbers.remove(4);

        //print numbers and show that 27 deleted and everything else got pushed up
        System.out.println("Printing numbers");
        printArraylist(numbers);

        //print numbersHardCopy and show that 27 is still there
        System.out.println("Printing numbersHardCopy");
        printArraylist(numbersHardCopy);

        /*
            when you remove a element from an array list the size gets smaller,
            everything behind it gets pushed up on spot.
            Thus, you only want to increment i if you are not removing an element
        */
        int i = 0;
        while (i < numbersHardCopy.size()){
            if(numbersHardCopy.get(i) == 27) numbersHardCopy.remove(i);
            else i++;
        }

        numbers.clear();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            numbers.add(sc.nextInt());
        }

        System.out.println("Printing numbers");
        printArraylist(numbers);
    }
}
