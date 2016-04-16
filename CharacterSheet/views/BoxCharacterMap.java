package CharacterSheet.views;
public interface BoxCharacterMap {

    public String getTopLine(Lighting lighting);
    public String getTopRightCorner(Lighting lighting);
    public String getTopLeftCorner(Lighting lighting);
    public String getLeftLine(Lighting lighting);
    public String getRightLine(Lighting lighting);
    public String getBottomLine(Lighting lighting);
    public String getBottomRightCorner(Lighting lighting);
    public String getBottomLeftCorner(Lighting lighting);
    public String getHorizontalInternalSpacing();
    public String getHorizontalExternalSpacing();

}
