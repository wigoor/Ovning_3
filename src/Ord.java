import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ord {


    public static String palindrom(String ord) {

        ord = ord.toLowerCase();

        StringBuilder builder = new StringBuilder(ord);


        if (builder.reverse().toString().equals(ord)) {
            return "True - " + ord + " == " + builder;
        } else {
            return "False - " + ord + " != " + builder;

        }
    }

    public static String isogram(String ord) {

        char arr[] = ord.toLowerCase().toCharArray();

        Arrays.sort(arr);
        for (int i = 0; i < ord.length() - 1; i++) {
            if (arr[i] == arr[i + 1])
                return "False - " + ord + " är inte en isogram";
        }
        return "True - " + ord + " är en isogram";
    }

    public static String pangram(String ord) {


        String[] bokstavsArray = ord.toLowerCase().replaceAll("\\P{L}+", "").split("");
        Set<String> bokstavsHashSet = new HashSet<String>(Arrays.asList(bokstavsArray));
        if (29 == bokstavsHashSet.size()) {
            return "True - " + ord + " är en Isogram";
        }

        return "False - " + ord + " är inte en Isogram";


    }

}



