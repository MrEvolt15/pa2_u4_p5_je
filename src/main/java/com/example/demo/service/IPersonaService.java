package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Persona;

public interface IPersonaService {
public void guardar(Persona persona);
    public Persona buscarPorCedula(String cedula);
    public void actualizar(Persona persona);
    public void borrar(String cedula);
    public List<Persona> buscarTodo();
}
