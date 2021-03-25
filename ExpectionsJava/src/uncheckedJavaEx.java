import java.lang.*;

//Unchecked Examples
public class uncheckedJavaEx {
    static public void main(String[] args) {
        //Adding an element to a list
        try {
            System.out.println("Example 1. Creating a adding elements to a List:");
            listadd();

            //Dividing number / 0
            System.out.println("Example 2. Dividing an array with zero");
            divideList();

        }catch (Exception e){
            System.out.println("Program couldn´t complete");
        }
        finally {
            System.out.print("Rest of the program");
        }
    }


    //Example 1
    public static void listadd() {
        try {
            int[] myNumberList = new int[7];
            addingElement();
            System.out.println("Added successfully" + myNumberList + "\n");

        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Invalid Length to this List\n");
        }
    }

    private static void addingElement() {
        int[] myNumberLIst = new int[7];
        myNumberLIst[10] = 1 / 2;
    }

    //Example 2
    public static void divideList() {
        int[] myList = {2,5};
        int[] divilist = {2,0};

        for (int i = 0; i < myList.length; i++ ){
            try {
                System.out.println("Result is: " + myList[i] / divilist[i]);
            } catch (ArithmeticException ex) {
                System.out.println("Can´t be resolved\n");
            }
        }

    }
}


