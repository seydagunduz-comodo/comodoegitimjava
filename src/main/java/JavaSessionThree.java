import java.util.ArrayList;
import java.util.HashMap;

public class JavaSessionThree {

    public static void main(String[] args){
//        arraysForLoop();
//        multiDimArray();
//        arrayListWithType();
//        arrayListWithoutType();
//        arrayListOps();

//        arrayListEquals();
//        hashMapExampe();

//        staticCount();
//        createKopek(5, "brown");
//        exceptionExample();
    }

    public static void arrays(){
        String[] mammals = {"monkey", "chimp", "donkey"};
        System.out.println(mammals.length);
        System.out.println(mammals[0]);
        System.out.println(mammals[2]);
        System.out.println(mammals[3]);
    }

    public static void arraysForLoop(){
        int[] numbers = new int[10];

        for(int i =0; i < numbers.length; i++){
            numbers[i] = i + 5;
            System.out.println(numbers[i]);
        }
    }

    public static void multiDimArray(){
        String[][][] familyGroup = {
                {
                        {"a", "s", "25"},
                        {"h", "hgh", "56"}
                },
                {
                        {"gg", "jj", "78"},
                        {"baby"},
                        {"b","bII", "h", "67"}
                }
        };
        System.out.println(familyGroup.length);
        System.out.println(familyGroup[0]);
        System.out.println(familyGroup[0].length);
        System.out.println(familyGroup[1].length);

        System.out.println("1-1 " + familyGroup[0][0].length );
        System.out.println("2-1 " + familyGroup[1][0].length );

        for (String[][] array2d: familyGroup ){
            for (String[] array1d: array2d){
                for (String item: array1d){
                    System.out.println("items: " + item);
                }
            }
        }

    }

    public static void arrayListWithType(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("ali");
        arrayList.add("brk");
        System.out.println(arrayList);
    }

    public static void arrayListWithoutType(){
        ArrayList arrayList = new ArrayList();
        arrayList.add("ali");
        arrayList.add("brk");
        arrayList.add(5);
        arrayList.add(Boolean.TRUE);
        System.out.println(arrayList);
    }

    public static void arrayListOps(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("oktay");
        arrayList.add("özcan");
        arrayList.add("aslı");
        arrayList.add("bedirhan");

        arrayList.remove("oktay");
        System.out.println(arrayList);
        arrayList.remove(2);
        System.out.println(arrayList);
        arrayList.add("özcan");
        arrayList.add("aslı");
        arrayList.add("bedirhan");
        arrayList.remove("özcan");
        System.out.println(arrayList);

        arrayList.set(0, "AslıYokArtık");
        System.out.println(arrayList);

    }

    public static void arrayListEquals(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("oktay");
        arrayList.add("özcan");
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("özcan");
        arrayList2.add("oktay");
        System.out.println(arrayList2.size());

        System.out.println(arrayList.equals(arrayList2));
    }


    public static void hashMapExampe(){
        HashMap<String, String> objMap = new HashMap<>();

        objMap.put("Name", "Suzuki");
        objMap.put("Power", "220");
        objMap.put("Type", "2-wheeler");
        objMap.put("Price", "85000");
        System.out.println(objMap);

        System.out.println(objMap.get("Type"));
        System.out.println(objMap.get("2-wheeler"));
        System.out.println(objMap.containsValue("2-wheeler"));
        System.out.println(objMap.containsKey("Power"));

        objMap.remove("Price");
        System.out.println(objMap);
//        System.out.println(objMap.put("Type", "seyda"));
        System.out.println(objMap);
        System.out.println(objMap.keySet());
    }

    public static void staticall(){
        MyFirstClass.write("abc");
        MyFirstClass.main(new String[0]);
    }

    public static void staticCount(){
        Cow cowGroupI = new Cow();
        System.out.println(cowGroupI.foodAmunt);

        Cow cowGroupII = new Cow();
        cowGroupII.foodAmunt = 40;

        Cow.printFoodAmount();
    }

    private static String name = "name";
    public static void printName(){
        System.out.println(name);
    }


    public static void createKopek(int weight, String color){
        Kopek kopecik = new Kopek(weight, color);
    }

    public static void exceptionExample(){
        int num1, num2;

        try{
            num1 = 0;
            num2 = 55;
            System.out.println(num2/num1);
        } catch(ArithmeticException e){
            System.out.println("divide by zero");
            e.printStackTrace();
        } finally {
            System.out.println("her durumda yazıyoruz");
        }

    }

    public static void multipleCatchExample(){
        try {
            int a[] = new int[7];
            a[4] = 30/0;
        }
        catch(ArithmeticException e){
            System.out.println("aritmetik");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array bound issue");
        }
        catch (Exception e){
            System.out.println("some other exception");
        }
        System.out.println("out of block");
    }

}
