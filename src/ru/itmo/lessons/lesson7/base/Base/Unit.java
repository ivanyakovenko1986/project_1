package ru.itmo.lessons.lesson7.base.Base;

abstract public class Unit {
    public Object plusHealt;
    protected int healthScore;
    private Unit() {
        if (healthScore < 1) {
            throw new IllegalAccessException("Здоровье бд положительное значение");
        }
    this.healthScore = healthScore;
    maxHealhtScore = healthScore;
    public int healtScore(){

        }
        //добавить здоровье, но не больше изначального
        public void plusHealt(int healtScore){
            if (!isAlive()) return;
            this.healthScore = Math.min(this.healthScore + healthScore, maxHealhtScore)

        }
        //уменьшить здоровье если персонаж жив
        public void minusHealt(int healtScore){
            if (!isAlive()) return;
            this.healthScore -= healthScore;

        }
       // метод вернет тру, если здоровье больше 0
        //фолс если нет
        public bollean isAlive(){
            return healthScore > 0;

        }

    }
    
}
