import java.util.ArrayList;

public interface Mappable {

    //String JSON_PROPERTY ="""
    //"properties":{%s}
    //""";

    static void mapIt(Mappable mappable) {
        String JSON_PROPERTY = """
                "properties":{%s}
                """;
        ArrayList<Enum,String> properties= new ArrayList<>();

        properties.add(JSON_PROPERTY);
        properties.add(getLabel(mappable));
        properties.add(getMarker(mappable.toString()));
        properties.add(getShape(Geometry.valueOf(mappable.toString())));


    }

    default void toJSON(Building building) {
        mapIt(building);
    }

    static String getLabel(Mappable mappable){
        return mappable.toString();
    }

    static String getMarker(String marker){
        return marker;
    }

    static Geometry getShape(Geometry shape){
        return shape;
    }
}
