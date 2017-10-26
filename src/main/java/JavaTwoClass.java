import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class JavaTwoClass {

    public static void main(String[] args){
//        arrays();
//        arrayForLoopExample();
//        threeDimArray();
//        arrayListTypes();
//        arrayListWithoutTypes();
////        arrayListOperations();
//        arrayListSet();
//        arrayListEquals();
//        hasMapExample();
//        callStaticMethod();
//        staticCount();
//        ourDog(5, "brown");
        exceptionExample();
    }


    public static void arrays(){
        String[] mammals = {"monkey", "chimp", "donkey"};
        System.out.println(mammals.length);
        System.out.println(mammals[0]);
        System.out.println(mammals[2]);
        System.out.println(mammals[3]);
    }

    public static void arrayForLoopExample(){
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i + 5;
            System.out.println(numbers[i]);
        }
    }

    public static void threeDimArray(){
        String[][][] test = {
                {
                        {"roger", "joy", "53"},
                        {"emily", "joy", "41"}
                },
                {
                        {"adam", "s.", "plunkett", "52"},
                        {"baby"},
                        {"christy", "plunkett"}
                }
        };
//        System.out.println(test);
//        System.out.println(test[0].length);
//        System.out.println(test[0][0]);
//        System.out.println(test[0][0][0]);

        for (String[][] arrays2D: test) {
            for(String[] array1D: arrays2D){
                for (String item: array1D){
                    System.out.println("item: " + item);
                }
            }
        }
    }

    public static void arrayListTypes(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("abc");
        arrayList.add("dfgf");
        System.out.println(arrayList);
    }

    public static void arrayListWithoutTypes(){
        ArrayList arrayList = new ArrayList();
        arrayList.add("abc");
        arrayList.add("dfgf");
        arrayList.add(Boolean.TRUE);
        System.out.println(arrayList);
    }

    public static void arrayListRemove(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("5");
        arrayList.add("ali");
        arrayList.add("kuş");
        System.out.println(arrayList);

        arrayList.remove("5");
        System.out.println(arrayList);

        arrayList.remove(0);
        System.out.println(arrayList);

        arrayList.add("ahmet");
        arrayList.add("mert");
        arrayList.add("ahmet");
        arrayList.add("elif");
        arrayList.add("ahmet");

        arrayList.remove("ahmet");
        System.out.println(arrayList);

    }

    public static void arrayListSet(){
        List<String> names = new ArrayList<>();
        names.add("ali");
        names.set(0, "ayşe");
        System.out.println(names);
    }

    public static void arrayListEquals(){
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("ali");
        arrayList1.add("ayse");
        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("ayse");
        arrayList2.add("ali");
        System.out.println(arrayList2);

        System.out.println(arrayList1.equals(arrayList2));

    }

    public static void hasMapExample(){
        HashMap<String, String> objMap = new HashMap<>();
        objMap.put("Name", "Suzuki");
        objMap.put("Power", "220");
        objMap.put("Type", "2-wheeler");
        objMap.put("Price", "85000");

        System.out.println(objMap);

        System.out.println(objMap.get("Type"));
        System.out.println(objMap.get("2-wheeler"));
        System.out.println(objMap.containsKey("Pow"));
        System.out.println(objMap.containsValue("Suzuki"));
        System.out.println(objMap.remove("Power"));
        System.out.println(objMap.put("seyda", "gunduz"));
        System.out.println(objMap.keySet());
    }

    public static void hashMapII(){
        HashMap<String, List<String>> hashMap = new HashMap<>();
        ArrayList<String> array = new ArrayList<>();
        hashMap.put("userId", array);
        System.out.println(hashMap);
    }

    public static void callStaticMethod(){
        MyFirstClass.write("session1");
//        MyFirstClass.main(new String[0]);
    }

    public static void staticCount(){
        Cat siyam =  new Cat();
        System.out.println(siyam.foodAmount);

        Cat ankara = new Cat();
        ankara.foodAmount = 50;
        Cat.printFoodAmount();

        Cat selen = new Cat();
        Cat.printFoodAmount();
    }

    private static String name = "name";
    public void staticMethodsInstanceVariable(){
        System.out.println(name);
    }

    public static void ourDog(int weight, String color){
        Dog ourDog = new Dog(weight, color);
        System.out.println(ourDog);
    }

    public static void exceptionExample(){
        int num1, num2;

        try{
            num1 = 0;
            num2 = 62;
            System.out.println(num2/num1);
        } catch (Exception e){
            System.out.println("divide by zero");
            e.printStackTrace();
        }
        finally {
            System.out.println("I will anyways write this");
        }
    }

    public static void multipleCatchExample(){
        try {
            int a[] = new int[7];
            a[4]= 30/0;
        }
        catch (ArithmeticException e){
            System.out.println("arithmetic exception");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array index out of bounds");
        }
        catch (Exception e) {
            System.out.println("exception");
        }
        System.out.println("out of block");
    }

}
