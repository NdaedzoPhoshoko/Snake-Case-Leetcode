public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(SnakeCase("cats AND*Dogs-are Awesome"));
    }
    public static String SnakeCase(String str){
        return str.replaceAll("\\W+", "_").toLowerCase();
    }
}
