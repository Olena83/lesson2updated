package com.lits;

import java.util.Random;

public class Tasks2 {
              // for (int a=1;a <=512; a *= 2)
        //{System.out.println (a);}

//for (int a = 14; a>10; a=a+2)
//if((a%7==0)&&(a%3!=0))
        //{System.out.println (a);}

        //int counter=0;
        //for (int a=10; a < 100;a++) if ((a%11==0 )&&(counter<25))
        //{System.out.println (a);counter++;}
        //for (int b=100; b < 1000;b++) if ((b%47==0 )&&(counter<25))
        //{System.out.println (b);counter++;}

        //int a=1;
        //int b=1;
        //int counter=0;
        //do {
            //a++;b++;
            //if ((a>b)&&(a%b !=0))continue;
           //else(a>b);
       // { System.out.println(a);
           // counter++; }}
       // while (counter <25);

    public static void main(String[] args){
        //задача 1 з масивів
       // int[] myArray = {11, 8, 1, 109,5};
        //int min = myArray[0];
       // for (int i = 1; i < myArray.length; i++) {
            //if (myArray[i] < min) {
               // min = myArray[i];}}
          //  System.out.println("Число з масиву , яке найближче до нуля: " + min); }}

//задача 2 з масивів
        //int[] myArray = {1, 7, 90, 109,5};
       // int a  = 0;
        //for (int i = 1; i < myArray.length; i++) {
           //if (myArray[i] <myArray[a]) {
               //a=i;}}
       // {System.out.println("Позиція числа масиву , яке найближче до нуля):"+a);};
//задача 3 з масивів
        //int[] myArray = {11, 8, 1, 109,5};
       // int min = myArray[0];
        //int max = myArray[0];
        //for (int i = 1; i < myArray.length; i++) {
        //if (myArray[i] < min) { min = myArray[i];}}
        //for (int i = 1; i < myArray.length; i++)
       // {if(myArray[i]>max) { max=myArray[i] ;}}
       // {System.out.println(max+min);}
//задача 4 з масивів
        //int[] myArray = {3, 8, 1, 10,5,90,100};
       // int max=myArray[0];
        //int max2 =myArray[0];
        //for (int i = 1; i < myArray.length; i++)
       // {if (myArray[i]> max){max2=max; max = myArray[i] ;}
            //else if (myArray[i] >max2){max2 =myArray[i];}}
       //{System.out.println("Число, сума цифр якого є максимальною:" +(max+ max2));}

        //Задача №5: у вас є підготовлений двохвимірний масив даних. найти рядок сума чисел є максимальна
//            int height = 6;
//            int width = 5;
//            int[][] array2 = new int[height][width];
//            Random random = new Random();
//            for (int i = 0; i < height; i++)
//            { for (int j = 0; j < width; j++)
//            {array2[i][j] = random.nextInt(8) + 2;
//            System.out.print(array2[i][j] + " ");            }
//            System.out.println();        }
//            System.out.println("===");
//        int[] sums = new int[height];
//
//        for (int i = 0; i < height; i++) {for (int j = 0; j < width; j++)
//             { sums[i] = sums[i] + array2[i][j];} System.out.println( (i+1)+ " рядок сумма : => " + sums[i]);}
//             System.out.println(" ");
//        int max =sums[0];
//        int n=0;
//        for (int i= 0; i < height; i++)
//            {  if ( sums[i] > max) { max=sums[i];n=i+1; } }
//        System.out.println("найбільше число серед сум чисел рядків: => "+ max);
//        System.out.println(" ");
//        System.out.println("Номер рядка з максимальною сумою чисел  становить: " + n);

        //Задача №6: у вас є підготовлений двохвимірний масив даних. найти стовчик сума чисел є мінімальна
       // int height = 4;
        //int width = 5;
        //int[][] array2 = new int[height][width];
       // Random random = new Random();
       // for (int i = 0; i < height; i++)
        //{ for (int j = 0; j < width; j++)
        //{array2[i][j] = random.nextInt(7);
          //  System.out.print(array2[i][j] + " ");            }
           // System.out.println();        }
        //System.out.println("===");
       //int[] sums = new int[width];
      // for (int j = 0; j < width; j++) {for (int i = 0; i < height; i++)
   // { sums[j] = sums[j] + array2[i][j];} System.out.println( (j+1)+ " стовпчик сумма : => " + sums[j]);}
     // System.out.println(" ");
       // int min =sums[0];
        //int n=0;
        //for (int j= 0; j < width; j++)
            //{  if ( sums[j]< min) { min=sums[j];n=j; } }
       // System.out.println("найменше число серед сум чисел стовпців: => "+ min);
       // System.out.println(" ");
        //System.out.println("Номер стовпця з мінімальною сумою чисел  становить: " + (n+1));

    //}}