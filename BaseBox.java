import java.util.ArrayList;
import java.util.List;


public class BaseBox {
    private String title;
    private int height = 0;
    private int width;
    private List<String> lines = new ArrayList<String>();
    
    public BaseBox(int width) {
        this.width = width;
    }
    public BaseBox() {
        width = 80;
    }

    public void addLine(String lineContents) {
        lines.add(lineContents);
        height += 1;
    }
    
    public void generateContents() {
        setContents(lines);
    }
    
    public void setContents(List<String> contents) {
        lines = contents;
        height = contents.size() + 1;
    }
    public void setLines(List<String> contents) {
        this.lines = lines;
    }
    
    public List<String> getContents() {
        return lines;
    }
    public List<String> getLines() {
        return lines;
    }
    
    public int getHeight() {
        return height;
    }
    public int getWidth() {
        return width;
    }
    public String getTitle() {
        return title;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
}