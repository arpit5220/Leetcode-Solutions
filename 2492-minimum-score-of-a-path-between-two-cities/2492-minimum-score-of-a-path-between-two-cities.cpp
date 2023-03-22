class Solution{
public:
int minScore(int n, vector<vector<int>>& r) {

        int k=r.size();
        vector<vector<pair<int,int>>>dsdsdsd(n+1);
        for(int i=0;i<k;i++)
        {
            dsdsdsd[r[i][0]].push_back({r[i][1],r[i][2]});
            dsdsdsd[r[i][1]].push_back({r[i][0],r[i][2]});
        }
        
        vector<int>vis(n+2,0);
        
        queue<vector<int>>q;
        q.push({n,INT_MAX});
        int mini=INT_MAX;
        
        while(!q.empty())
        {
            auto tp=q.front();
            q.pop();
            mini=min(mini,tp[1]);
            vis[tp[0]]=1; 
            for(auto ele:dsdsdsd[tp[0]])
            {
                if(!vis[ele.first])
                {
                    q.push({ele.first,ele.second});
                }
            }
        }
        return mini;
}
};