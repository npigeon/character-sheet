public class UnicodeView extends BaseTextView {
    private Lighting lighting = Lighting.TOP_RIGHT;
    private BoxCharacterMap characterMap = new UnicodeCharacterMap();

    public UnicodeView() {
        characterMap = getCharacterMap();
        TextBoxView boxManager = new TextBoxView(lighting, characterMap);
        setBoxViewer(boxManager);
    }
    
    
    public BoxCharacterMap getCharacterMap(){
        return characterMap;
    }
}