import java.util.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public boolean thisCausesFindBugWarnings(String s) {
        return "abc".equals(s);
    }

    public void thisCreatesCompilerWarnings() {
        List<String> a = new ArrayList<String>();
        a.add("foo");
    }

    // we'll be testing this method from tests
    public int add(int x, int y) {
        return x+y;
    }
}
