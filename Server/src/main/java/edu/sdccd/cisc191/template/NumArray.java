package edu.sdccd.cisc191.template;

public class NumArray {
    int [] array = {1,2,3,4,5};

    public void print (){
       for (int num: array){
            System.out.println(num);
       }
    }

    public int getFirst(){
        return array[0];
    }

}
