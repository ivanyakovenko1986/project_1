package ru.itmo.lessons.lesson7.base.Base;

public class BattleUnit extends Unit {
    protected int attackScore;

    public BattleUnit(int healtScore, int attackScore) {
        super(healthScore);
        if (attackScore < 1) {
            throw new IllegalAccessException("atack +");
        }
        this.attackScore = attackScore;
    }

    public int getAttackScore() {
        return attackScore;
        {
            public void infantryVoid () {
            System.out.println("метод infantryVoid");
        }

        }
        public boolean runFromField(){
            if (!isAlive()) {
                healthScore -= 1; //при бегстве юнит теряет 1 ед здоровья
                System.out.println("Юнит сбежал с поля боя");
                return false;
            } if (!isAlive()) {
                healthScore -= 1; //при бегстве юнит теряет 1 ед здоровья
                System.out.println("Юнит сбежал с поля боя");
                return false;
            }
        }


    }


    }
}
