package Lambdas;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ColeccionesMain {
    public static void main(String[] args) {
        List<String> nombres = new LinkedList<String>();
        nombres.add("Salem");
        nombres.add("Elena");
        nombres.add("Christian");

        nombres.stream().forEach( elemento -> {
            //System.out.println(elemento);
        });

        boolean resultado = nombres.stream().anyMatch(elemento -> elemento.equals("Salem"));
        //System.out.println(resultado);

        List<String> filtrados = nombres.stream().filter(elemento -> elemento.equals("Salem")).collect(Collectors.toList());
        //filtrados.stream().forEach(System.out::println);

        Usuario usuario1 = new Usuario();
        usuario1.setEdad(27);
        usuario1.setNombre("Chriatian");

        Usuario usuario2 = new Usuario();
        usuario2.setEdad(22);
        usuario2.setNombre("Elena");

        Usuario usuario3 = new Usuario();
        usuario3.setEdad(1);
        usuario3.setNombre("Salem");

        List<Usuario> usuarios = new LinkedList<>();
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        List<Usuario> usuariosFiltrados = usuarios.stream()
                .filter(usuario -> usuario.getEdad() > 20)
                .collect(Collectors.toList());

        List<String> nombresMasDe20 = usuarios.stream()
                .filter(usuario -> usuario.getEdad() > 20)
                .map(usuario -> usuario.getNombre()).collect(Collectors.toList());
        //usuariosFiltrados.stream().forEach(e -> {
          //  System.out.println(e.getNombre());
        //});

        nombresMasDe20.stream().forEach(System.out::println);

        Map<String, Long> paises = new HashMap<>();
        paises.put("Mexico", 8_000_000L);
        paises.put("Suiza", 5_000_000L);
        paises.put("Japon", 10_000_000L);

        paises.entrySet().stream().filter(pais -> pais.getValue() > 5_000_000).forEach(pais -> {
            //System.out.println(pais.getKey());
        });

    }
}
