package variable;
public class Variable2 {
    public static void main(String[] args) {
        int x=1;
        int y= x++ + ++x + x + x++;
        
        
        System.out.println("x= "+x);
        System.out.println("y= "+y);
    }
    
}
