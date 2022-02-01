package com.company.easy;

public class E852_PeakIndexinaMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
//[0,1,2,3,10,5,2,1,0]
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;

        while (start < end) {
            // checking if the mid eleement is smaller
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
            //updating mid
            mid = start + (end - start) / 2;

        }
        // returning start or end because they points to peak element
        return end;
    }


//    public int peakIndexInMountainArray(int[] arr) {
//        int lo = 1;
//        int hi = arr.length-2;
//
//        while(lo < hi) {
//            int mid = lo + (hi - lo)/2;
//
//            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;
//            else if(arr[mid] > arr[mid+1]) hi = mid;
//            else lo = mid+1;
//        }
//
//        return hi;
//    }

}

