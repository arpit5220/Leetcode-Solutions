class Solution {
    public String reverseVowels(String str) {
        
       char [] arr=str.toCharArray();
        int left=0;
        int right=str.length()-1;
        
        while(left<right)
        {
           while(left<right && !isVowel(arr,left))
           {
               left++;
           }
            
             while(left<right && !isVowel(arr,right))
           {
               right--;
           }
            
            swap(arr,left,right);
            left++;
            right--;
         
        } 
        
        return new String(arr);
               
       
    }
    
    public static boolean isVowel(char [] arr,int index)
    {
        char ch=arr[index];
        
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            return true;
        }
          return false ; 
    }
    
    public static void swap(char [] arr,int left,int right)
    {
        char temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
}