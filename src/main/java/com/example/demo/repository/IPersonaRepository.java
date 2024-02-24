package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Persona;

public interface IPersonaRepository {
    public void insertar(Persona persona);
    public Persona seleccionarPorCedula(String cedula);
    public void actualizar(Persona persona);
    public List<Persona> selecTodo();
    public void eliminar(String cedula);
}
