import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String input = "abc/?lang=en";
        String regex = "^(.*?)\\/?";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            String output = matcher.group(1);
            System.out.println(output);
        } else {
            System.out.println("No match found");
        }
    }

    public static Integer test() {
        var list1 = List.of(1,2,3);
        var list2 = List.of(2,3,4);
        var userIds = Stream.of(list1, list2)
                .flatMap(Collection::stream)
                .toList();
        var duplicateUserIds = userIds.stream()
                .filter(m -> userIds.stream().filter(n -> n.equals(m)).count() > 1)
                .distinct()
                .toList();

        return duplicateUserIds.size();
    }

    public static void findElementDuplicate() {
        List<String> users = Arrays.asList("Alice", "Bob", "Charlie", "Alice", "Dave", "Bob", "Charlie");

        Map<String, Integer> userCounts = new HashMap<>();

        for (String user : users) {
            Integer count = userCounts.get(user);
            if (count == null) {
                count = 0;
            }
            userCounts.put(user, count + 1);
        }

        for (Map.Entry<String, Integer> entry : userCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void useMapInJava() {
        var list1 = List.of("a","b","c");
        var list2 = List.of("d","e","f");

    }
}