package InterviewQuestions.java.strings;

public class OneStringRotationOfAnother {

    public static void main(String[] args) {

        System.out.println("Ice Fire and Fire Ice are rotation of each other: " + rotationString("IceFire", "FireIce"));
        System.out.println("Abc and cba are rotation of each other: " + rotationString("Abc", "cba"));
    }

    public static boolean rotationString(String s1, String s2) {

        String str3;

        str3 = s1 + s1;

        if (str3.contains(s2)) {
            return true;
        } else
            return false;
    }

}
