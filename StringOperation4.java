class StringOperation4{
    public static void main(String[] args){
        String str = "Hello! Welcome to the world of programming, and therefore world of Java";
        System.out.println(str);
        //Returns true if the string starts or ends with the specific char_sequence
        System.out.println("\nDo str starts with 'Welcome' (from index 7): " + str.startsWith("Welcome", 7));
        System.out.println("Do str ends with 'Java': " + str.endsWith("Java"));
        //Returns the index value of sub-string in a string
        System.out.println("\nIndex of 'world'(after index 10):" + str.indexOf("world", 46));
        System.out.println("Index of 'world'(after index 5 from end):" + str.lastIndexOf("world", 26));
    }
}