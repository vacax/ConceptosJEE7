package java.edu.puccm.pw.webservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.edu.puccm.pw.encapsulacion.Estudiante;
import java.util.Date;

/**
 * Created by vacax on 14/07/16.
 */
@WebService(serviceName = "HolaMundoWs")
public class HolaMundoWs {

    /**
     * This is a sample web service operation
     * @param txt
     * @return
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        System.out.println("Ejecutando holamundo en el servidor "+new Date());
        return "Hola Mundo " + txt + " !";
    }

    /**
     * Web service operation
     * @param param1
     * @param param2
     * @return
     */
    @WebMethod(operationName = "sumar")
    public Integer sumar(@WebParam(name = "param1") Integer param1, @WebParam(name = "param2") Integer param2) {
        //TODO write your implementation code here:
        System.out.println("Ejecutando suma en el servidor "+new Date());
        return param1 + param2;
    }

    /**
     * Web service operation
     * @param matricula
     * @return
     */
    @WebMethod(operationName = "getEstudiante")
    public Estudiante getEstudiante(@WebParam(name = "matricula") Integer matricula) {
        //TODO write your implementation code here:
        return new Estudiante(matricula, "Nombre - "+matricula);
    }

    @WebMethod(operationName = "procesarEstudiante")
    public boolean procesarEstudiante(@WebParam(name = "estudiante") Estudiante estudiante) {
        //TODO write your implementation code here:
        System.out.println("Proceando el estudiante: "+estudiante.getNombre());
        return true;
    }
}
