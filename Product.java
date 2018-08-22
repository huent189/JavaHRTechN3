package JavaHRTechN3;

import java.util.List;

public class Product {
    public enum LockingType{
        HL;
        enum SL{
            AdminMode, UserMode;
        }
    }
    public enum Rehost{
        Enable, Disable, LeavaAsItIs, Specify
    }
    private int id;
    private String name;
    LockingType lockingType;
    Rehost rehost;
    String description;
    List<Feature> asscoiatedFeature;
}
