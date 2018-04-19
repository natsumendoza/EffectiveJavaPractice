package SingletonPattern;

// This approach may feel a bit unnatural, but a single-element
// enum type is often the best way to implement a singleton.
public enum ElvisEnum {
    INSTANCE;

    public void leaveTheBuilding() {}
}
