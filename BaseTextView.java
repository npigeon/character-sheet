
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