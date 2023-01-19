package day16_nestedLoop;

public class practice {
    public static void main(String[] args) {
        String name = "   chuck norris  ";
        name = name.trim().toUpperCase();
        String initials = name.charAt(0) + "." + name.substring(name.indexOf(" ") + 1, name.indexOf(" ") + 2) + ".";
        System.out.println(initials);
    }
}
