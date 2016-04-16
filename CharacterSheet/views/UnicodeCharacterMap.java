package CharacterSheet.views;
public class UnicodeCharacterMap implements BoxCharacterMap {
    public String getTopLine(Lighting lighting) {
        String displayString;
        switch (lighting) {
            case TOP_LEFT:
                displayString = "─";
                break;
            case TOP_RIGHT:
                displayString = "─";
                break;
            case BOTTOM_LEFT:
                displayString = "━";
                break;
            case BOTTOM_RIGHT:
                displayString = "━";
                break;
            default:
                displayString = "─";
                break;
        
        }
        return displayString;
    }
    public String getTopRightCorner(Lighting lighting) {
        String displayString;
        switch (lighting) {
            case BOTTOM_LEFT:
                displayString = "┓";
                break;
            case TOP_LEFT:
                displayString = "┒";
                break;
            case BOTTOM_RIGHT:
                displayString = "┑";
                break;
            case TOP_RIGHT:
                displayString = "┐";
                break;
            default:
                displayString = "┐";
                break;
        
        }
        return displayString;

}    
    public String getTopLeftCorner(Lighting lighting) {
        String displayString;
        switch (lighting) {
            case BOTTOM_RIGHT:
                displayString = "┏";
                break;
            case TOP_RIGHT:
                displayString = "┎";
                break;
            case BOTTOM_LEFT:
                displayString = "┍";
                break;
            case TOP_LEFT:
                displayString = "┌";
                break;
            default:
                displayString = "┌";
                break;
        
        }
        return displayString;
    }
    public String getLeftLine(Lighting lighting) {
        String displayString;
        switch (lighting) {
            case TOP_RIGHT:
                displayString = "┃";
                break;
            case BOTTOM_RIGHT:
                displayString = "┃";
                break;
            case TOP_LEFT:
                displayString = "│";
                break;
            case BOTTOM_LEFT:
                displayString = "│";
                break;
            default:
                displayString = "│";
                break;
        
        }
        return displayString;
    }
    public String getRightLine(Lighting lighting) {
        String displayString;
        switch (lighting) {
            case TOP_LEFT:
                displayString = "┃";
                break;
            case BOTTOM_LEFT:
                displayString = "┃";
                break;
            case TOP_RIGHT:
                displayString = "│";
                break;
            case BOTTOM_RIGHT:
                displayString = "│";
                break;
            default:
                displayString = "│";
                break;
        
        }
        return displayString;
    }
    public String getBottomLine(Lighting lighting) {
        String displayString;
        switch (lighting) {
            case TOP_LEFT:
                displayString = "━";
                break;
            case TOP_RIGHT:
                displayString = "━";
                break;
            case BOTTOM_LEFT:
                displayString = "─";
                break;
            case BOTTOM_RIGHT:
                displayString = "─";
                break;
            default:
                displayString = "─";
                break;
        
        }
        return displayString;
    }
    public String getBottomRightCorner(Lighting lighting) {
        String displayString;
        switch (lighting) {
            case TOP_LEFT:
                displayString = "┛";
                break;
            case TOP_RIGHT:
                displayString = "┙";
                break;
            case BOTTOM_LEFT:
                displayString = "┚";
                break;
            case BOTTOM_RIGHT:
                displayString = "┘";
                break;
            default:
                displayString = "┘";
                break;
        
        }
        return displayString;
    }
    public String getBottomLeftCorner(Lighting lighting) {
        String displayString;
        switch (lighting) {
            case TOP_RIGHT:
                displayString = "┗";
                break;
            case TOP_LEFT:
                displayString = "┕";
                break;
            case BOTTOM_RIGHT:
                displayString = "┖";
                break;
            case BOTTOM_LEFT:
                displayString = "└";
                break;
            default:
                displayString = "└";
                break;
        
        }
        return displayString;
    }
    public String getHorizontalInternalSpacing() {
        return " ";
    }
    public String getHorizontalExternalSpacing() {
        return "";
    }
    
}
