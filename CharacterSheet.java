import java.util.ArrayList;
import java.util.List;

public class CharacterSheet {
    public static Box box = new Box("Attacks");
    public static UnicodeView viewManager = new UnicodeView();

    public static void main(String args[]) {
        List<String> contents = new ArrayList<String>();
        contents.add("This is a test");
        contents.add("This too");
        box.setLines(contents);
        viewManager.displayBox(box);
    }
}