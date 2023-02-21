public class Main {

    static String TEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {

        WordsChecker wch = new WordsChecker(TEXT);               // Создание экземпляра класса с текстом

        System.out.println(wch.hasWord("loot"));        //false
        System.out.println(wch.hasWord("ipsum"));       //true
        System.out.println(wch.hasWord("do"));          //true
        System.out.println(wch.hasWord("netology"));    //false
    }
}
