import java.util.StringTokenizer;
class StringTokens{
    public static void main(String[] args){
        StringTokenizer st = new StringTokenizer("Hello Everyone This Is JAVA.", "e");
        System.out.println("Total number of token: " + st.countTokens());
        while(st.hasMoreTokens())
            System.out.println(st.nextToken("e"));
    }
}