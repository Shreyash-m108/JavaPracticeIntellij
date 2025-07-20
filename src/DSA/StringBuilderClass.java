package DSA;

import com.practice.StringBuilders;

public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder builders = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            char alpha = (char)('a'+i);
            builders.append(alpha);
        }
        System.out.println(builders);
    }
}
