class Solution {
    public int numTeams(int[] rating) {
        
        int c = 0 ;

        for (int i = 0 ; i< rating.length-2 ; i++)
            for (int j = i+1 ; j<rating.length-1;j++)
                if (rating[j] < rating[i])
                    for (int k = j+1 ; k<rating.length ; k++)
                        if (rating[k] < rating[j])
                            c++;
              
    
        for (int i = 0 ; i< rating.length-2 ; i++)
            for (int j = i+1 ; j<rating.length-1;j++)
                if (rating[j] > rating[i])
                    for (int k = j+1 ; k<rating.length ; k++)
                        if (rating[k] > rating[j])
                            c++;
    
    return c;
    }
}