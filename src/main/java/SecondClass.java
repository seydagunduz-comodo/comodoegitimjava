import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SecondClass {

    public static void main(String[] args) {
//        arrays();
//        arrayForLoopExample();
//        arrayListWithoutType();
//        arrayListWithType();
//        arrayOpsRemove();
//        multiDimArray();
//        threeDimArray();
        multiDimArrayList();
//        arrayListOpsSet();
//        arrayListOps();
//        staticCount();
//        createFish(5, "pink");
//        exceptionExample();
//        multipleCatchExample();
//        hashMapExample();
   }

    public static void arrays(){
        String[] mammals = {"monkey", "chimp", "donkey"};
        System.out.println(mammals.length); // 3
        System.out.println(mammals[0]); // monkey
        System.out.println(mammals[1]); // chimp
        System.out.println(mammals[2]); // donkey
    }

    public static void arrayForLoopExample(){

        // Nasıl yazarız?

        int[] numbers = new int[10];        // Kaçta biter?

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 5;
            System.out.println(numbers[i]);
        }
    }


    public static void arrayListWithoutType(){
        // We didn't specify any type so the type is object
        ArrayList list = new ArrayList();
        list.add("name1");
        list.add("name2");

        // Boolean -  why is it capital? // Wrapper Classes
        list.add(Boolean.TRUE);
        System.out.println(list);
    }


    public static void arrayListWithType() {
        // Generics allow you to specify the type of class that the ArrayList will contain
        ArrayList<String> safeList = new ArrayList<>();
        safeList.add("abc");
//        safeList.add(Boolean.TRUE);
        System.out.println(safeList);
    }

    public static void arrayListWithTypeObject(){
        ArrayList<Object> sd = new ArrayList<>();
        sd.add("abc");
        sd.add(Boolean.TRUE);
        System.out.println(sd);
    }


    public static void arrayOpsRemove(){
        ArrayList<String> array = new ArrayList<>();
        array.add("5");
        array.add("Ali");
        System.out.println(array);

        //Remove
        array.remove("Ali");
        System.out.println(array);
        array.add("name");
        System.out.println(array.remove(1));
        System.out.println(array);
        array.remove(0);
        System.out.println(array);

        //If there are more than one items to remove
        array.add("ahmet");
        array.add("mert");
        array.add("ahmet");
        array.add("elif");
        array.add("ahmet");

        array.remove("ahmet");
        System.out.println(array);

        //IndexOutOfBounds
//        array.remove(100);
    }

    public static void multiDimArray(){
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6, 9},
                {7},
        };

        System.out.println("Length of 1: " + a[0].length);
        System.out.println("Length of 2: " + a[1].length);
        System.out.println("Length of 3: " + a[2].length);
    }

    public static void multiDimArrayList(){
        List<List<String>> ls2d = new ArrayList<>();
        List<String> x = new ArrayList<>();
        x.add("Hello");
        x.add("world!");
        ls2d.add(x);

        System.out.println(ls2d.toArray()[0]);
    }

    public static void threeDimArray(){
        // test is a 3d array
        String[][][] test = {
                {
                        {"roger", "joy", "52"},
                        {"emily", "joy", "41"}
                },
                {
                        {"adam", "s.", "plunkett", "52"},
                        {"baby"},
                        {"christy", "plunkett", "30"}
                }
        };

        System.out.println("1 " + test[0].length);
        System.out.println("2 " + test[1].length);
        System.out.println("1-1 " + test[0][0].length);
        System.out.println("1-2 " + test[0][1].length);
        System.out.println("2-1 " + test[1][0].length);
        System.out.println("2-2 " + test[1][1].length);
        System.out.println("2-3 " + test[1][2].length);

        // for..each loop to iterate through elements of 3d array
        for (String[][] array2D: test) {
            System.out.println("array 2d:" + array2D);
            for (String[] array1D: array2D) {
                System.out.println("array 1 d:" + array1D);
                for(String item: array1D) {
                    System.out.println("item: "+ item);
                }
            }
        }
    }


    public static void arrayListOpsSet(){
        List<String> names = new ArrayList<>();
        names.add("ali");
        System.out.println(names);
        names.set(0, "ayşe");
        System.out.println(names);
    }

    public static void arrayListOps(){
        List<String> names = new ArrayList<>();
        names.add("ali");
        System.out.println(names.isEmpty());
        System.out.println(names.size());
        System.out.println(names.contains("ali"));
        names.add("name");

        List<String> namesAlternative = new ArrayList<>();
        namesAlternative.add("name");
        namesAlternative.add("ali");
        System.out.println(names.equals(namesAlternative));
//        they are not equal. The size is the same and the values are the same, but they are
//        not in the same order
    }

    //Static Methods
    public static void callStaticMethod(){
        MyFirstClass.write("bird");
        MyFirstClass.main(new String[0]);
    }

    public static void staticCount(){
        Bird parokeet = new Bird();
        System.out.println(parokeet.foodAmount);

        Bird sparrow = new Bird();
        sparrow.foodAmount = 5;
        Bird.printFoodAmount();

        Bird eagle = new Bird();
        eagle.foodAmount = 6;

        System.out.println(Bird.foodAmount);

        Bird.printFoodAmount();
    }

    public static void createFish(int weight, String color){
        Fish fishObj = new Fish(weight, color);
        System.out.println(fishObj);
    }


//    private String name = "name";
//
//    public static void staticMethodInstanceVariable() {
//        System.out.println(name);
//    }


//    public static void throwException() throws Exception {
//        throw new Exception();
//    }


    public static void exceptionExample(){
        int num1, num2;

        try {
            num1 = 0;
            num2 = 62;
            System.out.println(num2/num1);
        } catch (Exception e){
            System.out.println("divide by zero");
            e.printStackTrace();
        } finally {
            System.out.println("I will write this in any case");
        }
    }


    public static void multipleCatchExample() {
        try{
            int a[]=new int[7];
            a[4]=30/0;
            System.out.println("First print statement in try block");
        }
        catch(ArithmeticException e){
            System.out.println("Warning: ArithmeticException");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Warning: ArrayIndexOutOfBoundsException");
        }
        catch(Exception e){
            System.out.println("Warning: Some Other exception");
        }
        System.out.println("Out of try-catch block...");
    }

    public static void hashMapExample(){
        HashMap<String, String> objMap = new HashMap<>();
        objMap.put("Name", "Suzuki");
        objMap.put("Power", "220");
        objMap.put("Type", "2-wheeler");
        objMap.put("Price", "85000");
        System.out.println("Elements of the Map:");
        System.out.println(objMap);
        System.out.println(objMap.get("Type"));
        System.out.println(objMap.get("2-wheeler"));
        System.out.println(objMap.containsKey("sdfsd"));
        System.out.println(objMap.containsValue("85000"));
        objMap.remove("Price");
        objMap.put("Surname", "Gunduz");
        objMap.put("Type", "Gunduz");
        System.out.println(objMap.keySet());
    }

    public static void hashMapExampleII(){
        HashMap<String, List<String>> objMapII = new HashMap<>();
        ArrayList<String> arrayList = new ArrayList<>();
        objMapII.put("user", arrayList);
    }


}
