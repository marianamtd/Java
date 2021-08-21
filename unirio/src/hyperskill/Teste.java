public class Teste {
    public static void main(String[] args) {

        char ch = 'e';
        ch -= 'a';
        ch++;
        ch += 'b';
        System.out.println(ch);

        String firstName = "Mariana";
        String lastName = "Duarte";

        //concarenation using concat method
        String fullname = firstName.concat(" ").concat(lastName);

        String str = "oioi" + 10 + true;
        System.out.println(str);

        String first = "first";
        String second = "second";

        String anotherFirst = "first";
        String secondUpper = "SECOND";

        System.out.println(first.equals(anotherFirst));
        System.out.println(first.equals(second));
        System.out.println(second.equals(secondUpper));
        System.out.println(second.equals(second));



    }
}
