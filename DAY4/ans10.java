
class ans10{
    
    public static void main(String[] args) {
        String str="swiss";
        int count = 0;

        for(int i=0;i<str.length();i++){
            for(int j= 0 ; j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                    // System.out.println(count);
                }
            }
            if(count==1){
                System.out.println(str.charAt(i));
                break;
            }
            count=0;
        }
    }
}