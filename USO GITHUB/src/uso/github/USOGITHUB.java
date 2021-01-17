/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uso.github;

import java.io.IOException;

/**
 *
 * @author raul
 */
public class USOGITHUB {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        System.out.println("Introduce frase y . al final para acabar de contar");
        char letra;
	int contador = 1;
        do{
            letra = (char) System.in.read();
                if (letra == ' ') {
                    do {
			letra = (char) System.in.read();
                        }while (letra == ' ');
			letra = Character.toLowerCase(letra);
			if ((letra>=97)&& (letra<=122)) {
			contador++;
					}
                }
                
        } while (letra != '.');
        System.out.println(contador + " palabras.");
    }
    
}
