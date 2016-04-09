import java.util.List;

public class UnicodeView {
    public void display(Box dataBox) {
        String lineContents = generateTopRow(dataBox);
        output(lineContents);
        generateAndOutputCentralRows(dataBox);
    }
    
    public String generateTopRow(Box dataBox){
        char lineChar = dataBox.getTopLineCharacter(DisplayType.UNICODE);
        int boxWidth = dataBox.getWidth(); 
        String lineContents = new String(new char[boxWidth]).replace('\0',lineChar);
        return lineContents;
    
    }
    
    public void generateAndOutputCentralRows(Box dataBox){
        int height = dataBox.getHeight();
        for (int y=1; y<height-1; y++) {
            String lineContents = generateCentralRow(y, dataBox);
            output(lineContents);
        }
    }
    
    public String generateCentralRow(int rowIndex, Box dataBox) {
        List<String> boxContents = dataBox.getContents();
        String lineContents = "";
        if (boxContents.size() >= rowIndex+1) {
            lineContents = boxContents.get(rowIndex);
        };
        return lineContents;
    }
    
    public void output(String contents) {
        System.out.println(contents);
    }


}