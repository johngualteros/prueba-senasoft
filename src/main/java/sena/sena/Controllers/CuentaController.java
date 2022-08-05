package sena.sena.Controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import sena.sena.Models.Cuenta;
import sena.sena.Models.ICuenta;

@Controller
@SessionAttributes("cuenta")
@RequestMapping("/cuenta")

public class CuentaController {

    @Autowired
    private ICuenta cuentad;

    @GetMapping(path = {"/listar","","/"})
    public String listar(Model m){
        m.addAttribute("cuentas", cuentad.findAll());
        return "views/cuenta/listar";
    }

    @GetMapping("/form")
    public String form(Model m){
    Cuenta cuenta = new Cuenta();
    m.addAttribute("cuenta", cuenta);
    m.addAttribute("accion","Crear Cuenta");
    return "views/cuenta/form";
  }
  
  @PostMapping("/add")
  public String add(@Valid Cuenta cuenta, BindingResult res, Model m, SessionStatus status){
    if(res.hasErrors()){
      return "views/cuenta/form";
    }
    cuentad.save(cuenta);
    status.setComplete();
    return "redirect:/cuenta/listar";
  }
    
}
