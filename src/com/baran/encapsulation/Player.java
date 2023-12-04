package com.baran.encapsulation;

public class Player {

    String name;
    int healthPercentage;
    private Weapon weapon;

    public Player( String name, int healthPercentage, Weapon weapon){
        this.name = name;
        this.healthPercentage = healthPercentage;
        checkHealth(this.healthPercentage);
        this.weapon = weapon;

    }

    private void checkHealth(int healthPercentage){
        if(healthPercentage<0){
            this.healthPercentage = 0;
        }
        if(healthPercentage>100){
            this.healthPercentage = 100;
        }
    }

    public int healthRemaining(){
        return healthPercentage;
    }
    public void loseHealth(int damage){
        int healthRemain = healthPercentage - damage;
        if(healthRemain<=0){
            System.out.println(name + "game over");
        }

        healthPercentage = healthRemain;
        checkHealth(healthPercentage);

    }

    public void restoreHealth(int healthPotion){
        this.healthPercentage += healthPotion;
        checkHealth(this.healthPercentage);
    }


    public String toString(){
        return  "Name: " + name + "HealthPercentage: " + healthPercentage +
                "Weapon: " + (weapon.getDamage() + "-"  + weapon.getAttackSpeed()) +
                "Damage deal: " + (weapon.getDamage() * weapon.getAttackSpeed());
    }
}
