import java.util.*;
interface MealPlan{ boolean isValid(); }
class VegetarianMeal implements MealPlan{ public boolean isValid(){return true;} public String toString(){return "Vegetarian";} }
class VeganMeal implements MealPlan{ public boolean isValid(){return true;} public String toString(){return "Vegan";} }
class KetoMeal implements MealPlan{ public boolean isValid(){return true;} public String toString(){return "Keto";} }
class Meal<T extends MealPlan>{
    private final T plan;
    public Meal(T plan){this.plan=plan;}
    public T getPlan(){return plan;}
    public String toString(){return plan.toString();}
}
class MealGenerator{
    public static <T extends MealPlan> Meal<T> generate(T plan){
        if(!plan.isValid()) throw new IllegalArgumentException();
        return new Meal<>(plan);
    }
}
class MealDemo{
    public static void main(String[] args){
        Meal<VeganMeal> m=MealGenerator.generate(new VeganMeal());
        System.out.println(m);
    }
}
