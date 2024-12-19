/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author lidiomanuel
 */
import java.util.ArrayList;

public class GerenciadorDeCursos {
    private ArrayList<Curso> cursos;

    public GerenciadorDeCursos() {
        cursos = new ArrayList<>();
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public ArrayList<Curso> listarCursos() {
        return cursos;
    }

    public boolean removerCurso(String codigo) {
        return cursos.removeIf(curso -> curso.getCodigo().equals(codigo));
    }

    public Curso buscarCurso(String codigo) {
        for (Curso curso : cursos) {
            if (curso.getCodigo().equals(codigo)) {
                return curso;
            }
        }
        return null;
    }
}