package archivos1;

public class Principal {
    public static void main(String[] args) {
        Conexion cn = new Conexion();
        cn.getConexion();

        usuario usuario1= new usuario(1,"Martin","Guaymas",121212,"Salta","Analisis de sistemas");
        carrera carrera1= new carrera(5,"Maaaaatematicaass",12,52);

        try {
            cn.insertarCarrera(carrera1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            cn.insertarUsuario(usuario1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
