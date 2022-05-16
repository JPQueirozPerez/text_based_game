package com.company.frontcontroller;

import com.company.model.Player;

import java.io.InputStream;
import java.util.Scanner;

import static com.company.controller.FightController.fighting;
import static com.company.view.CharacterView.showCharacter;
import static com.company.view.IOView.*;
import static com.company.view.InventoryView.inventoryUseItem;
import static com.company.view.EquipmentView.*;

public class FrontController {
    public static void mainLoopController(String value) {
        switch (value) {
            case "1" -> createCharacter();
        }
    }

    public static void gameLoopController(String value , Player player) {
        switch (value) {
            case "1" -> fighting(player);
            case "2" -> inventoryUseItem(player);
            case "3" -> menuCharacterChoose(player);
        }
    }

    private static void menuCharacterChoose(Player player) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Elige Menu");
            System.out.println("1- Details Character");
            System.out.println("2- Equipment");
            String valueChoose = scanner.nextLine();
            switch (valueChoose) {
                case "1" -> {
                    System.out.println("option 1");
                    menuCharacterChoose(player);
                    break;
                }
                case "2" -> {
                    System.out.println("option 2");
                    showEquipmentView(Player player);
                    break;
                }
                case "3" -> System.out.println("Unknown command. Try again");
            }
        }
    }


//    public static boolean isCreated(){
//        Player player = null;
//        if(player == null){
//            return false;
//        }else{
//            return true;
//        }
//    }
}
