class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        
        List<int []> ans=new ArrayList<>();
        
        int firstListindex=0;
        int secondListindex=0;
        
        int min,max;
        
        while(firstListindex<firstList.length && secondListindex<secondList.length)
        {
            if(secondList[secondListindex][0]<=firstList[firstListindex][1] &&firstList[firstListindex] [0]       <=secondList[secondListindex][1])
            {
            max=Math.max(firstList[firstListindex][0],secondList[secondListindex][0]);
            min=Math.min(firstList[firstListindex][1],secondList[secondListindex][1]);
            
           // if(min>=max)
                ans.add(new int[]{max,min});
            }
            if(firstList[firstListindex][1]>secondList[secondListindex][1])
                secondListindex++;
            else
                firstListindex++;
        }
        
        return ans.toArray(new int[ans.size()][2]);
    }
}