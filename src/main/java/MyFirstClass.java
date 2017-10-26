import com.sun.javafx.binding.StringFormatter;

public class MyFirstClass {

    //Java_001
    public static void main(String[] args) {
        System.out.println("This is my first output!");
        localVariables(5==5);
        intCalc();
        intDivision();
        incDecr();
        relationalOps();
        logicalOps();
        ifThenElse();
        ternaryOps();
        grading('B');
        whileExample();
        infiniteLoop();
        sumOfNaturalNumbersExample();
        forEachLoop();
        forLoopEx();
        forEachLoopEx();
        forLoopFineTuneExI();
        forEachLoopFineTuneExI();
        forLoopFineTuneExII();
        forEachLoopFineTuneExII();
        stringConcat();
        stringMethods();
        stringMethodChaining();
        stringBuilderMethods();
        stringVsStringBuilder();
        stringVsStringBuilderII();
        stringBuilderDeleteCharAt();
        stringBuilderReplace();
        stringBuilderInsert();
    }

    //Java_002
//    public static void main(String[]  args){
//        int i = null;
//    }

    //Java_003
    public static void localVariables(boolean check) {
        int answer;
        int onlyOneBranch;
        if (check) {
            onlyOneBranch = 1;
            answer = 1;
        }
        else {
            answer = 2;
        }
        System.out.println(answer);
//        System.out.println(onlyOneBranch); // DOES NOT COMPILE
        }


    //Java_004
    public static void intCalc() {
        int x = 2*((5+3)*4-8);
        int y = 2*5+3*4-8;
        System.out.println(x);
        System.out.println(y);
    }

    //Java_005
    public static void intDivision() {
        System.out.println("1: "+ 10 / 3);
        System.out.println("2: "+ 10 % 3);

        float sayi1 = 10.00f;
        float sayi2 = 3.00f;
        System.out.println("3: "+ sayi1/sayi2);

        double sayi3 = 10.00;
        double sayi4 = 3.00;
        System.out.println("3: "+ sayi3/sayi4);
    }

    //Java_006
    public static void incDecr() {
        int counter=0;

        System.out.println(counter);
        System.out.println(++counter);
        System.out.println(counter);
        System.out.println(counter--);
        System.out.println(counter);
    }

    //Java_007
    public static void relationalOps() {
        int x=10;
        int y= 5;
        System.out.println(x>y);
        System.out.println(x<y);
    }


    //Java_008
    public static void logicalOps(){
        int x=10;

        if(x != 8 && x > 5) {
            System.out.println("x is not 8 and x is larger than 5 at the same time");
        }

        if(x != 1 || x > 5) {
            System.out.println("x is not 1 but x is larger than 5");
        }
    }


    //Java_009
    public static void ifThenElse(){

        int a = 5;
        int b = 7;

        if( a > b ) {
            System.out.println("a is greater");
        }
        else{
            System.out.println("b is greater");
        }

    }


    //Java_010
    public static void ternaryOps(){
        int a = 5;
        int b = 7;

        String result = a > b ? "a is greater" : "b is greater";
        System.out.println(result);
    }


    //Java_011
    public static void grading(char grade){
            switch (grade) {
                case 'A':
                    System.out.println("Excellent grade");
                    break;
                case 'B':
                    System.out.println("Very good grade");
                    break;
                case 'C':
                    System.out.println("Good grade");
                    break;
                case 'D':
                case 'E':
                case 'F':
                    System.out.println("Low grade");
                    break;
                default:
                    System.out.println("Invalid grade");
                    break;
            }
        }

    //Java_012
    public static void whileExample(){
        int x = 10;

        while( x < 20 ) {
            System.out.print("value of x : " + x );
            x++;
            System.out.print("\n");
        }
    }

    //Java_013
    public static void infiniteLoop(){
        int x = 3;

        while( x < 2 ) {
            System.out.print("infinite loop");
        }
    }

    //Java_014 // Program to find the sum of natural numbers from 1 to 1000
    public static void sumOfNaturalNumbersExample(){
        int sum = 0;

        for (int i = 1; i <= 1000; ++i) {
            sum += i;     // sum = sum + i
        }

        System.out.println("Sum = " + sum);
    }

    //Java_015
    public static void forEachLoop(){
        int[] numbers = {3, 4, 5, -5, 0, 12};
        int sum = 0;

        for (int number: numbers) {
            sum += number;
        }

        System.out.println("Sum = " + sum);
    }


    //Java_016
    public static void forLoopEx(){
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < vowels.length; ++ i) {
            System.out.println(vowels[i]);
        }
    }


    //Java_016
    public static void forEachLoopEx(){
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for (char item:vowels) {
            System.out.println(item);
        }
    }


    //Java_017
    public static void forLoopFineTuneExI(){
        int[] values = new int[3];
        values[0] = 10;
        values[1] = new Integer(5);
        values[2] = 15;
        for(int i=1; i<values.length; i++) {
            System.out.print(values[i]-values[i-1] + ", ");
        }
    }

    //Java_017
    public static void forEachLoopFineTuneExI(){
            // We cannot do this in for each - since we dont have control over the iterator
    }

    //Java_017
    public static void forLoopFineTuneExII(){
        System.out.println("");
        java.util.List<String> names = new java.util.ArrayList<String>();
        names.add("Lisa");
        names.add("Kevin");
        names.add("Roger");
        for(int i=0; i<names.size(); i++) {
            String name = names.get(i);
            if(i>0) {
                System.out.print(", ");
            }
            System.out.print(name);
        }
    }

    //Java_017
    public static void forEachLoopFineTuneExII(){
        System.out.println("");
        java.util.List<String> names = new java.util.ArrayList<String>();
        names.add("Lisa");
        names.add("Kevin");
        names.add("Roger");

        for(String name:names){
            System.out.print(name + ", ");
        }
    }


    //Java_018
    public static void stringConcat(){
        int sayi1 = 5;
        int sayi2 = 10;
        int toplam = sayi1 + sayi2;
        System.out.println("int toplam = " + toplam);
        System.out.println("toplam = " + sayi1 + sayi2);

        String rakam1 = "5";
        String rakam2 = "10";
        System.out.println("rakamlar toplamı = " + rakam1 + rakam2);
    }


    //Java_019
    public static void stringMethods(){
        String string1 = "Comodo";

        System.out.println(string1.length());
        System.out.println(string1.charAt(3));
        System.out.println(string1.indexOf("o"));
        System.out.println(string1.substring(2));
        System.out.println(string1.substring(2, 4));
        System.out.println(string1.toLowerCase());
        System.out.println(string1.toUpperCase());

        //String string1 = "Comodo";
        String string2 = "Comodo";
        System.out.println(string2.equals("Comodo"));
        System.out.println(string2.equalsIgnoreCase("COmodo"));
        System.out.println(string2.startsWith("p"));
        System.out.println(string2.endsWith("4"));
        System.out.println(string2.contains("5"));
        System.out.println(string2.replace("Co", "co"));

        String string3 = "Comodo  ";
        System.out.println(string3.length());
        System.out.println(string3.trim().length());
//        System.out.println(string3.length());
//        System.out.println(string3.endsWith(" "));
    }


    //Java_020
    public static void stringMethodChaining(){
        // names = []
        // if user name starts with letter "a"  and ends with "b"
        // and if the user name contains letter "c" and the full name is 8 characters
        // then print the name of the user in all capital letters

        java.util.List<String> names = new java.util.ArrayList<String>();
        names.add("Kurt Liz");
        names.add("Alvin Cab ");
        names.add("Roger Joy");
        for(int i=0; i<names.size(); i++) {
            String name = names.get(i);
//        if(name.toLowerCase().startsWith("a") && name.trim().toLowerCase().endsWith("b") && name.toLowerCase().contains("c") && name.trim().length()== 9) {
//            System.out.print(name.toUpperCase());
//        }
          if (name.startsWith("a") && name.endsWith("b") && name.contains("c") && name.length() == 8 ) {
              System.out.println(name.toUpperCase());
          }
    }

    }

    //Java_021
    public static void stringVsStringBuilder(){
        String alpha = "";
        for(char current = 'a'; current <= 'z'; current++){
            alpha += current;
        }
        System.out.println(alpha);
        // The empty String on line 10 is instantiated, and then line 12 appends an "a". However,
        //        because the String object is immutable, a new String object is assigned to alpha and the “” object becomes eligible for garbage collection
//        The next time through the loop, alpha is
//        assigned a new String object, "ab", and the "a" object becomes eligible for garbage
//        collection. The next iteration assigns alpha to "abc" and the "ab" object becomes eligible
//        for garbage collection, and so on.


//        This is very inefficient.  The StringBuilder class
//        creates a String without storing all those interim String values. Unlike the String class,
//        StringBuilder is not immutable.
    }

    //Java_021
    public static void stringVsStringBuilderII(){
        StringBuilder alpha = new StringBuilder();
        for(char current = 'a'; current <= 'z'; current++){
            alpha.append(current);
        }
        System.out.println(alpha);
        //  This code reuses the same StringBuilder without
        // creating an interim String each time.
    }


//    When we chained String method calls, the
//    result was a new String with the answer. Chaining StringBuilder objects doesn’t work
//    this way. Instead, the StringBuilder changes its own state and returns a reference to itself!

    //Java_021
    public static void stringBuilderMethods(){

        // Strings should always be used unless string builders offer an advantage in terms of simpler code (see the sample program at the end of this section) or better performance.
        // For example, if you need to concatenate a large number of strings, appending to a StringBuilder object is more efficient

        //The principal operations on a StringBuilder that are not available in String are the append() and insert() methods, which are overloaded so as to accept data of any type.
        // Each converts its argument to a string and then appends or inserts the characters of that string to the character sequence in the string builder.
        // The append method always adds these characters at the end of the existing character sequence, while the insert method adds the characters at a specified point.

        // At the point where you're concatenating in a loop - that's usually when the compiler can't substitute StringBuilder by itself.
        String string1 = "Comodo  ";

        System.out.println(string1.trim().length());
        System.out.println(string1.length());

        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle");
        System.out.println("sb = " + sb);

        // What should do below code print. Why?
        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("a=" + a);
        System.out.println("b=" + b);

    }

    //Java_021
    public static void stringBuilderDeleteCharAt() {
        String str = "M1y java8 Progr5am";
        StringBuilder build = new StringBuilder(str);
        build.deleteCharAt(1);  // Shift the positions front.
        System.out.println("Builder delete char at : "+build);
    }

    public static void stringBuilderReplace() {
        String str = "M1y java8 Progr5am";
        StringBuilder builder = new StringBuilder(str);
        builder.replace(1, 2, ""); // Shift the positions front.
        builder.replace(7, 8, "");
        builder.replace(13, 14, "");
        System.out.println("Builder replace : "+builder);
    }

    public static void stringBuilderInsert() {
        StringBuilder str = new StringBuilder("Tutorial");
        System.out.println("string = " + str);

        // insert character value at offset 8
        str.insert(8, 's');

        // prints StringBuilder after insertion
        System.out.print("After insertion = ");
    }

    //For the class relations
    public static void write(String text){
        System.out.println(text);
    }

}
