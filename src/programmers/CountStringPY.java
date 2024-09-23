package programmers;

public class CountStringPY {
    boolean solution(String s) {
        int p = 0;
        int y = 0;

        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'p') {
                p++;
            } else if (c == 'y') {
                y++;
            }
        }

        return p == y;
    }

    public static void main(String[] args) {
        CountStringPY test = new CountStringPY();
        String s = "pPoooyY";

        System.out.println(test.solution(s));
    }
}
