package sección2;

public class Primitivos {
    public static void main(String[] args) {
        byte numeroByte= 127;//entero más pequeño de java (mx 127)
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);//la clase byte nos da información acerca del dato como su tamaño y etc.
        System.out.println("tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("máximo de un byte" + Byte.MAX_VALUE);
        System.out.println("minimo de un byte" + Byte.MIN_VALUE);

        short numeroShort= 32767;//recordar variables siempre inician en minúscula (mx short 32767)
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo Short corresponde en byte a " + Short.BYTES);//la clase Short nos da información acerca del dato como su tamaño y etc.
        System.out.println("tipo Short corresponde en bites a " + Short.SIZE);
        System.out.println("máximo de un Short " + Short.MAX_VALUE);
        System.out.println("minimo de un Short " + Short.MIN_VALUE);

        int numeroInt= 2147483647;//mx de int, los minimos son el mismo número en negativo y termina en 8
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo Int corresponde en byte a " + Integer.BYTES);
        System.out.println("tipo Int corresponde en bites a " + Integer.SIZE);
        System.out.println("máximo de un Int " + Integer.MAX_VALUE);
        System.out.println("minimo de un Int " + Integer.MIN_VALUE);

        long numeroLong= 9223372036854775807L;//(mx de long) para diferenciarlo de un entero al final del número debe ir una letra l o L (recomendablemente la L)
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo Long corresponde en byte a " + Long.BYTES);
        System.out.println("tipo Long corresponde en bites a " + Long.SIZE);
        System.out.println("máximo de un Long " + Long.MAX_VALUE);
        System.out.println("minimo de un Long " + Long.MIN_VALUE);

        var numroVar = 127; //con var

        float numeroFloat= 123.45f; //ahora al finalizar el numero va f
    }
}
