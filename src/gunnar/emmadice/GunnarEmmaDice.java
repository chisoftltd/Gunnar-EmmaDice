/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gunnar.emmadice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author Benjamin Chinwe
 */
public class GunnarEmmaDice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        Roll roll = new Roll();
        roll.Dice();
    }

    private static class Roll {

        public Roll() {
        }

        private void Dice() throws IOException {
            int m = 0;
            int gunnar = 0;
            int emma = 0;
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (m < 3) {
                final String line1 = reader.readLine();
                final String line2 = reader.readLine();
                //  if (line == null ) {
                //    break;
                //}

                //int t = Integer.parseInt(reader.readLine());
                StringTokenizer tk1 = new StringTokenizer(line1);
                StringTokenizer tk2 = new StringTokenizer(line2);

                for (int j = 0; j < 4; j++) {

                    gunnar = gunnar + Integer.parseInt(tk1.nextToken());

                    emma = emma + Integer.parseInt(tk2.nextToken());

                }

                if (gunnar < emma) {
                    System.out.println("Emma");
                    gunnar = emma = 0;
                } else if (gunnar == emma) {
                    System.out.println("Tie");
                    gunnar = emma = 0;

                } else {
                    System.out.println("Gunnar");
                    gunnar = emma = 0;
                }
                m++;
            }
        }
    }

}
