class Solution{
	public boolean solution(String[] phoneBook){
    	for(int i = 0; i < phoneBook.length; i++){
        	for(int j = i+1; j < phoneBook.length; j++){
            	if(phoneBook[i].startsWith(phoneBook[j])){
                	return false;
                }
                if(phoneBook[j].startsWith(phoneBook[j])){
                	return false;
                }
            }
        }
        return true;
    }
}
