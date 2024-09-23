package programmers;

public class CensoredPhoneNo {
    public String solution(String phone_number) {
        for (int i = 0; i < phone_number.length(); i++) {
            char[] phone = {phone_number.charAt(i)};
             
        }
        return phone_number;
    }

    public static void main(String[] args) {
        CensoredPhoneNo test = new CensoredPhoneNo();
        String phone_number = "01012345678";

        System.out.println(test.solution(phone_number));
    }
}
