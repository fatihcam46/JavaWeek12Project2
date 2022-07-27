package fieldTypes;

public class StaticTest {
    public static void main(String[] args) {
        //class name//object name//print>>
        StaticMethods.displayMessage("Hello from static method");//message = Hello from static method

        StaticMethods object = new StaticMethods();//count = 5

        object.displayMessage("We are using object to call this static method");
//message = We are using object to call this static method
        System.out.println("StaticMethods.count = " + StaticMethods.count);//StaticMethods.count = 5

        System.out.println("object.num = " + object.num);//object.num = 10

        System.out.println(new StaticMethods().num);//10
//    StaticMethods.instanceMethod();
    }
}






