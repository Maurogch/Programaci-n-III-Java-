package ejercicio;

public enum PizzaStatus {
    ORDERED,
    READY,
    DELIVERED;

    public boolean isDeliverable(enum status) {
        if (status == PizzaStatus.READY) {
            return true;
        }
        return false;
    }
}
