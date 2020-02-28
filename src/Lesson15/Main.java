package Lesson15;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String string1 = new String("str");
        String string2 = new String("str");

        System.out.println(string1 == string2);
        System.out.println(string1.compareTo(string2));
        System.out.println(string1.equals(string2));
        System.out.println("--------------------------------------------------");

        String string11 = new String("AAAB");
        String string21 = new String("AAAb");
        System.out.println(string11.compareTo(string21));
        System.out.println("Ignore case = " + string11.equalsIgnoreCase(string21));

        System.out.println("--------------------------------------------------");
        //String pool:
        String string12 = "str";
        String string22 = "str";
        System.out.println(string12 == string22);

        System.out.println("Immutability --------------------------------------------------");
        String string13 = "str";
        string13 += "^" + string12;

        System.out.println("After concatenation:" + string13);

        StringBuilder stringBuilder = new StringBuilder(string13);
        for (int i = 0; i < 30; i++) {
            stringBuilder.append("WETRREWTREW" + i);
        }
        System.out.println(stringBuilder.toString());

        //Trim:
        String stringToTrim = "     jhak      ";
        System.out.println("\"" + stringToTrim + "\"");
        System.out.println("\"" + stringToTrim.trim() + "\"");
        System.out.print("New line symbol: \t");
        System.out.print("New line symbol: \n");

        //Char at, index of
        String forCharAt = "ABCDEF";
        System.out.println("3 Char at in " + forCharAt + ": " + forCharAt.charAt(3));
        System.out.println("CD Index of in " + forCharAt + ": " + forCharAt.indexOf("Z"));

        //SubString:
        String subString = "Hello Nik! I am good.";
        System.out.println("Person name: " + subString.substring(6, 9));
        System.out.println("Person name: " + subString.substring(6));

        //Replace:
        String forReplace = "XYZZYXXZVZDZZK";
        System.out.println("Before replace: " + forReplace);
        System.out.println("After replace: " + forReplace.replace('Z', '#'));
        System.out.println("Contains: ----------------------------------------------------");
        String forContains = "ABCD";
        System.out.println(forContains + "contains A:" + forContains.contains("A"));
        System.out.println(forContains + "contains CD:" + forContains.contains("CD"));
        System.out.println(forContains + "contains BD:" + forContains.contains("BD"));

        System.out.println("Start with: ----------------------------------------------------");
        //Start with
        String forStartsWith = "ABCD";
        System.out.println(forStartsWith + "start with A:" + forStartsWith.startsWith("A"));
        System.out.println(forStartsWith + "start with B:" + forStartsWith.startsWith("B"));

        System.out.println("Split: ----------------------------------------------------");
        //Split
        String forSplit = "Hello-my-friend!";
        String[] split = forSplit.split("-");
        List<String> list = Arrays.asList(split);

        list.forEach(w -> System.out.println(w));
        list.forEach(System.out::println);

        list.stream().map(w -> w.length()).forEach(System.out::println);
        list.stream().map(String::length).forEach(System.out::println);
        processString("Hello Dmitry. I reu teurj test temp");
        System.out.println(replacer("Hello: Who are you: ..  :::"));
        processMaxMin();
    }

    private static void processString(String sentence) {
        String[] split = sentence.split(" ");
        List<String> list = Arrays.asList(split);
        list.stream().filter(w -> w.startsWith("A") || w.startsWith("a"))
                .forEach(System.out::println);
        list.stream().filter(w -> w.endsWith("J") || w.endsWith("j"))
                .forEach(System.out::println);
        list.stream().filter(w -> w.startsWith("L"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
        list.stream().filter(w -> w.contains("T"))
                .map(String::toLowerCase)
                .forEach(System.out::println);
    }


    private static void processMaxMin(){

        String s = "hello hellllooooo hell heloooooooooooo1 hello0";
        String[] words = s.split(" ");
        Optional<String> theShortestWord = Arrays.stream(words).min(Comparator.comparingInt(String::length));
        Optional<String> theLongestWord = Arrays.stream(words).max(Comparator.comparingInt(String::length));
        theShortestWord.ifPresent(word -> {
            System.out.println("The shortest word is:" + word + s.indexOf(word));
        });
        theLongestWord.ifPresent(word -> {
            System.out.println("The longest word is:" + word + s.indexOf(word));
        });
    }

    private static String replacer(String stringForReplace) {
        System.out.println(splitterator(stringForReplace, "").stream().filter(s -> s.equals(":")).count());
        return stringForReplace.replace(':', ';');
    }

    private static List<String> splitterator(String string, String regexp) {
        String[] split = string.split(regexp);
        return Arrays.asList(split);
    }
}
