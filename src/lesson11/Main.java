package Lesson11;

import java.util.*;

public class Main {
    public static List<Integer> searchInArrayList(List<Integer> list, Integer searchCriteria) {
        //TODO...
        List<Integer> result = new ArrayList<>();
        for (Integer item : list) {
            if (item.equals(searchCriteria)) {
                result.add(item);
            }
        }
        System.out.print("Searched " + searchCriteria + " was found " + result.size() + " times = ");
        return result;
    }

    public static List<Integer> reverseInArrayList(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            result.add(list.get(i));
        }
        //Collections.reverse(list);
        return result;
    }

    public static void main(String[] args) {
        List<Integer> testList = new ArrayList<>();
        testList.add(5);
        testList.add(2);
        testList.add(4);
        testList.add(7);
        testList.add(8);
        testList.add(9);
        testList.add(3);
        testList.add(1);
        testList.add(6);
        testList.add(6);

        System.out.println("ArrayList<> = " + testList);
        List<Integer> searchResult = searchInArrayList(testList, 6);
        System.out.println(searchResult);

        List<Integer> reverseResult = reverseInArrayList(testList);
        System.out.println(reverseResult);

        Collections.reverse(testList);
        System.out.println(testList);

        int lookup = Collections.binarySearch(testList, 9);
        System.out.println("Binary Search: " + lookup);
        System.out.println("Lookup Value: " + testList.get(lookup));

        Collections.shuffle(testList);
        System.out.println(testList);

        Set<Integer> testSet = new HashSet<>();
        System.out.println("Add 4: " + testSet.add(4));
        System.out.println("Add 3: " + testSet.add(3));
        System.out.println("Add 5: " + testSet.add(5));
        System.out.println("Add 6: " + testSet.add(6));
        System.out.println("Add 2: " + testSet.add(2));
        System.out.println("Add 3: " + testSet.add(3));
        System.out.println(testSet);

        Set<String> testSetString = new TreeSet<>();
        testSetString.add("aab");
        testSetString.add("1");
        testSetString.add("aaa");
        testSetString.add("aac");
        testSetString.add("aaC");
        testSetString.add("2");
        testSetString.add("aaa");
        System.out.println(testSetString);
        System.out.println("1++++++++++++++++++++++++++++++++++++");

        Auto auto1 = new Auto(3000, "BMW", 2000);
        Auto auto2 = new Auto(2000, "Honda", 3000);
        Auto auto3 = new Auto(5000, "Citroen", 1000);
        Set<Auto> autoSet = new TreeSet<>();
        autoSet.add(auto1);
        autoSet.add(auto2);
        autoSet.add(auto3);
        System.out.println(autoSet);
        System.out.println("2++++++++++++++++++++++++++++++++++++");

        AutoPriceComparator priceComparator = new AutoPriceComparator();
        Set<Auto> autoSetWithComparator = new TreeSet<>(priceComparator);
        autoSetWithComparator.add(auto1);
        autoSetWithComparator.add(auto2);
        autoSetWithComparator.add(auto3);
        System.out.println(autoSetWithComparator);

        System.out.println("3++++++++++++++++++++++++++++++++++++");

        Set<Auto> setWithAnonymousComparator = new TreeSet<>(new Comparator<Auto>() {
            @Override
            public int compare(Auto o1, Auto o2) {
                return o1.getProducer().compareTo(o2.getProducer());
            }
        });
        setWithAnonymousComparator.add(auto1);
        setWithAnonymousComparator.add(auto2);
        setWithAnonymousComparator.add(auto3);

        System.out.println(setWithAnonymousComparator);

        System.out.println("4++++++++++++++++++++++++++++++++++++");




    }
}
