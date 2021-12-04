public class Weapon {
    private String name;
    private int damageMax;
    private String damageType;

    public Weapon() {
    }

    public Weapon(String name, int damageMax, String damageType) {
        this.name = name;
        this.damageMax = damageMax;
        this.damageType = damageType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamageMax() {
        return damageMax;
    }

    public void setDamageMax(int damageMax) {
        this.damageMax = damageMax;
    }

    public String getDamageType() {
        return damageType;
    }

    public void setDamageType(String damageType) {
        this.damageType = damageType;
    }
}
