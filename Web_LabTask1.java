package web_lab.task1;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ramzan Jeni
 */
public class Web_LabTask1 {
    int size=3;
    int arr[]=new int[size];
    
     public void inputArray()
    {
        
        Scanner input=new Scanner(System.in);
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter the value "+ (i+1)+": ");
            arr[i]=input.nextInt();
        }
    }
    
    public void doubleArray()
    {
        int tempArr[]=new int[size*2];
        int tempSize=size*2;
        for(int j=0;j<size;j++)
        {
            tempArr[j]=arr[j];
        }
        int val=0;
        for(int i=size;i<tempSize;i++)
        {
            tempArr[i]=(tempArr[val]*2);
            val++;
        }
        arr=tempArr;
        size=size*2;
        
    }
    public void display()
    {
        for(int i=0;i<size; i++)
        {
            System.out.print("Value "+(i+1)+" is: "+arr[i]+"\n");
        }
    }

   
    
}
