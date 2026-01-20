package numbers;
public class stringtointandinttostring {

    public static void main(String args[]) {

        int n = 123;

        
        String num = Integer.toString(n);
        System.out.println("Int to String: " + num);

       
        String name = "456";
        int namenum = Integer.parseInt(name);
        System.out.println("String to Int: " + namenum);
    }
}
