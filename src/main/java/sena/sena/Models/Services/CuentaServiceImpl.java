package sena.sena.Models.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sena.sena.Models.Cuenta;
import sena.sena.Models.ICuenta;

@Service
public class CuentaServiceImpl implements ICuentaService{
  @Autowired
  private ICuenta cuentad;

  @Override
  public List<Cuenta> findAll() {
    return (List<Cuenta>) cuentad.findAll();
  }

  @Override
  public Cuenta findOne(Integer id) {
  return cuentad.findById(id).orElse(null);
  }

  public void save(Cuenta cuenta) {
    cuentad.save(cuenta);
  }

  @Override
  public void delete(Integer id) {
    cuentad.deleteById(id);
  }
}