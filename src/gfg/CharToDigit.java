package gfg;

public class CharToDigit {

    public static void main(String[] args) {

//        char ch  = '7';
//        int digit = ch- '0';
//        System.out.println(digit);

//        String s = "123";
//        int num = 0;
//        for (int i=0; i< s.length(); i++){
//            char ch = s.charAt(i);
//            int digit = ch - '0';
//
//            num = num*10 + digit;
//        }
//        System.out.println(num);


//        String s = "123c5545";
//        int num = 0;
//        for (int i=0; i< s.length(); i++){
//            char ch = s.charAt(i);
//
//            if(ch> '9' || ch < '0'){
//                break;
//            }
//
//            int digit = ch - '0';
//            num = num*10 + digit;
//        }
//        System.out.println(num);


        String s = "    1235545";
        int sign = 1;
        int num = 0;
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == ' ' || ch == '+' || ch == '-') {

                if (ch == '-') {
                    sign = -1;
                    continue;
                } else if (ch == '+') {
                    sign = +1;
                    continue;
                } else {
                    continue;
                }
            }

            if (ch > '9' || ch < '0') {
                break;
            }

            int digit = ch - '0';
            num = num * 10 + digit;
        }
        System.out.println(num * sign);
    }

}
