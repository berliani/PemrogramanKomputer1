/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.oop;

import java.util.Scanner;

/**
 *
 * @author linad
 */
public class DuckSimulator {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("choose the type of duck:");
            System.out.println("1. Mallard Duck");
            System.out.println("2. Rubber Duck");
            System.out.println("3. Decoy Duck");
            System.out.println("4. Model Duck");
            System.out.println("0. Exit");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  // Membaca setelah memasukkan pilihan
            
            if (choice == 0) {
                break;  // Keluar dari loop jika pengguna memilih 0
            }
            
            Duck duck = null;
            
            switch (choice) {
                case 1:
                    duck = new MallardDuck();
                    break;
                case 2:
                    FlyBehavior cantFly = () -> System.out.println("I can't fly");
                    QuackBehavior squeak = () -> System.out.println("Squeak");
                    duck = new RubberDuck(cantFly, squeak);
                    break;
                case 3:
                    duck = new DecoyDuck();
                    break;
                case 4:
                    duck = new ModelDuck();
                    break;
            }
            
            if (duck != null) {
                System.out.println("You choose " + duck.getClass().getSimpleName());
                duck.performQuack();
                duck.performFly();
            }
        }
    }
}
// DEFAULT
//        MallardDuck mallard = new MallardDuck();
//        FlyBehavior cantFly = () -> System.out.println("I can't fly");
//        QuackBehavior squeak = () -> System.out.println("Squeak");
//        RubberDuck rubberDuckie = new RubberDuck(cantFly, squeak);
//        DecoyDuck decoy = new DecoyDuck();
//        
//        Duck model = new ModelDuck();
//        
//        mallard.performQuack();
//        rubberDuckie.performQuack();
//        decoy.performQuack();
//        
//        model.performFly();
//        model.setFlyBehavior(new FlyRocketPowered());
//        model.performFly();
//    }
//    
//}
