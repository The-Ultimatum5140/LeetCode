class Solution {
    public boolean isPalindrome(int x) {
        int temp=x<0?-1:1;
        x=Math.abs(x);
        StringBuilder n=new StringBuilder("");
        n.append(x);
        int sum=0;
        while(x>0){
        int rem=x%10;
        sum=(sum*10)+rem;
        x/=10;
        }
        StringBuilder res=new StringBuilder("");
        if(temp<0){
            res.append(sum);
            res.append("-");
        }else{
        res.append(sum);
        }
        if(res.toString().equals(n.toString())){
            return true;
        }
        return false;
}

}