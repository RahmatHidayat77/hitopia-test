import java.util.*;

class Soal1 {
    public static void weightString(String str, List<Integer> queries) {
        HashMap<String, Integer> weightString = new HashMap<String, Integer>();
        List<Integer> calculate = new ArrayList<>();

        weightString.put("a", 1);
        weightString.put("b", 2);
        weightString.put("c", 3);
        weightString.put("d", 4);
        weightString.put("e", 5);
        weightString.put("f", 6);
        weightString.put("g", 7);
        weightString.put("h", 8);
        weightString.put("i", 9);
        weightString.put("j", 10);
        weightString.put("k", 11);
        weightString.put("l", 12);
        weightString.put("m", 13);
        weightString.put("n", 14);
        weightString.put("o", 15);
        weightString.put("p", 16);
        weightString.put("q", 17);
        weightString.put("r", 18);
        weightString.put("s", 19);
        weightString.put("t", 20);
        weightString.put("u", 21);
        weightString.put("v", 22);
        weightString.put("w", 23);
        weightString.put("x", 24);
        weightString.put("y", 25);
        weightString.put("z", 26);

        String[] strSplit = str.toLowerCase().split("");
        HashMap<String, Integer> tempHashMap = new HashMap<String, Integer>();

        for (String x : strSplit) {
            Integer value = weightString.get(x);

            Integer tempInteger = tempHashMap.get(x);

            if (tempInteger == null) {
                tempHashMap.put(x,value);
            } else {
                tempHashMap.remove(x);
                tempHashMap.put(x, value + tempInteger);
                value = value + tempInteger;
            }


            calculate.add(value);
        }

        for (Integer i : calculate) {
            System.out.println(i);
        }

        List<String> result = new ArrayList<>();
        queries.forEach(x -> {
            if (calculate.contains(x)) {
                result.add("Yes");
            } else {
                result.add("No");
            }
        });    

        for (String r : result) {
            System.out.println(r);    
        }
    }




    public static void main(String[] args) {
        weightString("abbcccd", Arrays.asList(1, 3, 9, 8));
        System.out.println("--------------");
        weightString("xyyzzz", Arrays.asList(24, 25, 50, 100));
        System.out.println("--------------");
        weightString("passedtest", Arrays.asList(1, 10, 20, 30));
    }
}