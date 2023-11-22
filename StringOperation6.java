class StringOperation6{
    public static void main(String[] args){
        String str = "Hello! Welcome to Java Programming.";
        //Returns the substring from start-index till end-index
        System.out.println("Printing substring: ");
        System.out.println(str.substring(0,6));
        System.out.println(str.substring(18) + "\n");
        /*Splits the string into pieces taking a spliting factor 'regex' and
        the number of pieces as 'limit'*/
        String[] words = str.split(" ", 2);
        for (String item : words) {
            System.out.println(item);
        }
        System.out.println("");
        for(String item : str.split("o", 0)){
            System.out.println(item);
        }
    }
}