public class Item {
    private String name;
    private String description;
    private Weapon weapon;

    public Item() {
    }

    public Item(String name, String description, Weapon weapon) {
        this.name = name;
        this.description = description;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
