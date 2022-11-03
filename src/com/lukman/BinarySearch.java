package com.lukman;

public class BinarySearch {
    static BinarySearch b = new BinarySearch();
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70,80,90};
        System.out.println(b.Search(arr,90));
    }
     boolean checker(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        if (arr[start]<arr[end])
        {
            return true;
        }
        return false;
    }
     int Search(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (b.checker(arr)) {

                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
