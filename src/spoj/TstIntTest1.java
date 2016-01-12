package spoj;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Sinha on 12-01-2016.
 */
public class TstIntTest1 {
    public static void main (String[] args) throws java.lang.Exception
    {
        int sum = 0;
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        ArrayList<Integer> readIntegers = new ArrayList<Integer>();

        int inputQuatities = 2;

        for(int i = 1; i<= inputQuatities; i++){
            System.out.println("Enter "+i+ " input");
                    readIntegers.add(reader.nextInt());
        }
        for(int n = 0; n < readIntegers.size(); n++) {
            sum += readIntegers.get(n);
        }

        System.out.println("the sum of given input is " + sum);
    }
}
