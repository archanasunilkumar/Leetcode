class Solution {
public:
    string truncateSentence(string s, int k) {
        string ans;
        int a=0;
        for(char c:s){
            if(c==' ') a++;
            if(a==k) break;
            ans.push_back(c);
        }
        return ans;
    }
};