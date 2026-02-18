import java.util.HashSet;

public class MainHashSetNumero {
    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet<>();

        numeros.add(10);
        numeros.add(2);
        numeros.add(67);
        numeros.add(10);
        numeros.add(67);
        numeros.add(9);

        System.out.println("Numeros: ");
        for(Integer num : numeros) {
            System.out.println(num);
        }
    }
}