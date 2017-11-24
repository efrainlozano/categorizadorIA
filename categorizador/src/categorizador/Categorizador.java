/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package categorizador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hark_
 */
public class Categorizador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingresa algo");
        Scanner scanner = new Scanner (scn.nextLine());
        scanner.useDelimiter("[ ,.]");
        List<String> list = new ArrayList<>();
        while (scanner.hasNext()) {
            String token = scanner.next();
            list.add(token);
        }
        for (String token : list) {
            System.out.println(token);
        }
    }
    
}
