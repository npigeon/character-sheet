import java.util.List;
import java.lang.StringBuilder;

public class TextBoxView {
    private Lighting lighting;
    private BoxCharacterMap characterMap;

    public TextBoxView(Lighting lighting, BoxCharacterMap characterMap) {
        this.characterMap = characterMap;
        this.lighting = lighting;
    }
    
    public String generateBox(Box dataBox) {
        StringBuilder contents = new StringBuilder();
        String topRow = generateTopRow(dataBox);
        contents.append(topRow);
        contents.append(generateCentralRows(dataBox));
        contents.append(generateBottomRow(dataBox));
        return contents.toString();
    }
    
    public String generateTopRow(Box dataBox){
        String topLeft = characterMap.getTopLeftCorner(lighting);
        String topRight = characterMap.getTopRightCorner(lighting);
        String lineChar = characterMap.getTopLine(lighting);
        int boxWidth = dataBox.getWidth() - 2; 
        String lineContents = topLeft + new String(new char[boxWidth]).replace("\0",lineChar) + topRight +"\n";
        return lineContents;
    
    }
    
    public String generateCentralRows(Box dataBox){
        int height = dataBox.getHeight();
        StringBuilder contents = new StringBuilder();
        for (int y=0; y<height-1; y++) {
            String lineContents = generateSingleCentralRow(y, dataBox);
            contents.append(lineContents + "\n");
        }
        return contents.toString();
    }
    
    public String generateSingleCentralRow(int rowIndex, Box dataBox) {
        List<String> boxContents = dataBox.getContents();
        StringBuilder lineContents = new StringBuilder();
        lineContents.append(characterMap.getHorizontalExternalSpacing());
        lineContents.append(characterMap.getLeftLine(lighting));
        lineContents.append(characterMap.getHorizontalInternalSpacing());
        if (boxContents.size() >= rowIndex+1) {
            lineContents.append(boxContents.get(rowIndex));
        };
        int boxWidth = dataBox.getWidth();
        int lineWidth = lineContents.length();
        if (lineWidth < boxWidth-1) {
            int paddingNeeded = (boxWidth - lineWidth) - 1;
            String padding = new String(new char[paddingNeeded]).replace("\0"," ");
            lineContents.append(padding);
        }
        else if (lineWidth > boxWidth-1) {
//         TODO Not implemented yet
            int overflow = (lineWidth - boxWidth) + 1;
        }
        lineContents.append(characterMap.getRightLine(lighting));
        return lineContents.toString();
    }
        
    public String generateBottomRow(Box dataBox) {
        String bottomLeft = characterMap.getBottomLeftCorner(lighting);
        String bottomRight = characterMap.getBottomRightCorner(lighting);
        String lineChar = characterMap.getBottomLine(lighting);
        int boxWidth = dataBox.getWidth() - 2; 
        String lineContents = bottomLeft + new String(new char[boxWidth]).replace("\0",lineChar) + bottomRight;
        return lineContents;
    }
    public BoxCharacterMap getCharacterMap(){
        return characterMap;
    }
}