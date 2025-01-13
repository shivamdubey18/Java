import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Day1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n]; 
        System.out.print("Enter "+ n + " elements : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        // System.out.print("Contains Duplicate : "+ containDuplicate(arr));
        // System.out.print("Contains Duplicate : "+ containsDuplicate(arr));

        // System.out.print("Enter First String : ");
        // String s = sc.nextLine();
        // System.out.print("Enter Second String : ");
        // String t = sc.nextLine();
        // System.out.print("Valid Anagrams : "+ isAnagramBruteForce(s,t));
        // System.out.print("Valid Anagrams : "+ isAnagramOptimized(s, t));


        // Two Sum
        System.out.print("Enter Target value : ");
        int t = sc.nextInt();
        System.out.print(Arrays.toString(twoSum(arr, t)));
        System.out.print(Arrays.toString(twoSumOptimized(arr, t)));
    }
    // Contain Duplicate - Brute Force
    public static boolean containDuplicate(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }return false;
    }

    //Contain Duplicate - Using Hashset 
    public static boolean containsDuplicate(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0 ; i < arr.length  ; i++){
            if(set.contains(arr[i])){
                return true;
            }
            set.add(arr[i]);
        }return false;
    }

    // Valid Anagrams - Brute Force - O(nlogn)
    public static boolean isAnagramBruteForce(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray, tArray);
    }

    // Valid Anagrams - Optimized - O(n)
    public static boolean isAnagramOptimized(String s, String t){
        if(s.length() != t.length()) return false;

        int[] count = new int[26];
        for(int i =0; i < s.length();i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for( int i =0; i < 26; i++ ){
            if(count[i] !=0 ) return false;
        }
        return true;
    }

    //Two Sum - Brute Force 
    public static int[] twoSum(int[] arr, int t){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j<arr.length ; j++){
                if (arr[i]+arr[j] == t) return new int[]{i,j};
            }
        }return new int[]{-1,-1};
    }

    //Two Sum - Optimized
    public static int[] twoSumOptimized(int[] arr, int t){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<arr.length;i++){
            int complement= t- arr[i];
            if (map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(arr[i], i);
        } return new int[]{-1,-1};
    }


    // Group Anagrams
    public List<List<String>> groupAnagramsSorting(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();

    for (String str : strs) {
        // Sort the string to create the key
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        String sorted = new String(charArray);

        // Add the string to the corresponding list in the map
        map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(str);
    }

    return new ArrayList<>(map.values());
}

    // Top K frequent Elements
    public static int[] kFrequentElement(int[] arr){

    }
}