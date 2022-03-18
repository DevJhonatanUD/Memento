import memento.*;

public class Launcher {
    public static void main(String[] args) {
        String nombreJuego ="DOOM";
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();
        juego Juego = new juego();
        Juego.setNombre(nombreJuego);
        Juego.setCheckpoint(1);
        
        caretaker.addMemento(originator.guardar());//guardado 0
        

        Juego = new juego();
        Juego.setNombre(nombreJuego);
        Juego.setCheckpoint(2);
        originator.setEstado(Juego);
        
        caretaker.addMemento(originator.guardar());//guardado 1
        
        
        Juego = new juego();
        Juego.setNombre(nombreJuego);
        Juego.setCheckpoint(3);
        originator.setEstado(Juego);
        
        caretaker.addMemento(originator.guardar());//guardado 2
        
        
        Juego = new juego();
        Juego.setNombre(nombreJuego);
        Juego.setCheckpoint(4);
        originator.setEstado(Juego);
        
        
        Juego = new juego();
        Juego.setNombre(nombreJuego);
        Juego.setCheckpoint(5);
        originator.setEstado(Juego);
        
        caretaker.addMemento(originator.guardar());//guardado 3
        
        
        originator.restaurar(caretaker.getMemento(1));
        Juego=originator.getEstado();
        System.out.println(Juego.getCheckpoint());
    }
}
