public class Saludo {
    public String generarSaludo(String nombre, String idioma) {
        if (nombre == null || nombre.isEmpty()) {
            return "¡Hola, Invitado!";
        }
        switch (idioma.toLowerCase()) {
            case "es":
                return "¡Hola, " + nombre + "!";
            case "en":
                return "Hello, " + nombre + "!";
            case "fr":
                return "Bonjour, " + nombre + "!";
            default:
                return "¡Hola, " + nombre + "!";
        }
    }
}
