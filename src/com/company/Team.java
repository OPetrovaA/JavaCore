package com.company;

/*
Homework_1
@author Petrova Olga
 */

class Team {
    private  String name;
    private Athlete[] peoples;

    Team (String name, Athlete[] peoples){
       this.name = name;
       this.peoples = peoples;
    }

    public String getName() {
        return name;
    }

    public Athlete[] getPeoples() {
        return peoples;
    }
}

class Athlete {
    private String name;
    private int age;
    private int weight;
    private int run_meters_per_sec; //running speed скорость бега метры в секунду
    private int m_jump_height; // высота прыжка, метры

    Athlete(String name, int age, int weight, int run_meters_per_sec, int m_jump_height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.run_meters_per_sec = run_meters_per_sec;
        this.m_jump_height = m_jump_height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getRun_meters_per_sec() {
        return run_meters_per_sec;
    }

    public int getM_jump_height() {
        return m_jump_height;
    }

    @Override
    public String toString() {
        return "Athlete:" + name + ", возраст:" + age + ", вес:" + weight + ", может пробежать " + run_meters_per_sec + "м в сек " + ", прыгает в высоту:" + m_jump_height + "m";
    }

    class Course {
        String result;
        private String title;
        private int fence_height; // высота забора
        private int dog_speed; // скорость собаки
        private int max_load; //максимальная нагрузка каната, тяжелые конкурс не пройдут, он коснется земли

        Course(String title, int fence_height, int dog_speed, int max_load) {
            this.title = title;
            this.fence_height = fence_height;
            this.dog_speed = dog_speed;
            this.max_load = max_load;
        }

        public int getFence_height() {
            return fence_height;
        }

        public int getDog_speed() {
            return dog_speed;
        }

        public int getMax_load() {
            return max_load;
        }

        public String getTitle() {
            return title;
        }

        public String ObstacleCourseStart(Team team) {
            result = "Команда: " + team.getName();
            for (Athlete athlete : team.getPeoples()) {
                result += "Участник: " + athlete.getName();
                int value1 = athlete.getM_jump_height();
                jumpOverTheFence(value1);
                // int value2 = athlete.getRun_meters_per_sec();
                //   dogEscape(value2);
                //   int value3 = athlete.getWeight();
                //    tightropeWalking(value3);
            }

            return result;
        }

        private String jumpOverTheFence(int value1) {
            if (value1 < fence_height) {
                System.out.println("Повис на заборе" + '\n');
            }
            //result += "Повис на заборе" + '\n';
            else {
                System.out.println("успех!" + '\n');
                //result "успех!";
            }
        }


       /* private String dogEscape(int value2) {
            if (value2 < max_load) {
                return "fail. ass bitten";
            } else {
                return "Success run";
            }

        }

        private String tightropeWalking(int value3) {
            if (value3 < dog_speed) {
                return "fail. ass bitten";
            } else {
                return "Success run";
            }
        }
    }

        */

        public class RunAthleteRun {
            public static void main(String[] args) {
                Athlete[] athletes = {
                        new Athlete("Maks", 22, 78, 6, 1),
                        new Athlete("Gera", 33, 67, 7, 2),
                        new Athlete("Tommi", 25, 80, 3, 1),
                        new Athlete("Anna", 28, 47, 7, 2),
                };

                for (Athlete athlete : athletes) {
                    System.out.println(athlete);
                }

                Team team = new Team("Успешный успех", athletes);

                Course[] course = {
                        new Course("dog escape", -1, 6, 0), // только скорость собаки
                        new Course("jump over the fence", 1, -1, 0), // значение высоты забора
                        new Course("tightrope walking", -1, -1, 79)
                };
                String result = Course.ObstacleCourseStart(team);
                System.out.println(result);
            }
        }
    }
}





