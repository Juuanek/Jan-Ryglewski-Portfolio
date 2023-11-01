public class Main {
    public static void main(String[] args) {

        //Building governmentBuilding = new Building(Geometry.POINT,"Sydney Town Hall (" +usageType.BUSINESS+")",PointMarkers.RED_STAR,
               // "Sydney Town Hall",usageType.BUSINESS);

        Building building = new Building(Geometry.POINT,"Sydney Town Hall (" +usageType.BUSINESS+")",PointMarkers.RED_STAR,
                 "Sydney Town Hall",usageType.BUSINESS);
        building.toJSON(building);

    }
}