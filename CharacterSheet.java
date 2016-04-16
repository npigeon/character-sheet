import java.util.ArrayList;
import java.util.List;

public class CharacterSheet {
    public static BaseBox box;
    public static TitledBox newBox;
    public static UnicodeView viewManager = new UnicodeView();

    public static void main(String args[]) {
        box = new FeatsBox(40);
        box.addLine("Combat Expertise");
        box.addLine("Improved Trip");
        box.addLine("Greater Trip");
        box.generateContents();
        newBox = new TitledBox(40);
        newBox.setTitle("Barbarian Abilities");
        newBox.addLine("Barbarian Rage");
        newBox.addLine("Primal Whatever");
        newBox.generateContents();
        viewManager.zipBoxes(box, newBox);
    }
}