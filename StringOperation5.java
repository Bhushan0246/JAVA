class StringOperation5{
    public static void main(String[] args){
        String str = "Hello! Welcome to the World of programming, and therefore World of Java";
        System.out.println(str);
        //Replaces a particular string or sequence in an existing string
        System.out.println("\nReplaced string: " + str.replace("Java", "Java Programming.")+"\n");
        
        //Copies the content of a string into a destination char[] array
        char[] dest = new char[35];
        str.getChars(0, 22, dest, 0);
        str.getChars(58, str.length(), dest, 22);
        for(char item : dest)
            System.out.print(item);
    }
}