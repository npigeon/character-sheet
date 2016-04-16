package CharacterSheet.models;
import java.util.ArrayList;
import java.util.List;


public class TitledBox extends BaseBox {
    private String title;
    
    public TitledBox(int width) {
        setWidth(width);
    }
    public TitledBox() {
        setWidth(80);
    }    
    
    public void generateContents() {
        List<String> localContents = new ArrayList<String>();
        List<String> localLines = getLines();
        List<String> mainContents = padMainContents(localLines);
        localContents.add(title);
        localContents.addAll(mainContents);
        setContents(localContents);
    }
    public List<String> padMainContents(List<String> unpaddedContents) {
        List<String> paddedContents = new ArrayList<String>();
        for (String line:unpaddedContents ){
            paddedContents.add(" "+line);
        }
        return paddedContents;
    }
    public void setTitle (String title){
        this.title = title;
    }

}
