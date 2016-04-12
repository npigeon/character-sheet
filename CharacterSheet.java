import java.util.ArrayList;
import java.util.List;

public class CharacterSheet {
    public static BaseBox box;
    public static UnicodeView viewManager = new UnicodeView();

    public static void main(String args[]) {
        box = new FeatsBox(60);
        box.addLine("Combat Expertise");
        box.addLine("Improved Trip");
        box.addLine("Greater Trip");
        box.generateContents();
        viewManager.displayBox(box);
    }
}