import java.util.ArrayList;
import java.util.List;


public class Box {
    private String title;
    private int height;
    private int width = 80;
    private List<String> lines = new ArrayList<String>();
    
    public Box(String title) {
        height = 4;
        this.title = title;
    }
    
    public void setLines(List<String> lines) {
        this.lines = lines;
    
    }
    
    public List<String> getContents() {
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
}