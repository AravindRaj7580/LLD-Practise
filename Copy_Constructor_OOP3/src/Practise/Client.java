package Practise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Client {

    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\DELL\\Documents\\input.txt";
        BufferedReader bf = new BufferedReader(new FileReader(filePath));
        int lineNumber = 1;
        String line;
        int finalAns = 0;
        int greenToCompare = 13;
        int blueToCompare = 14;
        int redToCompare = 12;
        while((line = bf.readLine()) != null){
            int tempGreen = greenToCompare;
            int tempRed = redToCompare;
            int tempBlue = blueToCompare;


            lineNumber++;
        }
//        while((line = bf.readLine()) != null){
////            System.out.println("line no is : "+lineNumber+" and line is - "+line);
//            int s = 0;
//            int e = line.length()-1;
//            int firstValue = -1;
//            int secondValue = -1;
//            while(s<=e){
//                if(firstValue == -1 && line.charAt(s) >= '0' && line.charAt(s) <= '9'){
//                    firstValue = (int) (line.charAt(s) - 48);
//                }else{
//                    s++;
//                }
//                if(secondValue == -1 && line.charAt(e) >= '0' && line.charAt(e) <= '9'){
//                    secondValue = (int) (line.charAt(e) - 48);
//                }else{
//                    e--;
//                }
//                if(s == e && line.charAt(s) >= '0' && line.charAt(s) <= '9'){
//                    firstValue = (int) (line.charAt(s) - 48);
//                    secondValue = (int) (line.charAt(s) - 48);
//                    break;
//                }
//                if(firstValue != -1 && secondValue != -1){
//                    break;
//                }
//            }
//            totalSum += firstValue * 10 + secondValue;
//            lineNumber++;
//        }
        System.out.println("total sum is : "+finalAns);

    }
}
