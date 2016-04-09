public class UnicodeCharacterMap implements BoxCharacterMap {
    public String getTopLine(Lighting lighting) {
        return "─";
    }
    public String getTopRightCorner(Lighting lighting) {
        return "┐";
    }    
    public String getTopLeftCorner(Lighting lighting) {
        return "┌";
    }
    public String getLeftLine(Lighting lighting) {
        return "│";
    }
    public String getRightLine(Lighting lighting) {
        return "│";
    }
    public String getBottomLine(Lighting lighting) {
        return "─";
    }
    public String getBottomRightCorner(Lighting lighting) {
        return "┘";
    }
    public String getBottomLeftCorner(Lighting lighting) {
        return "└";
    }
    public String getHorizontalInternalSpacing() {
        return " ";
    }
    public String getHorizontalExternalSpacing() {
        return "";
    }
    
}