package com.practice;

public class Sorting {

    public static void leftArray(int arr[], int n){

    }


    public static void main(String[] args) {
        int arr[]=new int[]{4,3,2,1};
        int n=arr.length;

//          BubbleSort(arr,n);
          SelectionSort(arr,n);
    }

    public static void BubbleSort(int arr[],int n) {
        //Time Complexity = 0(n^2)
        // Bubble Sort
        int i;
        // Outer Loop to iterate array til n-1
        for( i=0; i<n-1;i++){
            // Inner loop to push the element to end of the array index which is n-i-1; (i is for ignoring the last index element after  sorted)
            for(int j=0; j<n-i-1; j++){
                // if the first element is greater than next element then swap it
                if(arr[j]>arr[j+1]){
                    //Swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        //Printing The array
        for( i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

    }


    public static void SelectionSort(int arr[],int n){
        //Time Complexity = 0(n^2)
        //SelectionSort
        int i;
        // Outer Lopp iterate the array untill n-1
        for( i=0; i<n-1; i++){
            //first will consider the smallest element is index[0]
            int smallest=i;
            //then we start the loop with index[0+1] until n and after one loop is finished we will swap the element of first index with last one
            for(int j=i+1; j<n; j++){
                //if first index[0] is greater than next element
                if(arr[smallest]>arr[j]){
                    //we will consider the next element index[1] is smallest
                    smallest=j;
                }
            }
                //After condition statisfiead will swap it
                //Swap
                int temp=arr[smallest];
                arr[smallest]=arr[i];
                arr[i]=temp;

        }
        //Printing The array

        for( i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

    }















}
