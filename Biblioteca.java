/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro;

/**
 *
 * @author crist
 */
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private final List<Libro> libros;

    
    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    
    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro agregado: " + libro.getTitulo());
    }

 
    public void buscarPorTitulo(String titulo) {
        System.out.println("Buscando libros con el título: " + titulo);
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libro.mostrarInformacion();
                return;
            }
        }
        System.out.println("No se encontraron libros con ese título.");
    }

    
    public void buscarPorAutor(String autor) {
        System.out.println("Buscando libros del autor: " + autor);
        for (Libro libro : libros) {
            if (libro.getAutor().equalsIgnoreCase(autor)) {
                libro.mostrarInformacion();
            }
        }
    }

    
    public void prestarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                if (libro.isDisponible()) {
                    libro.setDisponible(false);
                    System.out.println("Has prestado el libro: " + titulo);
                } else {
                    System.out.println("El libro ya está prestado.");
                }
                return;
            }
        }
        System.out.println("El libro no se encuentra en la biblioteca.");
    }

    
    public void devolverLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                if (!libro.isDisponible()) {
                    libro.setDisponible(true);
                    System.out.println("Has devuelto el libro: " + titulo);
                } else {
                    System.out.println("El libro no estaba prestado.");
                }
                return;
            }
        }
        System.out.println("El libro no se encuentra en la biblioteca.");
    }

    
    public void mostrarLibrosDisponibles() {
        System.out.println("Libros disponibles:");
        for (Libro libro : libros) {
            if (libro.isDisponible()) {
                libro.mostrarInformacion();
                System.out.println("------------------------");
            }
        }
    }
}

    