package memento;


public class Originator {
    private juego estado;

    public juego getEstado() {
        return estado;
    }

    public void setEstado(juego estado) {
        this.estado = estado;
    }

    public Memento guardar(){
        return new Memento(estado);
    }

    public void restaurar(Memento m){
        this.estado=m.getEstado();
    }
}
