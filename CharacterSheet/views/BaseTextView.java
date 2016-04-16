package CharacterSheet.views;
import java.lang.StringBuilder;
import java.lang.Math;


public class BaseTextView {
    private DisplayType displayType = DisplayType.ASCII;
    private Lighting lighting = Lighting.TOP_RIGHT;
    private BoxCharacterMap characterMap;
    private TextBoxView boxView;
    
    public BaseTextView() {
        characterMap = getCharacterMap();
        TextBoxView boxViewManager = new TextBoxView(lighting, characterMap);
        setBoxViewer(boxViewManager);
    }
    
    public void displayBox(BaseBox dataBox) {
        String contents = boxView.generateBox(dataBox);
        output(contents);
    
    }
    
    public void zipBoxes(BaseBox firstBox, BaseBox secondBox) {
        String firstBoxContents = boxView.generateBox(firstBox);
        String secondBoxContents = boxView.generateBox(secondBox);
        String zippedContents = zip(firstBoxContents, secondBoxContents);
        output(zippedContents);
    }
    
    public String zip(String firstString, String secondString) {
        String[] firstLines = firstString.split("\n");
        String[] secondLines = secondString.split("\n");
        StringBuilder contents = new StringBuilder();

        int indexMaximum = Math.max(firstLines.length, secondLines.length);
        for (int y=0; y<=indexMaximum; y++) {
            StringBuilder lineContents =  new StringBuilder();
            if (firstLines.length > y) {
                lineContents.append(firstLines[y]);
            } else {
                int width = firstLines[0].length();
                String spacing = new String(new char[width]).replace("\0"," ");
                lineContents.append(spacing);
            }
            lineContents.append("  ");
            if (secondLines.length > y) {
                lineContents.append(secondLines[y]);
            } else {
                int width = secondLines[0].length();
                String spacing = new String(new char[width]).replace("\0"," ");
                lineContents.append(spacing);
            }
            lineContents.append("\n");
            contents.append(lineContents.toString());
                
        }
        return contents.toString();
    
    }
    
    public void output(String contents) {
        System.out.println(contents);
    }
    public BoxCharacterMap getCharacterMap(){
        return characterMap;
    }
    
    public TextBoxView getBoxView(){
        return boxView;
    }
    public void setBoxViewer(TextBoxView boxView){
        this.boxView = boxView;
    }
}
