package com.company;

/*
Homework_1
@author Petrova Olga
 */

class Team {
    private String name;
    private int age;
    private int weight;
    private int run_meters_per_sec; //running speed скорость бега метры в секунду
    private int m_jump_height; // высота прыжка, метры

    Team(String name, int age, int weight, int run_meters_per_sec, int m_jump_height) {
        this.name = "name";
        this.age = age;
        this.weight = weight;
        this.run_meters_per_sec = run_meters_per_sec;
        this.m_jump_height = m_jump_height;
    }


    public String toString(){
        return "Athlete:" + name +", возраст:" + age + "вес:" + weight + ", может пробежать " + run_meters_per_sec + "м в сек " + ", прыгает в высоту:" + m_jump_height + "m";
    }

    public static void main(String[] args) {
        Team[] teams = {
                new Team("Maks", 22, 78, 6, 1),
                new Team("Gera", 33, 67, 7, 2),
                new Team("Tommi", 25, 80, 3, 1),
                new Team("Anna", 28, 47, 7, 2),
        };

        for (Team team : teams) {
            System.out.println(teams);
        }
    }
}

//class Course () {

//}
      //  {
            // prived String name;
            // prived int age;
            // prived int weight;
            // prived int run_meters_per_sec; //running speed скорость бега метры в секунду
            // prived int m_jump_height; // высота прыжка, метры

            //public Athlete(String name, int age, int weight, int run_meters_per_sec, int m_jump_height)
            //    this.name = "name";
            //    this.age = age;
            //    this.weight = weight;
            //    this.run_meters_per_sec = run_meters_per_sec;
            //    this.m_jump_height = m_jump_height;
            //}

     //   }
   // }
