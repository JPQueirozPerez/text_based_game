package com.company.view;

import com.company.model.Player;

import java.util.concurrent.atomic.AtomicInteger;

import static com.company.utils.Utilities.*;

public class EquipmentView {
    public static void showEquipmentView(Player player) {

        if(!player.getEquipment().isEmpty()){
            System.out.println("Menu Equipment");
            System.out.println("**************************************************************************");

            AtomicInteger i = new AtomicInteger(1);
            System.out.println(ANSI_BRONZE_BACKGROUND + "                                                        " + ANSI_RESET);
            System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "                       " + BRONZE_UNDERLINED + "EQUIPMENT" + ANSI_RESET + "                      " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
            System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "                                                      " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);

           player.getEquipment().forEach((k, v) -> {
            //player.getInventory().getItems().forEach((k, v) -> {

                System.out.format(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " " + i.getAndIncrement() + ". Name: " + YELLOW_BRIGHT
                        + v.getInventoryName() + ANSI_RESET + " | Quantity: x" + YELLOW_BRIGHT + v + ANSI_RESET + "               " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n"
                        + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "    Description: " + YELLOW_BRIGHT + v.getDescription() + ANSI_RESET + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n");
                if (v.getItemHabilities().get("attack") != 0) {
                    System.out.format(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "    Attack: " + YELLOW_BRIGHT + v.getItemHabilities().get("attack") + "                                         " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n");
                }
                if (v.getItemHabilities().get("defense") != 0) {
                    System.out.format(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "    Defense: " + YELLOW_BRIGHT + v.getItemHabilities().get("defense") + "                                        " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n");
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
            System.out.println("Equipment is empty");
        }



    }
}
