package com.company.service;

import com.company.model.Item;
import com.company.model.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import static com.company.utils.Utilities.ANSI_RESET;
import static com.company.utils.Utilities.YELLOW_BRIGHT;
import static com.company.view.InventoryView.inventoryUseItem;

public class InventoryService {

    public static Item createItem() {
        int value = new Random().nextInt((5 - 1) + 1);

        var reward = new Item();

        HashMap<String, Integer> itemHabilities = new HashMap<>();

        switch (value) {
            case 1 -> {
                itemHabilities.put("attack" , 0);
                itemHabilities.put("defense" , 1);
                itemHabilities.put("speed" , 0);
                reward = new Item("Tunic" , "Tunic         " , "cloth" , "A simple tunic                       " , 2 , itemHabilities);
            }
            case 2 -> {
                itemHabilities.put("attack" , 1);
                itemHabilities.put("defense" , 0);
                itemHabilities.put("speed" , 0);
                reward = new Item("Wooden stick" , "Wooden stick  " , "weapon" , "A simple stick made of wood          " , 1 , itemHabilities);
            }
            case 3 -> {
                itemHabilities.put("attack" , 4);
                itemHabilities.put("defense" , 0);
                itemHabilities.put("speed" , 0);
                reward = new Item("Sword" , "Sword         " , "weapon" , "A simple sword                       " , 7 , itemHabilities);
            }
            case 4 -> {
                itemHabilities.put("attack" , 2);
                itemHabilities.put("defense" , 0);
                itemHabilities.put("speed" , 0);
                reward = new Item("Bow" , "Bow           " , "weapon" , "A simple bow                         " , 4 , itemHabilities);
            }
            default -> {
                itemHabilities.put("attack" , 0);
                itemHabilities.put("defense" , 0);
                itemHabilities.put("speed" , 0);
                reward = new Item("Healing herb" , "Healing herb  " , "herb" , "This herb has medicinal capabilities " , 1 , itemHabilities);
            }
        }
        return reward;
    }

    public static boolean compareItems(HashMap<Item, Integer> items , Item newItemToAdd) {
        return items.containsKey(newItemToAdd);
    }

    public static void equippingObject(Player player , int option) {
        for (Item item : new ArrayList<>(player.getInventory().getItems().keySet())) {
            if (item.getIndex() == option) {
                System.out.println("The chosen object is: " + YELLOW_BRIGHT + item.getName() + ANSI_RESET);
                player.getInventory().getItems().replace(item , player.getInventory().getItems().get(item) - 1);
                equippingPlayer(player , item);
                if (player.getInventory().getItems().get(item) < 1) {
                    player.getInventory().getItems().remove(item);
                }
            }
        }
    }

    public static void equippingPlayer(Player player , Item item) {

        AtomicInteger ainteger= new AtomicInteger();
        String valorParseado = ainteger.toString();
        player.getEquipment().put(valorParseado, item);
        ainteger.getAndIncrement();

        //player.getEquipment().

//        System.out.println("ITEM = " + player.getEquipment());
//        System.out.println("ITEM = " + player.getEquipment().get("name"));
//        System.out.println("Attack Player: "+player.getStrength());
//        System.out.println("Name: "+player.getEquipment().get("head"));
//        System.out.println("Value Item: "+player.getEquipment().get("head").getItemHabilities().get("attack"));






       // for (Map.Entry<String, Item> entry : player.getEquipment().entrySet()) {
       //    System.out.println("Obtener clave + valor = " + entry.getKey() + " = " + entry.getValue());

       // }


//        System.out.println("Total poder = " + player.getTotalStrength());
//        System.out.println("DEFENSE = " + player.getDefense());


    }
}








