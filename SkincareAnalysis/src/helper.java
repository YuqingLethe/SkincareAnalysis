import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class helper {
    public static void makeSetLowerCase(Set<String> strings)
    {
        String[] stringsArray = strings.toArray(new String[0]);
        for (int i = 0; i < stringsArray.length; ++ i)
        {
            stringsArray[i] = stringsArray[i].toLowerCase();
        }
        strings.clear();
        strings.addAll(Arrays.asList(stringsArray));
    }

    public static void makeSetUpperCase(Set<String> strings)
    {
        String[] stringsArray = strings.toArray(new String[0]);
        for (int i = 0; i < stringsArray.length; ++ i)
        {
            stringsArray[i] = stringsArray[i].toUpperCase();
        }
        strings.clear();
        strings.addAll(Arrays.asList(stringsArray));
    }

    public static HashSet<String> stringToSet(String s) {
        HashSet<String> returnSet = new HashSet<>(Arrays.asList(s.split(",\\s*")));
        return returnSet;
    }
}
