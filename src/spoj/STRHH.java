package spoj;

import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Created by Sinha on 12-01-2016.
 */
public class STRHH {
    /**
     * Problem Link
     * http://www.spoj.com/problems/STRHH/
     */
    public static void main(String[] args) {
        int numberOfLines;
        String halfString = null;
        String finalOutPut = "";
        List<Object> input = new ArrayList<Object>();

        System.out.println("Please enter number of lines you want to type");
        Scanner scan = new Scanner(System.in);
        numberOfLines = Integer.parseInt(scan.next());

        for (int i = 0; i < numberOfLines; i++) {
            System.out.println("Enter line " + i);
            input.add(scan.next());
        }

        for (int n = 0; n < input.size(); n++) {
            Object valueToVerify = input.get(n);
            String valueToVerifyStr = valueToVerify.toString();
            int mid = valueToVerifyStr.length() / 2;
            halfString = valueToVerifyStr.substring(0, mid);

            finalOutPut = "";
            for (int j = 0; j < halfString.length(); j += 2) {
                char finalOutPutChar = halfString.charAt(j);
                finalOutPut = finalOutPut + finalOutPutChar;
            }
            System.out.println(finalOutPut);
        }
    }
}
