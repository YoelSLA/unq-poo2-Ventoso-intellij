package main.tp5;

import java.util.ArrayList;
import java.util.List;

public class CajaRegistradora {

    private List<Pagable> pagables;

    public CajaRegistradora() {
        this.pagables = new ArrayList<>();
    }

    public List<Pagable> getPagables() {
        return pagables;
    }

    public double montoTotalAPagar() {
        return pagables.stream().mapToDouble(Pagable::getPrecio).sum();
    }

    public void registrarPagable(Pagable p) {
        pagables.add(p);
        p.procesarPago();
    }

}
