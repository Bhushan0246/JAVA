class StringSorting{
    public static void main(String[] args){
        String[] str = {"Where", "How", "When", "What", "else", "Why", "Who", "Explain", "was", "Can"};
        for(int i = 0; i<str.length; i++){
            for(int j = i+1; j<str.length; j++){
                if(str[i].compareTo(str[j]) > 0){
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
            System.out.print(str[i] + " ");
        }
    }
}