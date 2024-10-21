class Test {
    int value;

    Test(int value) {
        this.value = value;
    }
}

public class CallByReferenceExample {

    public static void main(String[] args) {
        
        Test obj = new Test(5);

        System.out.println("Before modification: " + obj.value);

        modifyObject(obj);

        System.out.println("After modification: " + obj.value);

    }
public static void modifyObject(Test obj){
obj.value = 10;
}
}
