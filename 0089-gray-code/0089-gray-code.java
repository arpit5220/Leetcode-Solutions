class Solution {
    public List<Integer> grayCode(int n) {
        
       if(n==0)
       {
           List<Integer> mres=new ArrayList<>();
           mres.add(0);
           return mres;
       }

       if(n==1)
       {
           List<Integer> mres=new ArrayList<>();
           mres.add(0);
           mres.add(1);
           return mres;
       }

      List<Integer> rres=grayCode(n-1);
      List<Integer> mres=new ArrayList<>();
      for(int i=0;i<rres.size();i++)
      {
          int val=rres.get(i);
          mres.add(val);
      }
      for(int i=rres.size()-1;i>=0;i--)
      {
          int val=rres.get(i);

          int bm=1<<(n-1);
          val=val|bm;

          mres.add(val);
      }

      return mres;
    }
}