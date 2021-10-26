package InterviewQuestions.java.strings;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringSplit {

    public static String maxRepeated(String input) {
        String[] strArr = input.split(" ");
        Map<String, Integer> map = new HashMap<>();

        int maxCt = 0;
        String res = "";

        for (String s : strArr) {
            if (s.equals(""))
                continue;

            int ct = 1;
            if (map.containsKey(s)) {
                ct = map.get(s) + 1;
            }

            map.put(s, ct);

            if (ct > maxCt) {
                maxCt = ct;
                res = s;
            }
        }

        return res;
    }


    public static boolean authenticate(String user, String pass) {
        return false;
    }

    public static void parser(String fileName) {
        // logs = readFile(fileName)

        List<String> logs = new ArrayList<>();
        logs.add("1234:login:user1:passs1:error");
        logs.add("1235:login:user2:passs2:error");
        logs.add("1236:login:user3:passs3:pass");
        logs.add("1237:login:user4:passs4:pass");
        logs.add("1238:login:user5:passs5:pass");
        logs.add("1239:login:user6:passs6:error");
        logs.add("1239:login:user6::");

        for (int i = 0; i < logs.size(); i++) {
            List<String> up = getUserPasswd(logs.get(i));

            if (!up.get(0).equals("") && !up.get(1).equals("")) {
                System.out.println("USer: " + up.get(0) + "  Pass: " + up.get(1));
                System.out.println("Is autheticated? " + authenticate(up.get(0), up.get(1)));
            }
        }
    }

    public static List<String> getUserPasswd(String line) {
        String[] result = line.split(":");
        List<String> up = new ArrayList<>();

        up.add(result[2]);
        up.add(result[3]);

        return up;
    }

    public static List<String> readFile(String fileName) {
        // open the file, read line by line. Return the list
        return null;
    }

    public static void main(String[] args) throws FileNotFoundException {


    }
}
