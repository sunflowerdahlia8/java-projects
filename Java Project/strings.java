public class strings {
    public static void main(String[] args){
        // String (char chars[])
        char chars[] = {'N', 'A', 'I', 'Y', 'A', 'N', 'A'};
        String s = new String(chars);
        System.out.println(s);

        // String (char chars[], int startIndex, int count)
        char charot[] = {'N', 'A', 'I', 'Y', 'A', 'N', 'A'};
        String i = new String(charot, 3, 4);
        System.out.println(i);

        // String (byte byteArr[])
        byte b[] = {74, 117, 110, 101};
        String t = new String(b);
        System.out.println(t);

        // String (byte byteArr[], int startIndex, int count)
        byte y[] = {83, 76, 65, 89, 69, 82};
        String r = new String(y, 0, 4);
        System.out.println(r);
    }
}
