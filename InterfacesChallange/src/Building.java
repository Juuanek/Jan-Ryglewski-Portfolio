public class Building  implements Mappable {

    private Geometry type = Geometry.POINT;
    private String label = "Sydney Town Hall" + usageType.BUSINESS;
    private PointMarkers marker = PointMarkers.RED_STAR;
    private String name = "Sydney Town Hall";
    private usageType BuildingType = usageType.BUSINESS;

    public Building(Geometry type, String label, PointMarkers marker, String name, usageType buildingType) {
        this.type = type;
        this.label = label;
        this.marker = marker;
        this.name = name;
        BuildingType = buildingType;
    }
}

enum usageType {

    BUSINESS,ENTERTAINMENT

}
