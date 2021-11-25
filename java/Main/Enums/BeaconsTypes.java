package Main.Enums;

public enum  BeaconsTypes {
    MINOR_LATERAL_PORT_REGION_B ("MINOR_LATERAL_PORT_REGION_B"),
    DEFAULT_BEACON ("BCNGEN03"),
    SPECIAL_PURPOSE_BEACON ("SPECIAL_PURPOSE_BEACON"),
    ISOLATED_DANGER ("BCNISD21"),
    BCNLAT15 ("BCNLAT15"),
    LATERAL_STARBOARD_REGION_B ("LATERAL_STARBOARD_REGION_B"),
    BCNLAT22 ("BCNLAT22"),
    BCNCAR03 ("BCNCAR03"),
    BCNCAR04 ("BCNCAR04"),
    BCNCAR02 ("BCNCAR02"),
    SAFE_WATER_BEACON ("SAFE_WATER_BEACON"),
    LATTICE_BEACON ("LATTICE_BEACON"),
    BCNLAT16 ("BCNLAT16"),
    LATERAL_PORT_REGION_B ("LATERAL_PORT_REGION_B"),
    BCNLAT21 ("BCNLAT21"),
    BCNCAR01 ("BCNCAR01"),
    MINOR_LATERAL_STARBOARD_REGION_B ("MINOR_LATERAL_STARBOARD_REGION_B");

    private String name;

    BeaconsTypes(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
