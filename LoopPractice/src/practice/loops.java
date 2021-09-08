package practice;

import java.util.Enumeration;

public class loops {
    public static void main(String[] args) {
        int start =0;
        int end=100;
        for (start=0; start<=end; start++){
            if(start%2==0){ 
                System.out.println(start +" is even");
            }
            else{
                System.out.println(start +" is odd");
            }
        }

      }
    }

