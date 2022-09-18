class Solution {
    public String sortSentence(String s) {
        int n= s.length();
     
        String[] ar=s.split(" ");
        int nofwords=ar.length;
        String[] res= new String[nofwords];
        
        for(int i=0;i<nofwords;i++){
            
            char idx= ar[i].charAt(ar[i].length()-1);
            
            int index=Character.getNumericValue(idx);
            String sub=ar[i].substring(0,ar[i].length()-1);
            
            res[index-1]=sub;
        }
        StringBuilder sb = new StringBuilder();
        
        for(String a: res){
            
            sb.append(a+ " ");
        }
        return sb.toString().trim();      
    }
}
