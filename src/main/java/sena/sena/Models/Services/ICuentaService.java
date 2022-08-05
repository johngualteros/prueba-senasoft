package sena.sena.Models.Services;

import java.util.List;

import sena.sena.Models.Cuenta;

public interface ICuentaService {

  public List<Cuenta> findAll();
  public void save (Cuenta cuenta);
  public Cuenta findOne(Integer id);
  public void delete(Integer id);
}