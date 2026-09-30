package codexl3;

public class ifc {
    public static void main(String[] args) {
        System.out.println( 1 == 1 || 3==1);
        System.out.println( 1 == 1 && 3==1);
        int value1=1;
        int value2=2;
        boolean someCondition = value1 == value2;
        System.out.println( value1 == 1 || value2==1);
        int result = someCondition ? value1 : value2;
        System.out.println("Result: " + result);
    }
}
