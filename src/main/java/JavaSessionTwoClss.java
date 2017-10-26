

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class JavaSessionTwoClss {

    public static void main(String[] args){
        multipleCatchExample();
    }

    public static void arrays(){
        String[] mammals = {"monkey", "chimp", "donkey"};
        System.out.println(mammals.length);
        System.out.println(mammals[0]);
        System.out.println(mammals[2]);
        System.out.println(mammals[3]);
    }

    public static void arrayForLoopExample(){
        int[] array = new int[10];

        for(int i=0; i<array.length ;i++){
            array[i] = i+5;
            System.out.println(array[i]);
        }
    }

    public static void threeDimArray(){
        String[][][] test = {
                {
                        {"a", "b", "32"},
                        {"d", "e", "20"}
                },
                {
                        {"adam", "s", "surn","43"},
                        {"baby"},
                        {"d", "hg", "65"}
                }
        };

        System.out.println(test);
        System.out.println(test.length);
        System.out.println(test[0][0]);
        System.out.println("1-1 " + test[0][0].length);
        System.out.println("1-2 " + test[0][1].length);
        System.out.println("2-1 " + test[1][0].length);

        for(String[][] array2d: test){
            System.out.println("array 2d " + array2d);
            for (String[] array1d: array2d){
                for (String item: array1d){
                    System.out.println("item: " + item);
                }
            }
        }
    }

    public static void arraylistWithType(){
        ArrayList<String> safeList = new ArrayList<>();
        safeList.add("abc");
        safeList.add("yasin");
        System.out.println(safeList);
    }

    public static void arraylistWithoutType(){
        ArrayList safeList = new ArrayList();
        safeList.add("abc");
        safeList.add("yasin");
        safeList.add(Boolean.TRUE);
        safeList.add(5);
        System.out.println(safeList);
    }

    public static void arrayOps(){
        ArrayList<String> array = new ArrayList<>();
        array.add("Merve");
        array.add("Nil");
        array.add("Fidan");
        array.add("Yasin");
        System.out.println(array);

        array.remove("Merve");
        System.out.println(array);
        System.out.println(array.remove(1));
        System.out.println(array);
        array.add("ahmet");
        array.add("Nil");
        array.add("abc");
        array.remove("Nil");
        System.out.println(array);
        array.set(0, "Yasin2");
        System.out.println(array);
    }


    public static void arrayEquals(){
        List<String> names = new ArrayList<>();
        names.add("ali");
        names.add("ayse");

        List<String> names2 = new ArrayList<>();
        names2.add("ayse");
        names2.add("ali");

        System.out.println(names2.containsAll(names));
        System.out.println(names.equals(names2));
    }

    public static void hashMapExample(){
        HashMap<String, String> objMap = new HashMap<>();
        objMap.put("Name", "Suzuki");
        objMap.put("Power", "220");
        objMap.put("Type", "2-wheeler");
        objMap.put(null, "fhg");
        objMap.put("Price", "85000");
        System.out.println(objMap);
        System.out.println(objMap.get("Type"));
        System.out.println(objMap.get("2-wheeler"));
        System.out.println(objMap.containsKey("Power"));
        System.out.println(objMap.containsValue("Power"));

        objMap.remove("Power");
        System.out.println(objMap.keySet());
        System.out.println(objMap);
    }

    public static void hashMapExampleII(){
        HashMap<String, List<String>> hashMap = new HashMap<>();
        ArrayList<String> arrayList = new ArrayList<>();
        hashMap.put("userName", arrayList);
    }

    public static void staticCall(){
        MyFirstClass.write("abc");
    }


    public static void staticCount(){
        Kedi ankaraKedisi = new Kedi();
        System.out.println(ankaraKedisi.foodAmount);

        Kedi siyamKedisi = new Kedi();
        siyamKedisi.foodAmount = 50;
        System.out.println(Kedi.foodAmount);

        Kedi abc = new Kedi();
        abc.foodAmount = 15;

        Kedi.printFoodAmound();
    }

    private static String name ="name";

    public void staticInstanceCall(){
        System.out.println(name);
    }

    public static void createFish(int weight, String color){
        Balik balik = new Balik(weight, color);
    }

    public static void exceptionExample(){
        int num1, num2;

        try{
            num1 = 0;
            num2 = 62;
            System.out.println(num2/num1);
        }
        catch(Exception e){
            System.out.println("divide by zero");
            e.printStackTrace();
        } finally {
            System.out.println( "burayı her durumda yazıyoruz");
        }
    }

    public static void multipleCatchExample(){
        try{
            int a[] = new int[7];
            a[8] = 30/0;
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("index out of bounds");
        }catch(ArithmeticException e){
            System.out.println("arithmetic");
        }

        catch(Exception e){
            System.out.println("Ooops!");
        }
    }
}
