package InterviewQuestions.java.strings;

public class LengthOfStringWithOutInbuilt {

    public static void main(String[] args) {

        String str = "Hello java world";
        System.out.println("Length of string str is: " + getLengthWithoutInbuilt(str));
    }

    public static int getLengthWithoutInbuilt(String s) {

//        char[] charArray = s.toCharArray();
//        int i = 0;
//        for (char c : charArray) {
//            i++;
//        }
//        return i;

        /*Using try catch method*/

        int i = 0;
        try {
            for (i = 0; ; i++)
                s.charAt(i);
        } catch (Exception e) {

        }
        return i;
    }

}
