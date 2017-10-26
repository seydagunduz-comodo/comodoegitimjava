import java.util.ArrayList;
import java.util.HashMap;

public class JavaSessionFour {

    public static void main(String[] args){
//        arrays();
//        arrayForLoop();
//        multiDimArray();
//        arrayListWithType();
//        arrayListWithoutType();
//        arrayListRemove();
//        arrayListOps();
//        hashMapExample();
//        staticCount();
//        createDolphin(5, "light gray");
        exceptionExample();
    }

    public static void arrays(){
        String[] mammals = {"monkey", "donkey", "chimp"};
        System.out.println(mammals.length);
        System.out.println(mammals[0]);
        System.out.println(mammals[3]);
    }

    public static void arrayForLoop(){
        int[] array = new int[10];
        for (int i=0;i<array.length ;i++){
            array[i] = i + 5;
            System.out.println(array[i]);
        }

    }
    public static void multiDimArray(){
        String[][][] familyGroup = {
                {
                        {"muhammed", "nalci", "32"},
                        {"ayse", "yurt","nalci", "28"}
                        },
                {
                        {"cansu", "tilki", "danışmaz", "26"},
                        {"baby"},
                        {"furkan", "danışmaz", "32"}}
        };

        System.out.println(familyGroup.length);
        System.out.println(familyGroup[0][1].length);


        for(String[][] array2d: familyGroup){
            for (String[] array1d: array2d){
                for (String item: array1d){
                    System.out.println(item);
                }
            }
        }
    }

    public static void arrayListWithType(){
        ArrayList<String> arraylist = new ArrayList<>();
        arraylist.add("Ali");
        arraylist.add("ayse");
        arraylist.add("muhammed");
        System.out.println(arraylist);
    }

    public static void arrayListWithoutType(){
        ArrayList arraylist = new ArrayList();
        arraylist.add("Ali");
        arraylist.add("ayse");
        arraylist.add("muhammed");
        arraylist.add(5);
        arraylist.add(Boolean.TRUE);

        System.out.println(arraylist);
    }

    public static void arrayListRemove(){
        ArrayList<String> objMap = new ArrayList<>();
        objMap.add("Muhammed");
        objMap.add("Cansu");
        objMap.add("Taylan");

        System.out.println(objMap);
        objMap.remove("Cansu");
        objMap.remove(0);
        System.out.println(objMap);
        objMap.add("Kübra");
        objMap.add("Kübra");
        objMap.add("Nil");
        objMap.add("Nil");
        System.out.println(objMap);
        objMap.remove("Kübra");
        System.out.println(objMap);
    }

    public static void arrayListOps(){
        ArrayList<String> objMap = new ArrayList<>();
        objMap.add("Muhammed");
        objMap.add("Cansu");
        objMap.add("Taylan");

        objMap.set(2, "Ayşe");
        System.out.println(objMap);

        ArrayList<String> objMap2 = new ArrayList<>();
        objMap.add("Muhammed");
        objMap.add("Ayşe");
        objMap.add("Cansu");

        System.out.println(objMap.equals(objMap2));
    }

    public static void hashMapExample(){
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Name", "Suzuki");
        hashMap.put("Power", "220");
        hashMap.put("Type", "2-wheeler");
        hashMap.put("Price", "85000");
        System.out.println(hashMap);
        System.out.println(hashMap.get("Power"));
        System.out.println(hashMap.get("85000"));
        System.out.println(hashMap.containsValue("85000"));

        hashMap.remove("Type");
        System.out.println(hashMap);

        hashMap.put("Price", "sdfjsdfjk");
        System.out.println(hashMap);


    }

    public static void staticCall(){
        MyFirstClass.write("abc");
        MyFirstClass.main(new String[0]);
    }

    public static void staticCount(){
        Camel camel1 = new Camel();
        System.out.println(camel1.foodAmount);

        Camel camel2 = new Camel();
        camel2.foodAmount = 40;

        Camel.printFoodAmount();
    }

    public static String name = "name";

    public static void staticMethodInstanceCall(){
        System.out.println(name);
    }

    public static void createDolphin(int weight, String color){
        Dolphin ourDolphin = new Dolphin(weight, color);
    }


    public static void exceptionExample(){
        int num1, num2;

        try {
            num1 = 1;
            num2 = 33;
            System.out.println(num2/num1);
        } catch(Exception e){
            System.out.println("divide by zero");
            e.printStackTrace();
        } finally {
            System.out.println("her durumda burayı yazdır");
        }
    }

    public static void multipleCatchExample(){
        try{
            int a[] = new int[7];
            a[4] = 30/0;
        }
        catch( ArithmeticException e){
            System.out.println("aritmetik");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array hatası");
        }
        catch (Exception e){
            System.out.println("öngörülemeyen");
            e.printStackTrace();
        }
    }
}
