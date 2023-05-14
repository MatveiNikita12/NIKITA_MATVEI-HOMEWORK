package homework_nr_8;

interface Animal  {
    void voice();
    void move();

    default void eat(){
        System.out.println("it eating");
    }
    static int differenceInAge(int lastAge, int ageNow){
        return ageNow - lastAge;
    }
}


