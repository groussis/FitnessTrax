package dev.cguagliano.fitnesstrax;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Created by Chris on 3/6/2016.
 */
public class profileObject {
    private String name;
    private double current_weight;
    private double goal_weight;
    private double height;
    private double BMI;

    public profileObject(){
        name = null;
        current_weight=0;
        goal_weight=0;
        height = 0;
        BMI=0;
    }

    public profileObject(String name, double current_weight, double goal_weight, double height){
        this.name=name;
        this.current_weight=current_weight;
        this.goal_weight=goal_weight;
        this.height=height;
        BMI=calculateBMI(current_weight, height);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCurrent_weight(double weight){
        current_weight = weight;
        BMI = calculateBMI(weight, this.height); //new weight, so update BMI
    }

    public void setGoal_weight(double weight){
        goal_weight = weight;
    }

    public void setHeight(double height){
        this.height = height;
        BMI = calculateBMI(this.current_weight, height);
    }

    public String getName(){
        return this.name;
    }

    public double getCurrent_weight(){
        return this.current_weight;
    }

    public double getGoal_weight(){
        return this.goal_weight;
    }

    public double getHeight(){
        return this.height;
    }

    public double getBMI(){
        return this.BMI;
    }

    public double calculateBMI(double current_weight, double height){
        NumberFormat nf = new DecimalFormat("###.#");

        double kg=(current_weight*.45);
        double cm=(height*.025);
        double cmSquare=cm*cm;
        double result = kg/cmSquare;
        return Double.parseDouble(nf.format(result));
    }
}
