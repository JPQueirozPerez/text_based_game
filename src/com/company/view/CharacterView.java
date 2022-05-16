package com.company.view;

import com.company.model.Player;

import java.util.concurrent.atomic.AtomicInteger;

import static com.company.utils.Utilities.*;
import static com.company.utils.Utilities.ANSI_RESET;

public class CharacterView {
    public static void showCharacter(Player player) {
        int sumaAttack=0;
        int sumaDefense=0;
        int sumaSpeed=0;

        if(!player.getEquipment().isEmpty()){


           AtomicInteger i = new AtomicInteger(1);

            player.getEquipment().forEach((k, v) -> {
                if (v.getItemHabilities().get("attack") != 0) {
                    //sumaAttack++;
                    sumaAttack + v.getItemHabilities().get("attack");
                }
                if (v.getItemHabilities().get("defense") != 0) {
                     "                                        " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n");
                }
                if (v.getItemHabilities().get("speed") != 0) {
                    System.out.format(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "    Speed: " + YELLOW_BRIGHT + v.getItemHabilities().get("speed") + "                                         " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n");
                }
                System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "                                                      " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
            });
//                "key: %s, value: %d%n", k, v));
            System.out.println(ANSI_BRONZE_BACKGROUND + "                                                        " + ANSI_RESET);
            System.out.println(" ");
//                System.out.println("ITEM = " + player.getEquipment());

            System.out.println("Attack Player: "+player.getStrength());
            //     System.out.println("Name: "+player.getEquipment().get("head"));
            //    System.out.println("Value Item: "+player.getEquipment().get("head").getItemHabilities().get("attack"));
        } else {


            System.out.println(ANSI_BRONZE_BACKGROUND + "                             " + ANSI_RESET);
            System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "         " + BRONZE_UNDERLINED + "CHARACTER" + ANSI_RESET + "         " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
            System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "                           " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
            System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " Name: " + YELLOW_BRIGHT + player.getName() + ANSI_RESET + "               " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
            System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " Level: " + YELLOW_BRIGHT + player.getLevel() + ANSI_RESET + " | Class: " + YELLOW_BRIGHT + player.getCharClass() + ANSI_RESET + "  " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
            System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " Life Points: " + YELLOW_BRIGHT + player.getHealthPoints() + ANSI_RESET + "          " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
            System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " Strength: " + YELLOW_BRIGHT + player.getStrength() + ANSI_RESET + "              " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
            System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " Defense: " + YELLOW_BRIGHT + player.getDefense() + ANSI_RESET + "               " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
            System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " Speed: " + YELLOW_BRIGHT + player.getSpeed() + ANSI_RESET + "                 " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
            System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " Dexterity: " + YELLOW_BRIGHT + player.getDexterity() + ANSI_RESET + "             " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
            System.out.println(ANSI_BRONZE_BACKGROUND + "                             " + ANSI_RESET);
            System.out.println(" ");

        }


    }

    public static void showClass(){
        System.out.println(ANSI_BRONZE_BACKGROUND+"                  "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+"    "+BRONZE_UNDERLINED+"CLASSES"+ANSI_RESET+"     "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+"                "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" 1- Warrior     "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" 2- Mage        "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" 3- Hunter      "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+"                  "+ANSI_RESET);
        System.out.println("Choose a class");
    }
}
