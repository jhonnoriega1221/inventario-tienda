package controlador;

import modelo.ArchivoItem;

public class Item {
    
    //  --- Atributos ---
    String codigo, nombre, marca, categoria, estado, ubicacion, fecha;
    int stock;

    // --- Constructor ---
    public Item(String codigo, String nombre, String marca, String categoria, String estado, String ubicacion, String fecha, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.categoria = categoria;
        this.estado = estado;
        this.ubicacion = ubicacion;
        this.fecha = fecha;
        this.stock = stock;
    }
    
    public Item(){}
    
    //  --- Setters y Getters ---

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    //  ---  Meto2  ---
    
    public void insertarItem(String c, String cat, String est, String f, String m, String nom, String stock, String u){
        
        ArchivoItem.escribirItem(c,cat,est,f,m,nom,stock,u);
        
    }
    
    public void eliminarItem(String removeTerm){
        ArchivoItem.borrarItem(removeTerm);
    }
    
    public void modificarItem(String editTerm, String newCode, String newCat, String newDate, String newBrand, String newName, String newLoc, String newStatus){
        ArchivoItem.editarItem(editTerm, newCode, newCat, newDate, newBrand, newName, newLoc, newStatus);
    }
}
