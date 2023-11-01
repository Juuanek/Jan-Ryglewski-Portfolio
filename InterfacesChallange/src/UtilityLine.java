public class UtilityLine implements Mappable{

    private Geometry type;
    private String label;
    private PointMarkers marker;
    private String name;
    private UtilityType UtilityType;

    public UtilityLine(Geometry type, String label, PointMarkers marker, String name, UtilityType utilityType) {
        this.type = type;
        this.label = label;
        this.marker = marker;
        this.name = name;
        UtilityType = utilityType;
    }
}

enum UtilityType{
    ELECTRICAL,FIBER_OPTIC
}
