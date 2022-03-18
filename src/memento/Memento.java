
package memento;


public class Memento {
    private juego estado;

    public Memento(juego estado) {
        this.estado = estado;
    }

    public juego getEstado() {
        return estado;
    }
}
