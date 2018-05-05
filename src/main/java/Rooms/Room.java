package Rooms;

public abstract class Room {

    String name;
    String use;

    public Room(String name, String use) {
        this.name = name;
        this.use = use;
    }

    public String getName() {
        return name;
    }

    public String getUse() {
        return use;
    }
}
