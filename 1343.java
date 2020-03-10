/*Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
Input: arr = [2,2,2,2,5,5,5,8], k = 3, threshold = 4
Output: 3
Explanation: Sub-arrays [2,5,5],[5,5,5] and [5,5,8] have averages 4, 5 and 6 respectively. All other sub-arrays of size 3 have averages less than 4 (the threshold).

Input: arr = [11,13,17,23,29,31,7,5,2,3], k = 3, threshold = 5
Output: 6
Explanation: The first 6 sub-arrays of size 3 have averages greater than 5. Note that averages are not integers.
*/

//Time Complexity: O(n*k): [Sliding Window]

class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0 ;
        double avg = 0.0;
        int count = 0;
        for(int i = 0; i < k; i++)
        {
            sum += arr[i];
        }
        avg = sum/k;
        if(avg>=threshold)
            {
                count++;
            }
        
        for(int j = k; j<arr.length; j++)
        {
            sum += arr[j] - arr[j-k];
            avg = sum/k;
            if(avg>=threshold)
            {
                count++;
            }
        }
        return count;
    }
}


// class Solution {
//     public int numOfSubarrays(int[] arr, int k, int threshold) {
//         int sum = 0;
//         double avg = 0.0;
//         int num = 0;
//         for(int i = 0; i < arr.length-k+1; i++)
//         {
//             for(int j = 0; j < k; j++)
//             {
//                 sum = sum+arr[i+j];
//                 avg = sum/k;
//             }
//             if(avg>=threshold)
//             {
//                 num++;
//             }
//             sum = 0;
//         }
//         return num;
//     }
// }



