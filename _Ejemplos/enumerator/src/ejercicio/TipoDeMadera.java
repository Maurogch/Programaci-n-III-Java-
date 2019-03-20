package ejercicio;

public enum TipoDeMadera {
    ROBLE("Castaño verdoso"),
    CAOBA("Marrón oscuro"),
    NOGAL("Marrón rojizo");
    private String color;

    TipoDeMadera(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

