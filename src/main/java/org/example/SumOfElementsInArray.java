package org.example;

public class SumOfElementsInArray {
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5};
        getSumOfElementsInArray(ar);

    }
    public static void getSumOfElementsInArray(int ar[]){
        int sum=0;
        for(int value:ar){
            sum=sum+value;
        }
        System.out.println("The sum is "+sum);
    }
}
