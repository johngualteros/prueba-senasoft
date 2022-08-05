package sena.sena.Models.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sena.sena.Models.Cliente;
import sena.sena.Models.ICliente;


@Service
public class IClienteServiceImpl implements IClienteService{
    @Autowired ICliente cliented;

    @Override
    public List<Cliente> findAll() {
        return (List<Cliente>) cliented.findAll();
    }

    @Override
    public void save(Cliente cliente) {
        cliented.save(cliente); 
    }

    @Override
    public void delete(Integer idCliente) {
        cliented.deleteById(idCliente);
    }
    
}
