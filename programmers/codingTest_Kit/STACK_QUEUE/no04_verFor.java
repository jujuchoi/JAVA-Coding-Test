class Solution{
    public int[] solution(int[] prices){
    	int[] answer = new int[prices.length];

	for(int i = 0; i < prices.length; i++){
	    for(int j = i; j < prices.length; j++){
	    	answer[i]++;
		if(prices[i] > prices[j]){
		    break;
		}
	    } // end j for문
	} //end i for문
    }
}
