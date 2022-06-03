import java.util.Scanner;
public class InputOutputSample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double baseAttackSpeed,currentAttackSpeed;
        int bonusAttackSpeed, level;
        System.out.print("Enter base attack speed: ");
        baseAttackSpeed = input.nextDouble();
        System.out.print("Enter bonus attack speed%: ");
        bonusAttackSpeed = input.nextInt();
        System.out.print("Enter the level: ");
        level = input.nextInt();
        currentAttackSpeed = baseAttackSpeed * (1 + (bonusAttackSpeed / 100.00) * (level - 1));
         System.out.print("The character's current attack is " + Math.round(currentAttackSpeed * 1000 ) / 1000.0d);
    }
}